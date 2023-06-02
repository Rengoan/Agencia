package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reserva;
import com.curso.service.ReservaService;

@RestController
public class ReservaController {

	@Autowired
	ReservaService service;

	//http://localhost:9090/reservas
	@PostMapping(value = "reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaReserva(@RequestBody Reserva reserva) {
		service.altaReserva(reserva);
	}

	//http://localhost:9090/reservas/nombrehotel
	@GetMapping(value = "reservas/{nombrehotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> reservaHotel(@PathVariable String nombrehotel) {

		return service.reservas(nombrehotel);
	}

}
