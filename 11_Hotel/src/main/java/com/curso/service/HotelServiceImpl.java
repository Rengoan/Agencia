package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelDao;
import com.curso.model.Hotel;

/**
 * @author sinensia Juan Luis
 * Implementación de la interfaz HotelService que proporciona funcionalidades relacionadas con los hoteles.
 */
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelDao dao;

	/**
	 * Obtiene la lista de todos los hoteles.
	 *
	 * @return Lista de objetos Hotel que representa todos los hoteles disponibles.
	 */
	@Override
	public List<Hotel> hoteles() {
		// Devuelve la lista de todos los hoteles
		return dao.findAll();
	}

	/**
	 * Busca un hotel por su nombre.
	 *
	 * @param nombre El nombre del hotel a buscar.
	 * @return El objeto Hotel encontrado con el nombre especificado, o null si no se encuentra ningún hotel con ese nombre.
	 */
	@Override
	public Hotel buscarNombre(String nombre) {
		// Busca un hotel por su nombre
		Hotel hotel = dao.findByName(nombre);

		return hotel;
	}
}
