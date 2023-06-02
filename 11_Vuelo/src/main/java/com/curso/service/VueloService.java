package com.curso.service;

import java.util.List;

import com.curso.modelo.Vuelo;

/**
 * @author sinensia Juan Luis
 * Interfaz que define los métodos de servicio para la entidad Vuelo.
 */
public interface VueloService {

    /**
     * Obtiene una lista de vuelos disponibles según el número de plazas requeridas.
     *
     * @param plazas el número de plazas requeridas
     * @return una lista de vuelos disponibles
     */
    List<Vuelo> disponibles(int plazas);

    /**
     * Actualiza el número de plazas reservadas para un vuelo específico.
     *
     * @param idVuelo      el ID del vuelo a actualizar
     * @param pReservadas  el número de plazas reservadas a establecer
     */
    void actualizarVuelo(int idVuelo, int pReservadas);
}

