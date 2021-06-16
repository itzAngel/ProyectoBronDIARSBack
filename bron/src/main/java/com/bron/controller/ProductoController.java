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

import com.bron.model.Categoria;
import com.bron.model.Producto;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/producto"})
public class ProductoController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Producto> listar(){
		return service.listarProducto();
	}
	
	@GetMapping("/listarxModelo/{modelo}")
	public List<Producto> listarxModelo(@PathVariable("modelo")String modelo){
		return service.listarProductoxModelo(modelo);
	}
	
	@GetMapping("/listarxCategoria")
	public List<Producto> listarxCategoria(@RequestBody Categoria categoria){
		return service.listarProductoxCategoria(categoria);
	}
	@PostMapping
	public Producto agregar(@RequestBody Producto p) {
		return service.addProducto(p);
	}
	
	@GetMapping("/{id}")
	public Producto listarId(@PathVariable("id")int id){
		return service.listarIdProducto(id);
	}
	@PutMapping
	public Producto editar(@RequestBody Producto p) {
		return service.editProducto(p);
	}
	@DeleteMapping("/{id}")
	public Producto delete(@PathVariable("id")int id) {
		return service.deleteProducto(id);
	}
}
