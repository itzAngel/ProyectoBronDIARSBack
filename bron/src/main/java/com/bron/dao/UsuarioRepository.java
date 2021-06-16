package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Usuario;

public interface UsuarioRepository extends Repository<Usuario, Integer>{
	
	List<Usuario> findAll();

	Usuario findById(int id);

	Usuario save(Usuario p);

	void delete(Usuario p);
}
