package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
	 * @param idreserva
	 * @param nombrecliente
	 * @param dni
	 * @param personasreserva
	 * @param idhotel
	 * @param idvuelo
	 */
	public Reserva(int idreserva, String nombrecliente, String dni, int personasreserva, int idhotel, int idvuelo) {
		super();
		this.idreserva = idreserva;
		this.nombrecliente = nombrecliente;
		this.dni = dni;
		this.personasreserva = personasreserva;
		this.idhotel = idhotel;
		this.idvuelo = idvuelo;
	}

	/**
	 * 
	 */
	public Reserva() {
		super();
	}

	/**
	 * @return the idreserva
	 */
	public int getIdreserva() {
		return idreserva;
	}

	/**
	 * @param idreserva the idreserva to set
	 */
	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	/**
	 * @return the nombrecliente
	 */
	public String getNombrecliente() {
		return nombrecliente;
	}

	/**
	 * @param nombrecliente the nombrecliente to set
	 */
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the personasreserva
	 */
	public int getPersonasreserva() {
		return personasreserva;
	}

	/**
	 * @param personasreserva the personasreserva to set
	 */
	public void setPersonasreserva(int personasreserva) {
		this.personasreserva = personasreserva;
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

}
