package com.bron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tienda")
public class Tienda implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private int id_tienda;
	@Column
	private String nombre_tienda;
	@Column
	private String distrito;
	
	@ManyToOne()
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;
	
	@OneToMany(mappedBy = "tienda")
    private List<AsignaProductoTienda> listaAsignaProductoTienda = new ArrayList<>();

	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tienda(int id_tienda, String nombre_tienda, String distrito, Usuario usuario) {
		super();
		this.id_tienda = id_tienda;
		this.nombre_tienda = nombre_tienda;
		this.distrito = distrito;
		this.usuario = usuario;
	}

	public int getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}

	public String getNombre_tienda() {
		return nombre_tienda;
	}

	public void setNombre_tienda(String nombre_tienda) {
		this.nombre_tienda = nombre_tienda;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
