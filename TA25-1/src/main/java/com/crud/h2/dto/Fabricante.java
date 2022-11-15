package com.crud.h2.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="fabricantes")
public class Fabricante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_fabricante;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="codigo_fabricante")
    private List<Articulo> articulo;
	
	public Fabricante() {
		
	}

	/**
	 * @param codigo_fabricante
	 * @param nombre
	 */
	public Fabricante(Long codigo_fabricante, String nombre) {
		//super();
		this.codigo_fabricante = codigo_fabricante;
		this.nombre = nombre;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_fabricante
	 */
	public Long getId() {
		return codigo_fabricante;
	}

	/**
	 * @param codigo_fabricante
	 */
	public void setId(Long codigo_fabricante) {
		this.codigo_fabricante = codigo_fabricante;
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

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Fabricante [codigo_fabricante=" + codigo_fabricante + ", nombre=" + nombre + "]";
	}
}
