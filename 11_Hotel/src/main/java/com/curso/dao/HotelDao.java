package com.curso.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {

	@Query("SELECT c FROM Hotel c WHERE c.nombre = :nombre")
	Hotel findByName(String nombre);

}
