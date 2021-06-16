package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Tienda;

public interface TiendaRepository extends Repository<Tienda, Integer>{
		
	List<Tienda> findAll();

	Tienda findById(int id);

	Tienda save(Tienda p);

	void delete(Tienda p);
}
