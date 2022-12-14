package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Articulo;

public interface IArticuloService {
	
	public List<Articulo> listarArticulos();
	
	public Articulo guardarArticulo(Articulo articulo);
	
	public Articulo articuloXID(Long codigo_articulo);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public void eliminarArticulo(Long codigo_articulo);
	
}
