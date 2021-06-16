package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Imagen;

public interface ImagenRepository extends Repository<Imagen,Integer>{
	List<Imagen> findAll();

	Imagen findById(int id);

	Imagen save(Imagen p);

	void delete(Imagen p);
}
