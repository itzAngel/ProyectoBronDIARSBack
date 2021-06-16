package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Categoria;

public interface CategoriaRepository extends Repository<Categoria, Integer>{
		
	List<Categoria> findAll();

	Categoria findById(int id);

	Categoria save(Categoria p);

	void delete(Categoria p);
}
