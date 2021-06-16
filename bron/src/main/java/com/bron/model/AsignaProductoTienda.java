package com.bron.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asigna_producto_tienda")
public class AsignaProductoTienda implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_asigna_producto_tienda;
    
	@ManyToOne()
    @JoinColumn(name = "id_detalle_producto", referencedColumnName = "id_detalle_producto")
    private DetalleProducto detalleProducto;
	
	@ManyToOne()
    @JoinColumn(name = "id_tienda", referencedColumnName = "id_tienda")
    private Tienda tienda;
	
	@Column
	private int cantidad;

	public AsignaProductoTienda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AsignaProductoTienda(int id_asigna_producto_tienda, DetalleProducto detalleProducto, Tienda tienda,
			int cantidad) {
		super();
		this.id_asigna_producto_tienda = id_asigna_producto_tienda;
		this.detalleProducto = detalleProducto;
		this.tienda = tienda;
		this.cantidad = cantidad;
	}

	public int getId_asigna_producto_tienda() {
		return id_asigna_producto_tienda;
	}

	public void setId_asigna_producto_tienda(int id_asigna_producto_tienda) {
		this.id_asigna_producto_tienda = id_asigna_producto_tienda;
	}

	public DetalleProducto getDetalleProducto() {
		return detalleProducto;
	}

	public void setDetalleProducto(DetalleProducto detalleProducto) {
		this.detalleProducto = detalleProducto;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
