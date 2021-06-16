package com.bron.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "queja")
public class Queja implements Serializable{
	/** La Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_queja;
    
	@Column
	private String queja;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date fecha;
	
	@ManyToOne()
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    private Venta venta;

	public Queja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Queja(int id_queja, String queja, Date fecha, Venta venta) {
		super();
		this.id_queja = id_queja;
		this.queja = queja;
		this.fecha = fecha;
		this.venta = venta;
	}

	public int getId_queja() {
		return id_queja;
	}

	public void setId_queja(int id_queja) {
		this.id_queja = id_queja;
	}

	public String getQueja() {
		return queja;
	}

	public void setQueja(String queja) {
		this.queja = queja;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	
}
