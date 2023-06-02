package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sinensia Juan Luis
 * Clase que representa una reserva de hotel y vuelo.
 */
@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    private int idreserva;
    private String nombrecliente;
    private String dni;
    private int personasreserva;
    private int idhotel;
    private int idvuelo;

    /**
     * Constructor de la clase Reserva.
     *
     * @param idreserva      el ID de la reserva
     * @param nombrecliente  el nombre del cliente que realiza la reserva
     * @param dni            el DNI del cliente que realiza la reserva
     * @param personasreserva el número de personas para la reserva
     * @param idhotel        el ID del hotel reservado
     * @param idvuelo        el ID del vuelo reservado
     */
    public Reserva(int idreserva, String nombrecliente, String dni, int personasreserva, int idhotel, int idvuelo) {
        this.idreserva = idreserva;
        this.nombrecliente = nombrecliente;
        this.dni = dni;
        this.personasreserva = personasreserva;
        this.idhotel = idhotel;
        this.idvuelo = idvuelo;
    }

    /**
     * Constructor por defecto de la clase Reserva.
     */
    public Reserva() {
    }

    /**
     * Obtiene el ID de la reserva.
     *
     * @return el ID de la reserva
     */
    public int getIdreserva() {
        return idreserva;
    }

    /**
     * Establece el ID de la reserva.
     *
     * @param idreserva el ID de la reserva a establecer
     */
    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    /**
     * Obtiene el nombre del cliente que realiza la reserva.
     *
     * @return el nombre del cliente
     */
    public String getNombrecliente() {
        return nombrecliente;
    }

    /**
     * Establece el nombre del cliente que realiza la reserva.
     *
     * @param nombrecliente el nombre del cliente a establecer
     */
    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    /**
     * Obtiene el DNI del cliente que realiza la reserva.
     *
     * @return el DNI del cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del cliente que realiza la reserva.
     *
     * @param dni el DNI del cliente a establecer
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el número de personas para la reserva.
     *
     * @return el número de personas para la reserva
     */
    public int getPersonasreserva() {
        return personasreserva;
    }

    /**
     * Establece el número de personas para la reserva.
     *
     * @param personasreserva el número de personas a establecer
     */
    public void setPersonasreserva(int personasreserva) {
        this.personasreserva = personasreserva;
    }

    /**
     * Obtiene el ID del hotel reservado.
     *
     * @return el ID del hotel reservado
     */
    public int getIdhotel() {
        return idhotel;
    }

    /**
     * Establece el ID del hotel reservado.
     *
     * @param idhotel el ID del hotel a establecer
     */
    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }

    /**
     * Obtiene el ID del vuelo reservado.
     *
     * @return el ID del vuelo reservado
     */
    public int getIdvuelo() {
        return idvuelo;
    }

    /**
     * Establece el ID del vuelo reservado.
     *
     * @param idvuelo el ID del vuelo a establecer
     */
    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }
}
