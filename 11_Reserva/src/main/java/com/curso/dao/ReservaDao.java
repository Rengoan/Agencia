package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Reserva;

/**
 * @author sinensia Juan Luis
 * Interfaz que define los métodos de acceso a datos para la entidad Reserva.
 */
public interface ReservaDao extends JpaRepository<Reserva, Integer> {

}

