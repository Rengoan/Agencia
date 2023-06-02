package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

/**
 * @author sinensia Juan Luis
 * Interfaz que define los métodos de servicio para las reservas.
 */
public interface ReservaService {

    /**
     * Realiza el alta de una reserva.
     *
     * @param reserva la reserva a dar de alta
     */
    void altaReserva(Reserva reserva);

    /**
     * Obtiene una lista de reservas asociadas a un hotel por nombre.
     *
     * @param nombrehotel el nombre del hotel
     * @return una lista de reservas asociadas al hotel
     */
    List<Reserva> reservas(String nombrehotel);
}

