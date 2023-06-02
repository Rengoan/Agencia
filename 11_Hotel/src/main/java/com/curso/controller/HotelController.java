package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author sinensia Juan Luis
 * Controlador REST para gestionar los endpoints relacionados con los hoteles.
 */
@RestController
public class HotelController {

	@Autowired
	HotelService service;

	/**
	 * Obtiene la lista de todos los hoteles.
	 *
	 * @return Lista de objetos Hotel en formato JSON.
	 */
	@ApiOperation(value="Obtiene la lista de todos los hoteles")
	@ApiResponses(value = {
		       @ApiResponse(
		         code = 200, message = "OK. El recurso se obtiene correctamente", response = Hotel.class ),
		       @ApiResponse(code = 404, message = "Método no permitido."),
		       @ApiResponse(code = 500, message = "Error inesperado del sistema")
		       })
	@GetMapping(value = "hoteles", produces = MediaType.APPLICATION_JSON_VALUE)//http://localhost:8500/hoteles
	public List<Hotel> hoteles() {
		return service.hoteles();
	}

	/**
	 * Busca un hotel por su nombre.
	 *
	 * @param nombre El nombre del hotel a buscar.
	 * @return El objeto Hotel encontrado en formato JSON, o null si no se encuentra
	 *         ningún hotel con el nombre especificado.
	 */
	@ApiOperation(value="Busca un hotel por su nombre")
	@GetMapping(value = "hoteles/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)//http://localhost:8500/hoteles/nombre
	public Hotel nombreHotel(@ApiParam(value="Nombre del hotel a buscar")@PathVariable String nombre) {
		Hotel h = new Hotel();
		h = service.buscarNombre(nombre);
		return h;
	}
}
