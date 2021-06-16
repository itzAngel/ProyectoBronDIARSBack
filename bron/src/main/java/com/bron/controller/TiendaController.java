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

import com.bron.model.Tienda;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/tienda"})
public class TiendaController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Tienda> listar(){
		return service.listarTienda();
	}
	@PostMapping
	public Tienda agregar(@RequestBody Tienda p) {
		return service.addTienda(p);
	}
	
	@GetMapping("/{id}")
	public Tienda listarId(@PathVariable("id")int id){
		return service.listarIdTienda(id);
	}
	@PutMapping
	public Tienda editar(@RequestBody Tienda p) {
		return service.editTienda(p);
	}
	@DeleteMapping("/{id}")
	public Tienda delete(@PathVariable("id")int id) {
		return service.deleteTienda(id);
	}
}
