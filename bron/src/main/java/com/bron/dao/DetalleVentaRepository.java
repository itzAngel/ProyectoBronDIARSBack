package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.DetalleVenta;

public interface DetalleVentaRepository extends Repository<DetalleVenta,Integer>{
	
	List<DetalleVenta> findAll();

	DetalleVenta findById(int id);

	DetalleVenta save(DetalleVenta p);

	void delete(DetalleVenta p);
}
