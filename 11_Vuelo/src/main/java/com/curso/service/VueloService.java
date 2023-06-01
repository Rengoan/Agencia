package com.curso.service;

import java.util.List;

import com.curso.modelo.Vuelo;

public interface VueloService {

	List<Vuelo> disponibles(int plazas);
	void actualizarVuelo(int idVuelo, int pReservadas);
}
