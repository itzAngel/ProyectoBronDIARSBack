package com.bron.dto;

import java.util.List;

import com.bron.model.DetalleProducto;
import com.bron.model.Producto;

public class ProductoDTO {
	private Producto producto;
	private List<DetalleProducto> listaDetalles;
	private int cantidadDetalles;
	
	public ProductoDTO() {
		super();
	}
	public ProductoDTO(Producto producto, List<DetalleProducto> listaDetalles, int cantidadDetalles) {
		super();
		this.producto = producto;
		this.listaDetalles = listaDetalles;
		this.cantidadDetalles = cantidadDetalles;
	}

	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public List<DetalleProducto> getListaDetalles() {
		return listaDetalles;
	}
	public void setListaDetalles(List<DetalleProducto> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}
	public int getCantidadDetalles() {
		return cantidadDetalles;
	}
	public void setCantidadDetalles(int cantidadDetalles) {
		this.cantidadDetalles = cantidadDetalles;
	}
	
}
