package com.ts.productCatalog.controller;

public class LocalidadQuery {
	
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidadEstandar;
	private String nombre;
	private String descripcion;
	private Integer capacidadLocalidad;
	private String estado;
	
	@Override
	public String toString() {
		return "LocalidadQuery [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidadEstandar=" + idLocalidadEstandar + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", capacidadLocalidad=" + capacidadLocalidad + ", estado=" + estado + "]";
	}
	public LocalidadQuery(String id, String idEvento, String idEscenario, String idLocalidadEstandar, String nombre,
			String descripcion, Integer capacidadLocalidad, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidadEstandar = idLocalidadEstandar;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.capacidadLocalidad = capacidadLocalidad;
		this.estado = estado;
	}
	public LocalidadQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}
	public String getIdEscenario() {
		return idEscenario;
	}
	public void setIdEscenario(String idEscenario) {
		this.idEscenario = idEscenario;
	}
	public String getIdLocalidadEstandar() {
		return idLocalidadEstandar;
	}
	public void setIdLocalidadEstandar(String idLocalidadEstandar) {
		this.idLocalidadEstandar = idLocalidadEstandar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCapacidadLocalidad() {
		return capacidadLocalidad;
	}
	public void setCapacidadLocalidad(Integer capacidadLocalidad) {
		this.capacidadLocalidad = capacidadLocalidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
