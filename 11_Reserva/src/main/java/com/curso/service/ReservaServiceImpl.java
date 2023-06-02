package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.model.HotelInfo;
import com.curso.model.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	ReservaDao dao;

	@Autowired
	RestTemplate restTemplate;
	String url = "http://localhost:8088/";
	String url2 = "http://localhost:8500/";

	@Override
	public void altaReserva(Reserva reserva) {

		dao.save(reserva);
		actualizarReserva(reserva.getIdvuelo(), reserva.getPersonasreserva());
	}

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

	private void actualizarReserva(int idvuelo, int preservadas) {
		restTemplate.put(url + "vuelos/{idvuelo}/{preservadas}", null, idvuelo, preservadas);
	}

	private HotelInfo obtenerNombreHotel(String nombre) {
		HotelInfo h = restTemplate.getForObject(url2 + "hoteles/{nombre}", HotelInfo.class, nombre);

		return h;
	}

}
