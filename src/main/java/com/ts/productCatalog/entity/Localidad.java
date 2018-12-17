package com.ts.productCatalog.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcLocalidad")
public class Localidad {

	@Id
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidadEstandar;
	private String nombre;
	private String descripcion;
	private Integer capacidadLocalidad;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidadEstandar=" + idLocalidadEstandar + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", capacidadLocalidad=" + capacidadLocalidad + ", usuarioCreacion=" + usuarioCreacion
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
	}
	public Localidad(String id, String idEvento, String idEscenario, String idLocalidadEstandar, String nombre,
			String descripcion, Integer capacidadLocalidad, String usuarioCreacion, String usuarioModificacion,
			Date fechaCreacion, Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidadEstandar = idLocalidadEstandar;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.capacidadLocalidad = capacidadLocalidad;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public Localidad() {
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
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
