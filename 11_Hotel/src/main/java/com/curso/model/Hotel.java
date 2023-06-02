package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sinensia Juan Luis
 * Clase que representa un hotel.
 */
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
	 * Constructor de la clase Hotel.
	 *
	 * @param idhotel     el ID del hotel
	 * @param nombre      el nombre del hotel
	 * @param categoria   la categoría del hotel
	 * @param precio      el precio del hotel
	 * @param disponible indica si el hotel está disponible o no
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
	 * Constructor por defecto de la clase Hotel.
	 */
	public Hotel() {
		super();
	}

	/**
	 * Obtiene el ID del hotel.
	 *
	 * @return el ID del hotel
	 */
	public int getIdhotel() {
		return idhotel;
	}

	/**
	 * Establece el ID del hotel.
	 *
	 * @param idhotel el ID del hotel a establecer
	 */
	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}

	/**
	 * Obtiene el nombre del hotel.
	 *
	 * @return el nombre del hotel
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del hotel.
	 *
	 * @param nombre el nombre del hotel a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la categoría del hotel.
	 *
	 * @return la categoría del hotel
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * Establece la categoría del hotel.
	 *
	 * @param categoria la categoría del hotel a establecer
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * Obtiene el precio del hotel.
	 *
	 * @return el precio del hotel
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del hotel.
	 *
	 * @param precio el precio del hotel a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Verifica si el hotel está disponible.
	 *
	 * @return true si el hotel está disponible, false en caso contrario
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * Establece la disponibilidad del hotel.
	 *
	 * @param disponible true si el hotel está disponible, false en caso contrario
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
