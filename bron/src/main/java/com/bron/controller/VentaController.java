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

import com.bron.model.Venta;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/venta"})
public class VentaController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Venta> listar(){
		return service.listarVenta();
	}
	@PostMapping
	public Venta agregar(@RequestBody Venta p) {
		return service.addVenta(p);
	}
	
	@GetMapping("/listarxCliente/{id}")
	public List<Venta> listarxCliente(@PathVariable("id")int id){
		return service.getListaVentaporIdCliente(id);
	}
	
	@GetMapping("/{id}")
	public Venta listarId(@PathVariable("id")int id){
		return service.listarIdVenta(id);
	}
	@PutMapping
	public Venta editar(@RequestBody Venta p) {
		return service.editVenta(p);
	}
	@DeleteMapping("/{id}")
	public Venta delete(@PathVariable("id")int id) {
		return service.deleteVenta(id);
	}
}
