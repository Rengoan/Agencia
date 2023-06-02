package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.modelo.Vuelo;
import com.curso.service.VueloService;

/**
 * @author sinensia Juan Luis
 * Controlador REST que maneja las solicitudes relacionadas con los vuelos.
 */
@RestController
public class VueloController {

	@Autowired
	VueloService service;
	
	/**
	 * Obtiene la lista de vuelos disponibles para un número de plazas especificado.
	 *
	 * @param plazas El número de plazas requeridas.
	 * @return Lista de objetos Vuelo que representan los vuelos disponibles para el número de plazas especificado.
	 */
	@GetMapping(value="vuelos/{plazas}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelosDisponibles(@PathVariable int plazas){
		return service.disponibles(plazas);
	}
	
	/**
	 * Actualiza la cantidad de plazas disponibles para un vuelo específico.
	 *
	 * @param idvuelo     El ID del vuelo a actualizar.
	 * @param preservadas El número de plazas reservadas.
	 */
	@PutMapping(value="vuelos/{idvuelo}/{preservadas}")
	public void actualizarPlazas(@PathVariable int idvuelo, @PathVariable int preservadas){
		service.actualizarVuelo(idvuelo, preservadas);
	}
}

