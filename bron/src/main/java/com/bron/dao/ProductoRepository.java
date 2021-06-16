package com.bron.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.bron.model.Categoria;
import com.bron.model.Producto;

public interface ProductoRepository extends Repository<Producto,Integer>{
	
	List<Producto> findAll();
	
	List<Producto> findByModeloContaining(String nombre);
	
	//@Query("select c.id_categoria from categoria c inner join producto p on c.id_categoria=p.id_categoria where c.id_categoria= ?5")
	List<Producto> findByCategoria(Categoria categoria);

	Producto findById(int id);

	Producto save(Producto p);

	void delete(Producto p);
}
