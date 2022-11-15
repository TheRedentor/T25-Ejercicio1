package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Articulo;
import com.crud.h2.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}
	
	
	@PostMapping("/articulos")
	public Articulo salvarArticulo(Articulo articulo) {
		
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	
	@GetMapping("/articulos/{codigo_articulo}")
	public Articulo articuloXID(@PathVariable(name="codigo_articulo") Long codigo_articulo) {
		
		Articulo articulo_xid= new Articulo();
		
		articulo_xid=articuloServiceImpl.articuloXID(codigo_articulo);
		
		System.out.println("Articulo XID: "+articulo_xid);
		
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{codigo_articulo}")
	public Articulo actualizarArticulo(@PathVariable(name="codigo_articulo")Long codigo_articulo,Articulo articulo) {
		
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
		
		articulo_seleccionado= articuloServiceImpl.articuloXID(codigo_articulo);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{codigo_articulo}")
	public void eliminarArticulo(@PathVariable(name="codigo_articulo")Long codigo_articulo) {
		articuloServiceImpl.eliminarArticulo(codigo_articulo);
	}
}
