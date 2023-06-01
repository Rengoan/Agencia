package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

public interface ReservaService {

	void altaReserva(Reserva reserva);
	List<Reserva> reservas(String nombrehotel);
}
