package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Venta;

public interface VentaRepository extends Repository<Venta,Integer>{
	
	List<Venta> findAll();

	Venta findById(int id);

	Venta save(Venta p);

	void delete(Venta p);
}
