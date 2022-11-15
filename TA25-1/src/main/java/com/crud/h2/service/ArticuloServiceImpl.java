package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IArticuloDAO;
import com.crud.h2.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {
	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long codigo_articulo) {
		
		return iArticuloDAO.findById(codigo_articulo).get();
	}
	

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long codigo_articulo) {
		
		iArticuloDAO.deleteById(codigo_articulo);
		
	}
}
