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

import com.bron.model.Queja;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/queja"})
public class QuejaController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Queja> listar(){
		return service.listarQueja();
	}
	@PostMapping
	public Queja agregar(@RequestBody Queja p) {
		return service.addQueja(p);
	}
	
	@GetMapping("/{id}")
	public Queja listarId(@PathVariable("id")int id){
		return service.listarIdQueja(id);
	}
	@PutMapping
	public Queja editar(@RequestBody Queja p) {
		return service.editQueja(p);
	}
	@DeleteMapping("/{id}")
	public Queja delete(@PathVariable("id")int id) {
		return service.deleteQueja(id);
	}
}
