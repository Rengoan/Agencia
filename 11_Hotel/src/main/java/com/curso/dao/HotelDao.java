package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Hotel;

/**
 * @author sinensia Juan Luis
 * Interfaz de acceso a datos para la entidad Hotel.
 */
public interface HotelDao extends JpaRepository<Hotel, Integer> {

    /**
     * Busca un hotel por su nombre.
     *
     * @param nombre el nombre del hotel a buscar
     * @return el hotel encontrado, o null si no se encuentra
     */
    @Query("SELECT c FROM Hotel c WHERE c.nombre = :nombre")
    Hotel findByName(String nombre);

}

