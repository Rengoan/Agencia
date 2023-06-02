package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.model.HotelInfo;
import com.curso.model.Reserva;

/**
 * @author sinensia Juan Luis
 * Implementación de la interfaz ReservaService que proporciona funcionalidades relacionadas con las reservas.
 */
@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	ReservaDao dao;

	@Autowired
	RestTemplate restTemplate;
	String url = "http://localhost:8088/";
	String url2 = "http://localhost:8500/";

	/**
	 * Registra una nueva reserva y actualiza las plazas disponibles del vuelo correspondiente.
	 *
	 * @param reserva La reserva a ser registrada.
	 */
	@Override
	public void altaReserva(Reserva reserva) {
		dao.save(reserva);
		actualizarReserva(reserva.getIdvuelo(), reserva.getPersonasreserva());
	}

	/**
	 * Obtiene la lista de reservas existentes para un hotel específico.
	 *
	 * @param nombrehotel El nombre del hotel para el cual se desea obtener las reservas.
	 * @return Lista de objetos Reserva que representa las reservas para el hotel especificado.
	 */
	@Override
	public List<Reserva> reservas(String nombrehotel) {
		List<Reserva> reservas = new ArrayList<>();
		List<Reserva> todasReservas = dao.findAll();
		HotelInfo hotelInfo = obtenerNombreHotel(nombrehotel);

		if (hotelInfo != null && hotelInfo.getNombre() != null) {
			int idHotel = hotelInfo.getIdhotel();

			for (Reserva reserva : todasReservas) {
				if (reserva.getIdhotel() == idHotel) {
					reservas.add(reserva);
				}
			}
		} else {
			// Manejar caso de hotel no encontrado
		}

		return reservas;
	}

	/**
	 * Actualiza las plazas reservadas de un vuelo.
	 *
	 * @param idvuelo     El ID del vuelo que se desea actualizar.
	 * @param preservadas La cantidad de plazas reservadas a ser actualizadas.
	 */
	private void actualizarReserva(int idvuelo, int preservadas) {
		restTemplate.put(url + "vuelos/{idvuelo}/{preservadas}", null, idvuelo, preservadas);
	}

	/**
	 * Obtiene la información del hotel a partir de su nombre.
	 *
	 * @param nombre El nombre del hotel del cual se desea obtener la información.
	 * @return El objeto HotelInfo que contiene la información del hotel correspondiente al nombre especificado.
	 */
	private HotelInfo obtenerNombreHotel(String nombre) {
		HotelInfo h = restTemplate.getForObject(url2 + "hoteles/{nombre}", HotelInfo.class, nombre);

		return h;
	}
}

