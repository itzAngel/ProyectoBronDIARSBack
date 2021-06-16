package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Contacto;

public interface ContactoRepository extends Repository<Contacto,Integer>{
	
	List<Contacto> findAll();

	Contacto findById(int id);

	Contacto save(Contacto p);

	void delete(Contacto p);
}
