package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Cliente;

public interface ClienteRepository extends Repository<Cliente, Integer> {

	List<Cliente> findAll();

	Cliente findById(int id);

	Cliente save(Cliente p);

	void delete(Cliente p);
}
