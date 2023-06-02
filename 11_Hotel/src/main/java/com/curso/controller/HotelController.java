package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

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
	@GetMapping(value = "hoteles/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)//http://localhost:8500/hoteles/nombre
	public Hotel nombreHotel(@PathVariable String nombre) {
		Hotel h = new Hotel();
		h = service.buscarNombre(nombre);
		return h;
	}
}
