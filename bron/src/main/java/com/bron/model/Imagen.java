package com.bron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "imagen")
public class Imagen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_imagen;
	
	@ManyToOne()
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;
	
	@Lob
	@Column
	private String base64;
	
	@Column
	private String contentType;

	public Imagen() {
		super();
	}

	public Imagen(int id_imagen, Producto producto, String base64, String contentType) {
		super();
		this.id_imagen = id_imagen;
		this.producto = producto;
		this.base64 = base64;
		this.contentType = contentType;
	}

	public int getId_imagen() {
		return id_imagen;
	}

	public void setId_imagen(int id_imagen) {
		this.id_imagen = id_imagen;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
