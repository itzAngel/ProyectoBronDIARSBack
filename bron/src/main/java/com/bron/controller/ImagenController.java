package com.bron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bron.model.Imagen;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/imagen"})
public class ImagenController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Imagen> listar(){
		return service.listarImagen();
	}
	@GetMapping("/obtenerlistaporid/{id}")
	public List<Imagen> obtenerlistaporid(@PathVariable("id")int id){
		return service.getListaImagenporIdProducto(id);
	}
	@PostMapping
	public Imagen agregar(@RequestBody Imagen p) {
		return service.addImagen(p);
	}
	
	@GetMapping("/{id}")
	public Imagen listarId(@PathVariable("id")int id){
		return service.listarIdImagen(id);
	}
	@DeleteMapping("/{id}")
	public Imagen delete(@PathVariable("id")int id) {
		return service.deleteImagen(id);
	}
}
