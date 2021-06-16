package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.AsignaProductoTienda;

public interface AsignaProductoTiendaRepository extends Repository<AsignaProductoTienda,Integer>{
	
	List<AsignaProductoTienda> findAll();

	AsignaProductoTienda findById(int id);

	AsignaProductoTienda save(AsignaProductoTienda p);

	void delete(AsignaProductoTienda p);
}
