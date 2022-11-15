package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Fabricante;

public interface IFabricanteService {
	
	public List<Fabricante> listarFabricantes();
	
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public Fabricante fabricanteXID(Long codigo_fabricante);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void eliminarFabricante(Long codigo_fabricante);
	
}
