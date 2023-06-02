package com.curso.model;

/**
 * @author sinensia Juan Luis
 * Clase que representa la información de un hotel.
 */
public class HotelInfo {

    private int idhotel;
    private String nombre;
    private int categoria;
    private double precio;
    private boolean disponible;

    /**
     * Constructor de la clase HotelInfo.
     *
     * @param idhotel     el ID del hotel
     * @param nombre      el nombre del hotel
     * @param categoria   la categoría del hotel
     * @param precio      el precio del hotel
     * @param disponible  la disponibilidad del hotel
     */
    public HotelInfo(int idhotel, String nombre, int categoria, double precio, boolean disponible) {
        this.idhotel = idhotel;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    /**
     * Constructor por defecto de la clase HotelInfo.
     */
    public HotelInfo() {
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
     * Verifica la disponibilidad del hotel.
     *
     * @return true si el hotel está disponible, false de lo contrario
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Establece la disponibilidad del hotel.
     *
     * @param disponible la disponibilidad del hotel a establecer
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
