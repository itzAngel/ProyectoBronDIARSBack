package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Queja;

public interface QuejaRepository extends Repository<Queja,Integer>{
	
	List<Queja> findAll();

	Queja findById(int id);

	Queja save(Queja p);

	void delete(Queja p);
}
