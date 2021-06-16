package com.bron.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacto")
public class Contacto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_contacto;
    
	@Column
	private String nombre;
	
	@Column
	private String correo;
	
	@Column
	private String mensaje;

	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacto(int id_contacto, String nombre, String correo, String mensaje) {
		super();
		this.id_contacto = id_contacto;
		this.nombre = nombre;
		this.correo = correo;
		this.mensaje = mensaje;
	}

	public int getId_contacto() {
		return id_contacto;
	}

	public void setId_contacto(int id_contacto) {
		this.id_contacto = id_contacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
