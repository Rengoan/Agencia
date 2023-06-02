package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.modelo.Vuelo;

/**
 * @author sinensia Juan Luis
 * Interfaz que define los métodos de acceso a datos para la entidad Vuelo.
 */
public interface VueloDao extends JpaRepository<Vuelo, Integer> {

}

