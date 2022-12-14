package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFabricanteDAO;
import com.crud.h2.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {
	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Long codigo_fabricante) {
		
		return iFabricanteDAO.findById(codigo_fabricante).get();
	}
	

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long codigo_fabricante) {
		
		iFabricanteDAO.deleteById(codigo_fabricante);
		
	}
}
