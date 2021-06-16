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

import com.bron.model.DetalleVenta;
import com.bron.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/detalleventa"})
public class DetalleVentaController {
	@Autowired
	BronService service;
	
	@GetMapping
	public List<DetalleVenta> listar(){
		return service.listarDetalleVenta();
	}
	@GetMapping("/obtenerlistaporid/{id}")
	public List<DetalleVenta> obtenerlistaporid(@PathVariable("id")int id){
		return service.getListaporIdVenta(id);
	}
	@PostMapping
	public DetalleVenta agregar(@RequestBody DetalleVenta p) {
		return service.addDetalleVenta(p);
	}
	
	@GetMapping("/{id}")
	public DetalleVenta listarId(@PathVariable("id")int id){
		return service.listarIdDetalleVenta(id);
	}
	@PutMapping
	public DetalleVenta editar(@RequestBody DetalleVenta p) {
		return service.editDetalleVenta(p);
	}
	@DeleteMapping("/{id}")
	public DetalleVenta delete(@PathVariable("id")int id) {
		return service.deleteDetalleVenta(id);
	}
}
