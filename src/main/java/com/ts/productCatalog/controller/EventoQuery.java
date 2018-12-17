package com.ts.productCatalog.controller;

import java.util.Date;

public class EventoQuery {
	private String id;
	private String nombre;
	private String observaciones;
	private String tipoActividad;
	private String categoria;
	private String subCategoria;
	private String pais;
	private String ciudad;
	private boolean eventoNacional;
	private boolean aplicaPreventa;
	private boolean publicado;
	private String modoVenta;
	private boolean cancelado;
	private String canceladoComentario;
	private Date fechaCancelado;
	private Date fechaHoraEvento;
	private Date fechaCanje;
	private String estadoAnterior;
	private String estado;
	
	private Date fechaInicioPreventa;
	private Date fechaFinPreventa;
	private Date fechaInicioCanje;
	private Date fechaFinCanje;
	private Date fechaInicioNormal;
	private Date fechaFinNormal;
	
	@Override
	public String toString() {
		return "EventoQuery [id=" + id + ", nombre=" + nombre + ", observaciones=" + observaciones + ", tipoActividad="
				+ tipoActividad + ", categoria=" + categoria + ", subCategoria=" + subCategoria + ", pais=" + pais
				+ ", ciudad=" + ciudad + ", eventoNacional=" + eventoNacional + ", aplicaPreventa=" + aplicaPreventa
				+ ", publicado=" + publicado + ", modoVenta=" + modoVenta + ", cancelado=" + cancelado
				+ ", canceladoComentario=" + canceladoComentario + ", fechaCancelado=" + fechaCancelado
				+ ", fechaHoraEvento=" + fechaHoraEvento + ", fechaCanje=" + fechaCanje + ", estadoAnterior="
				+ estadoAnterior + ", estado=" + estado + ", fechaInicioPreventa=" + fechaInicioPreventa
				+ ", fechaFinPreventa=" + fechaFinPreventa + ", fechaInicioCanje=" + fechaInicioCanje
				+ ", fechaFinCanje=" + fechaFinCanje + ", fechaInicioNormal=" + fechaInicioNormal + ", fechaFinNormal="
				+ fechaFinNormal + "]";
	}
	public EventoQuery(String id, String nombre, String observaciones, String tipoActividad, String categoria,
			String subCategoria, String pais, String ciudad, boolean eventoNacional, boolean aplicaPreventa,
			boolean publicado, String modoVenta, boolean cancelado, String canceladoComentario, Date fechaCancelado,
			Date fechaHoraEvento, Date fechaCanje, String estadoAnterior, String estado, Date fechaInicioPreventa,
			Date fechaFinPreventa, Date fechaInicioCanje, Date fechaFinCanje, Date fechaInicioNormal,
			Date fechaFinNormal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.tipoActividad = tipoActividad;
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.pais = pais;
		this.ciudad = ciudad;
		this.eventoNacional = eventoNacional;
		this.aplicaPreventa = aplicaPreventa;
		this.publicado = publicado;
		this.modoVenta = modoVenta;
		this.cancelado = cancelado;
		this.canceladoComentario = canceladoComentario;
		this.fechaCancelado = fechaCancelado;
		this.fechaHoraEvento = fechaHoraEvento;
		this.fechaCanje = fechaCanje;
		this.estadoAnterior = estadoAnterior;
		this.estado = estado;
		this.fechaInicioPreventa = fechaInicioPreventa;
		this.fechaFinPreventa = fechaFinPreventa;
		this.fechaInicioCanje = fechaInicioCanje;
		this.fechaFinCanje = fechaFinCanje;
		this.fechaInicioNormal = fechaInicioNormal;
		this.fechaFinNormal = fechaFinNormal;
	}
	public EventoQuery() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSubCategoria() {
		return subCategoria;
	}
	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
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
	public boolean isPublicado() {
		return publicado;
	}
	public void setPublicado(boolean publicado) {
		this.publicado = publicado;
	}
	public String getModoVenta() {
		return modoVenta;
	}
	public void setModoVenta(String modoVenta) {
		this.modoVenta = modoVenta;
	}
	public boolean isCancelado() {
		return cancelado;
	}
	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}
	public String getCanceladoComentario() {
		return canceladoComentario;
	}
	public void setCanceladoComentario(String canceladoComentario) {
		this.canceladoComentario = canceladoComentario;
	}
	public Date getFechaCancelado() {
		return fechaCancelado;
	}
	public void setFechaCancelado(Date fechaCancelado) {
		this.fechaCancelado = fechaCancelado;
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
	public String getEstadoAnterior() {
		return estadoAnterior;
	}
	public void setEstadoAnterior(String estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechaInicioPreventa() {
		return fechaInicioPreventa;
	}
	public void setFechaInicioPreventa(Date fechaInicioPreventa) {
		this.fechaInicioPreventa = fechaInicioPreventa;
	}
	public Date getFechaFinPreventa() {
		return fechaFinPreventa;
	}
	public void setFechaFinPreventa(Date fechaFinPreventa) {
		this.fechaFinPreventa = fechaFinPreventa;
	}
	public Date getFechaInicioCanje() {
		return fechaInicioCanje;
	}
	public void setFechaInicioCanje(Date fechaInicioCanje) {
		this.fechaInicioCanje = fechaInicioCanje;
	}
	public Date getFechaFinCanje() {
		return fechaFinCanje;
	}
	public void setFechaFinCanje(Date fechaFinCanje) {
		this.fechaFinCanje = fechaFinCanje;
	}
	public Date getFechaInicioNormal() {
		return fechaInicioNormal;
	}
	public void setFechaInicioNormal(Date fechaInicioNormal) {
		this.fechaInicioNormal = fechaInicioNormal;
	}
	public Date getFechaFinNormal() {
		return fechaFinNormal;
	}
	public void setFechaFinNormal(Date fechaFinNormal) {
		this.fechaFinNormal = fechaFinNormal;
	}
}
