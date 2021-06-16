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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable{
	
	
	/** La Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private int id_producto;
	@Column
	private String modelo;
	@Column
	private String genero;
	@Column
	private double precio;
	
	@ManyToOne()
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    private Categoria categoria;
	
	@Lob
	@Column
	private String foto;
	
	@OneToMany(mappedBy = "producto")
    private List<DetalleProducto> listaDetalleProducto = new ArrayList<>();
	
	@OneToMany(mappedBy = "producto")
    private List<Imagen> listaImagen = new ArrayList<>();

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Producto(int id_producto, String modelo, String genero, double precio, Categoria categoria) {
		super();
		this.id_producto = id_producto;
		this.modelo = modelo;
		this.genero = genero;
		this.precio = precio;
		this.categoria = categoria;
	}


	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//@JsonBackReference
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
