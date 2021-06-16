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

import com.bron.model.AsignaProductoTienda;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/asignaproductotienda"})
public class AsignaProductoTiendaController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<AsignaProductoTienda> listar(){
		return service.listarAsignaProductoTienda();
	}
	@GetMapping("/obtenerlistaporid/{id}")
	public List<AsignaProductoTienda> obtenerlistaporid(@PathVariable("id")int id){
		return service.getListaporIdTienda(id);
	}
	@GetMapping("/obtenerlistaporidDetalleProducto/{id}")
	public List<AsignaProductoTienda> obtenerlistaporidDetalleProducto(@PathVariable("id")int id){
		return service.getListaAsignaporIdDetalleProducto(id);
	}
	@PostMapping
	public AsignaProductoTienda agregar(@RequestBody AsignaProductoTienda p) {
		return service.addAsignaProductoTienda(p);
	}
	
	@GetMapping("/{id}")
	public AsignaProductoTienda listarId(@PathVariable("id")int id){
		return service.listarIdAsignaProductoTienda(id);
	}
	@PutMapping
	public AsignaProductoTienda editar(@RequestBody AsignaProductoTienda p) {
		return service.editAsignaProductoTienda(p);
	}
	@DeleteMapping("/{id}")
	public AsignaProductoTienda delete(@PathVariable("id")int id) {
		return service.deleteAsignaProductoTienda(id);
	}
}
