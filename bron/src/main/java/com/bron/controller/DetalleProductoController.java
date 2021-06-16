package com.bron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bron.model.DetalleProducto;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/detalleproducto"})
public class DetalleProductoController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<DetalleProducto> listar(){
		return service.listarDetalleProducto();
	}
	@GetMapping("/obtenerlistaporid/{id}")
	public List<DetalleProducto> obtenerlistaporid(@PathVariable("id")int id){
		return service.getListaporIdProducto(id);
	}
	@PostMapping
	public DetalleProducto agregar(@RequestBody DetalleProducto p) {
		return service.addDetalleProducto(p);
	}
	
	@GetMapping("/{id}")
	public DetalleProducto listarId(@PathVariable("id")int id){
		return service.listarIdDetalleProducto(id);
	}
	@PutMapping
	public DetalleProducto editar(@RequestBody DetalleProducto p) {
		return service.editDetalleProducto(p);
	}
	@DeleteMapping("/{id}")
	public DetalleProducto delete(@PathVariable("id")int id) {
		return service.deleteDetalleProducto(id);
	}
}
