package com.curso.service;

import java.util.List;

import com.curso.modelo.Vuelo;

public interface VueloService {

	List<Vuelo> disponibles(int plazas);
	Vuelo actualizarVuelo(int idVuelo, int pReservadas);
}
