package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VueloDao;
import com.curso.modelo.Vuelo;

/**
 * @author sinensia Juan Luis
 * Implementación del servicio de vuelos que proporciona la lógica de negocio relacionada con los vuelos.
 */
@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
	VueloDao dao;

	/**
	 * Obtiene la lista de vuelos disponibles para un número de plazas especificado.
	 *
	 * @param plazas El número de plazas requeridas.
	 * @return Lista de objetos Vuelo que representan los vuelos disponibles para el número de plazas especificado.
	 */
	@Override
	public List<Vuelo> disponibles(int plazas) {
		List<Vuelo> vuelosDisponibles = new ArrayList<>();

		List<Vuelo> todosLosVuelos = dao.findAll();

		for (Vuelo vuelo : todosLosVuelos) {
			if (vuelo.getPdisponibles() >= plazas) {
				vuelosDisponibles.add(vuelo);
			}
		}

		return vuelosDisponibles;
	}

	/**
	 * Actualiza la cantidad de plazas disponibles para un vuelo específico después de realizar una reserva.
	 *
	 * @param idVuelo     El ID del vuelo a actualizar.
	 * @param pReservadas El número de plazas reservadas.
	 * @throws RuntimeException Si no hay suficientes plazas disponibles para realizar la reserva o si no se encuentra el vuelo con el ID especificado.
	 */
	@Override
	public void actualizarVuelo(int idVuelo, int pReservadas) throws RuntimeException {
		Optional<Vuelo> optionalVuelo = dao.findById(idVuelo);
		if (optionalVuelo.isPresent()) {
			Vuelo vuelo = optionalVuelo.get();
			int plazasDisponibles = vuelo.getPdisponibles();

			if (plazasDisponibles >= pReservadas) {
				vuelo.setPdisponibles(plazasDisponibles - pReservadas);
				dao.save(vuelo);
			} else {
				throw new RuntimeException("No hay suficientes plazas disponibles para realizar la reserva.");
			}
		} else {
			throw new RuntimeException("No se encontró el vuelo con el ID especificado.");
		}
	}

}

