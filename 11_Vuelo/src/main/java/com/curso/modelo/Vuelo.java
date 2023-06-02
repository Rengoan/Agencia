package com.curso.modelo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sinensia Juan Luis
 * Clase que representa un vuelo.
 */
@Entity
@Table(name = "vuelo")
public class Vuelo {

    @Id
    private int idvuelo;
    private String compania;
    private Date fechavuelo;
    private double precio;
    private int pdisponibles;

    /**
     * Constructor de la clase Vuelo.
     *
     * @param idvuelo      el ID del vuelo
     * @param compania     la compañía del vuelo
     * @param fechavuelo   la fecha del vuelo
     * @param precio       el precio del vuelo
     * @param pdisponibles el número de asientos disponibles del vuelo
     */
    public Vuelo(int idvuelo, String compania, Date fechavuelo, double precio, int pdisponibles) {
        this.idvuelo = idvuelo;
        this.compania = compania;
        this.fechavuelo = fechavuelo;
        this.precio = precio;
        this.pdisponibles = pdisponibles;
    }

    /**
     * Constructor por defecto de la clase Vuelo.
     */
    public Vuelo() {
    }

    /**
     * Obtiene el ID del vuelo.
     *
     * @return el ID del vuelo
     */
    public int getIdvuelo() {
        return idvuelo;
    }

    /**
     * Establece el ID del vuelo.
     *
     * @param idvuelo el ID del vuelo a establecer
     */
    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    /**
     * Obtiene la compañía del vuelo.
     *
     * @return la compañía del vuelo
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Establece la compañía del vuelo.
     *
     * @param compania la compañía del vuelo a establecer
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * Obtiene la fecha del vuelo.
     *
     * @return la fecha del vuelo
     */
    public Date getFechavuelo() {
        return fechavuelo;
    }

    /**
     * Establece la fecha del vuelo.
     *
     * @param fechavuelo la fecha del vuelo a establecer
     */
    public void setFechavuelo(Date fechavuelo) {
        this.fechavuelo = fechavuelo;
    }

    /**
     * Obtiene el precio del vuelo.
     *
     * @return el precio del vuelo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del vuelo.
     *
     * @param precio el precio del vuelo a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el número de asientos disponibles del vuelo.
     *
     * @return el número de asientos disponibles del vuelo
     */
    public int getPdisponibles() {
        return pdisponibles;
    }

    /**
     * Establece el número de asientos disponibles del vuelo.
     *
     * @param pdisponibles el número de asientos disponibles del vuelo a establecer
     */
    public void setPdisponibles(int pdisponibles) {
        this.pdisponibles = pdisponibles;
    }
}
