package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VueloDao;
import com.curso.modelo.Vuelo;

@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
	VueloDao dao;

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

	@Override
	public void actualizarVuelo(int idVuelo, int pReservadas) {
		Optional<Vuelo> optionalVuelo = dao.findById(idVuelo);
		if (optionalVuelo.isPresent()) {
			Vuelo vuelo = optionalVuelo.get();
			int plazasDisponibles = vuelo.getPdisponibles();

			if (plazasDisponibles >= pReservadas) {
				vuelo.setPdisponibles(plazasDisponibles - pReservadas);
				dao.save(vuelo);
			} else {
				// No hay suficientes plazas disponibles para reservar
				throw new RuntimeException("No hay suficientes plazas disponibles para realizar la reserva.");
			}
		} else {
			// No se encontró el vuelo
			throw new RuntimeException("No se encontró el vuelo con el ID especificado.");
		}
	}

}
