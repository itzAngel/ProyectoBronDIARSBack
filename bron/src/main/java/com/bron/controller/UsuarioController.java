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

import com.bron.model.Usuario;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/usuario"})
public class UsuarioController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Usuario> listar(){
		return service.listarUsuario();
	}
	
	@GetMapping("/login/{user}/{pass}")
	public Usuario auth(@PathVariable("user")String user,@PathVariable("pass")String pass){
		return service.auth(user,pass);
	}
	
	@PostMapping
	public Usuario agregar(@RequestBody Usuario p) {
		return service.addUsuario(p);
	}
	
	@GetMapping("/{id}")
	public Usuario listarId(@PathVariable("id")int id){
		return service.listarIdUsuario(id);
	}
	@PutMapping
	public Usuario editar(@RequestBody Usuario p) {
		return service.editUsuario(p);
	}
	@DeleteMapping("/{id}")
	public Usuario delete(@PathVariable("id")int id) {
		return service.deleteUsuario(id);
	}
}
