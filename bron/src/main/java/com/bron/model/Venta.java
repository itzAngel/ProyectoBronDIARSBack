package com.bron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "venta")
public class Venta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private int id_venta;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date fecha_venta;
	
	@Column
	private double precio_total;
	
	@ManyToOne()
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;
	
	@Column
	private String direccion;
	
	@Column
	private String nombre_persona_recibe;
	
	@Column
	private String apellido_persona_recibe;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date fecha_entrega;
	
	@Column
	private String metodo_pago;
	
	@Column
	private String comprobante_pago;
	
	@OneToMany(mappedBy = "venta")
    private List<DetalleVenta> listaDetalleVenta = new ArrayList<>();
	
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(int id_venta, Date fecha_venta, double precio_total, Cliente cliente) {
		super();
		this.id_venta = id_venta;
		this.fecha_venta = fecha_venta;
		this.precio_total = precio_total;
		this.cliente = cliente;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public double getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(double precio_total) {
		this.precio_total = precio_total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre_persona_recibe() {
		return nombre_persona_recibe;
	}

	public void setNombre_persona_recibe(String nombre_persona_recibe) {
		this.nombre_persona_recibe = nombre_persona_recibe;
	}

	public String getApellido_persona_recibe() {
		return apellido_persona_recibe;
	}

	public void setApellido_persona_recibe(String apellido_persona_recibe) {
		this.apellido_persona_recibe = apellido_persona_recibe;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public String getComprobante_pago() {
		return comprobante_pago;
	}

	public void setComprobante_pago(String comprobante_pago) {
		this.comprobante_pago = comprobante_pago;
	}
	
	
}
