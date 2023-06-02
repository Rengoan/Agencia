package com.curso.dao;

/**
 * 
 * @author sinensia Juan Luis
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {
/**
 * Metodo personalizado para buscar un hotel por nombre
 * @param nombre parametro para buscar por nombre
 * @return
 */
	@Query("SELECT c FROM Hotel c WHERE c.nombre = :nombre")
	Hotel findByName(String nombre);

}
