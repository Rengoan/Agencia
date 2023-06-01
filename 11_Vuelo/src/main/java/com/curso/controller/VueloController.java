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

@RestController
public class VueloController {

	@Autowired
	VueloService service;
	
	@GetMapping(value="vuelos/{plazas}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelosDisponibles(@PathVariable int plazas){
		return service.disponibles(plazas);
	}
	
	@PutMapping(value="vuelos/{idvuelo}/{preservadas}")
	public Vuelo actualizarPlazas(@PathVariable int idvuelo, @PathVariable int preservadas){
		return service.actualizarVuelo(idvuelo, preservadas);
	}
}
