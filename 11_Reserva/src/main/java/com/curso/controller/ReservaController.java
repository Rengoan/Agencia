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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author sinensia Juan Luis
 * Controlador que gestiona las peticiones relacionadas con las reservas.
 */
@RestController
public class ReservaController {

	@Autowired
	ReservaService service;

	/**
	 * Crea una nueva reserva.
	 *
	 * @param reserva La reserva a ser creada.
	 */
	@ApiOperation(value="Registra una nueva reserva y actualiza las plazas disponibles del vuelo")
	@ApiResponses(value = {
		       @ApiResponse(
		         code = 200, message = "OK. El recurso se obtiene correctamente", response = Reserva.class ),
		       @ApiResponse(code = 404, message = "Método no permitido."),
		       @ApiResponse(code = 500, message = "Error inesperado del sistema")
		       })
	@PostMapping(value = "reservas", consumes = MediaType.APPLICATION_JSON_VALUE)//http://localhost:9090/reservas
	public void altaReserva(@RequestBody Reserva reserva) {
		service.altaReserva(reserva);
	}

	/**
	 * Obtiene las reservas existentes para un hotel específico.
	 *
	 * @param nombrehotel El nombre del hotel para el cual se desea obtener las reservas.
	 * @return Lista de objetos Reserva que representa las reservas para el hotel especificado.
	 */
	@ApiOperation(value="Obtiene las reservas existentes para un hotel especifico")
	@GetMapping(value = "reservas/{nombrehotel}", produces = MediaType.APPLICATION_JSON_VALUE)//http://localhost:9090/reservas/nombrehotel
	public List<Reserva> reservaHotel(@ApiParam(value="Nombre del hotel a buscar")@PathVariable String nombrehotel) {
		return service.reservas(nombrehotel);
	}
}

