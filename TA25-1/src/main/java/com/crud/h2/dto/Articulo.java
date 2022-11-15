package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="articulos")
public class Articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_articulo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="fabricante")
    private Fabricante fabricante;
	
	public Articulo() {
		
	}

	/**
	 * @param codigo_articulo
	 * @param nombre
	 * @param precio
	 * @param fabricante
	 */
	public Articulo(Long codigo_articulo, String nombre, int precio, Fabricante fabricante) {
		//super();
		this.codigo_articulo = codigo_articulo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_articulo
	 */
	public Long codigo_articulo() {
		return codigo_articulo;
	}

	/**
	 * @param codigo_articulo
	 */
	public void setId(Long codigo_articulo) {
		this.codigo_articulo = codigo_articulo;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * @return fabricante
	 */
	public Fabricante getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante
	 */
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Articulo [codigo_articulo=" + codigo_articulo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}
}
