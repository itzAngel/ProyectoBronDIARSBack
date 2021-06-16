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

import com.bron.model.Cliente;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/cliente"})
public class ClienteController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Cliente> listar(){
		return service.listarCliente();
	}
	
	@GetMapping("/login/{user}/{pass}")
	public Cliente auth(@PathVariable("user")String user,@PathVariable("pass")String pass){
		return service.authCliente(user,pass);
	}
	
	@PostMapping
	public Cliente agregar(@RequestBody Cliente p) {
		return service.addCliente(p);
	}
	
	@GetMapping("/{id}")
	public Cliente listarId(@PathVariable("id")int id){
		return service.listarIdCliente(id);
	}
	@PutMapping
	public Cliente editar(@RequestBody Cliente p) {
		return service.editCliente(p);
	}
	@DeleteMapping("/{id}")
	public Cliente delete(@PathVariable("id")int id) {
		return service.deleteCliente(id);
	}
}
