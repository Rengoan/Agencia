package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	private int idhotel;
	private String nombre;
	private int categoria;
	private double precio;
	private boolean disponible;

	/**
	 * @param idhotel
	 * @param nombre
	 * @param categoria
	 * @param precio
	 * @param disponible
	 */
	public Hotel(int idhotel, String nombre, int categoria, double precio, boolean disponible) {
		super();
		this.idhotel = idhotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	/**
	 * 
	 */
	public Hotel() {
		super();
	}

	/**
	 * @return the idhotel
	 */
	public int getIdhotel() {
		return idhotel;
	}

	/**
	 * @param idhotel the idhotel to set
	 */
	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
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
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
