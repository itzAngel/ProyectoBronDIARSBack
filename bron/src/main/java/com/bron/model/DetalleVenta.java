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
@Table(name = "detalle_venta")
public class DetalleVenta implements Serializable{
	
	/** La Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private int id_detalle_venta;
	@Column
	private int cantidad;
	@Column
	private double precio;
	
	@ManyToOne()
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    private Venta venta;
	
	@ManyToOne()
    @JoinColumn(name = "id_asigna_producto_tienda", referencedColumnName = "id_asigna_producto_tienda")
    private AsignaProductoTienda asignaProductoTienda;

	public DetalleVenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleVenta(int id_detalle_venta, int cantidad, double precio, Venta venta,
			AsignaProductoTienda asignaProductoTienda) {
		super();
		this.id_detalle_venta = id_detalle_venta;
		this.cantidad = cantidad;
		this.precio = precio;
		this.venta = venta;
		this.asignaProductoTienda = asignaProductoTienda;
	}

	public int getId_detalle_venta() {
		return id_detalle_venta;
	}

	public void setId_detalle_venta(int id_detalle_venta) {
		this.id_detalle_venta = id_detalle_venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public AsignaProductoTienda getAsignaProductoTienda() {
		return asignaProductoTienda;
	}

	public void setAsignaProductoTienda(AsignaProductoTienda asignaProductoTienda) {
		this.asignaProductoTienda = asignaProductoTienda;
	}

}
