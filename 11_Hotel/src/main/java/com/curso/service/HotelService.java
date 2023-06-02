package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;



/**
 * @author sinensia Juan Luis
 * Interfaz que define los métodos para el servicio de hoteles.
 */
public interface HotelService {

    /**
     * Obtiene la lista de todos los hoteles.
     *
     * @return la lista de hoteles
     */
    List<Hotel> hoteles();

    /**
     * Busca un hotel por su nombre.
     *
     * @param nombre el nombre del hotel a buscar
     * @return el hotel encontrado, o null si no se encuentra
     */
    Hotel buscarNombre(String nombre);
}

