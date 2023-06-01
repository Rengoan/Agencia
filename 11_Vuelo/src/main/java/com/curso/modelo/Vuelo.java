package com.curso.modelo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
	 * @param idvuelo
	 * @param compania
	 * @param fechavuelo
	 * @param precio
	 * @param pdisponibles
	 */
	public Vuelo(int idvuelo, String compania, Date fechavuelo, double precio, int pdisponibles) {
		super();
		this.idvuelo = idvuelo;
		this.compania = compania;
		this.fechavuelo = fechavuelo;
		this.precio = precio;
		this.pdisponibles = pdisponibles;
	}

	/**
	 * 
	 */
	public Vuelo() {
		super();
	}

	/**
	 * @return the idvuelo
	 */
	public int getIdvuelo() {
		return idvuelo;
	}

	/**
	 * @param idvuelo the idvuelo to set
	 */
	public void setIdvuelo(int idvuelo) {
		this.idvuelo = idvuelo;
	}

	/**
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}

	/**
	 * @param compania the compania to set
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}

	/**
	 * @return the fechavuelo
	 */
	public Date getFechavuelo() {
		return fechavuelo;
	}

	/**
	 * @param fechavuelo the fechavuelo to set
	 */
	public void setFechavuelo(Date fechavuelo) {
		this.fechavuelo = fechavuelo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the pdisponibles
	 */
	public int getPdisponibles() {
		return pdisponibles;
	}

	/**
	 * @param pdisponibles the pdisponibles to set
	 */
	public void setPdisponibles(int pdisponibles) {
		this.pdisponibles = pdisponibles;
	}

}
