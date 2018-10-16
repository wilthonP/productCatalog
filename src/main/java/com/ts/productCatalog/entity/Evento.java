package com.ts.productCatalog.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcEventos")
public class Evento {
	@Id
	private String id;
	private String nombre;
	private String observaciones;
	private String tipoActividad;
	private List<String> categoria;
	private String ciudad;
	private boolean eventoNacional;
	private boolean aplicaPreventa;
	private Date fechaHoraEvento;
	private Date fechaCanje;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evento(String id, String nombre, String observaciones, String tipoActividad, List<String> categoria,
			String ciudad, boolean eventoNacional, boolean aplicaPreventa, Date fechaHoraEvento, Date fechaCanje,
			String usuarioCreacion, String usuarioModificacion, Date fechaCreacion, Date fechaModificacion,
			String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.tipoActividad = tipoActividad;
		this.categoria = categoria;
		this.ciudad = ciudad;
		this.eventoNacional = eventoNacional;
		this.aplicaPreventa = aplicaPreventa;
		this.fechaHoraEvento = fechaHoraEvento;
		this.fechaCanje = fechaCanje;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", observaciones=" + observaciones + ", tipoActividad="
				+ tipoActividad + ", categoria=" + categoria + ", ciudad=" + ciudad + ", eventoNacional="
				+ eventoNacional + ", aplicaPreventa=" + aplicaPreventa + ", fechaHoraEvento=" + fechaHoraEvento
				+ ", fechaCanje=" + fechaCanje + ", usuarioCreacion=" + usuarioCreacion + ", usuarioModificacion="
				+ usuarioModificacion + ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion
				+ ", estado=" + estado + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getTipoActividad() {
		return tipoActividad;
	}
	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	public List<String> getCategoria() {
		return categoria;
	}
	public void setCategoria(List<String> categoria) {
		this.categoria = categoria;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public boolean isEventoNacional() {
		return eventoNacional;
	}
	public void setEventoNacional(boolean eventoNacional) {
		this.eventoNacional = eventoNacional;
	}
	public boolean isAplicaPreventa() {
		return aplicaPreventa;
	}
	public void setAplicaPreventa(boolean aplicaPreventa) {
		this.aplicaPreventa = aplicaPreventa;
	}
	public Date getFechaHoraEvento() {
		return fechaHoraEvento;
	}
	public void setFechaHoraEvento(Date fechaHoraEvento) {
		this.fechaHoraEvento = fechaHoraEvento;
	}
	public Date getFechaCanje() {
		return fechaCanje;
	}
	public void setFechaCanje(Date fechaCanje) {
		this.fechaCanje = fechaCanje;
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
