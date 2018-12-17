package com.ts.productCatalog.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcEventos")
public class Evento {
	@Id
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
	private String idEscenario;
	private Date fechaInicioPreventa;
	private Date fechaFinPreventa;
	private Date fechaInicioCanje;
	private Date fechaFinCanje;
	private Date fechaInicioNormal;
	private Date fechaFinNormal;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estadoAnterior;
	private String estado;
	
	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", observaciones=" + observaciones + ", tipoActividad="
				+ tipoActividad + ", categoria=" + categoria + ", subCategoria=" + subCategoria + ", pais=" + pais
				+ ", ciudad=" + ciudad + ", eventoNacional=" + eventoNacional + ", aplicaPreventa=" + aplicaPreventa
				+ ", publicado=" + publicado + ", modoVenta=" + modoVenta + ", cancelado=" + cancelado
				+ ", canceladoComentario=" + canceladoComentario + ", fechaCancelado=" + fechaCancelado
				+ ", fechaHoraEvento=" + fechaHoraEvento + ", fechaCanje=" + fechaCanje + ", idEscenario=" + idEscenario
				+ ", fechaInicioPreventa=" + fechaInicioPreventa + ", fechaFinPreventa=" + fechaFinPreventa
				+ ", fechaInicioCanje=" + fechaInicioCanje + ", fechaFinCanje=" + fechaFinCanje + ", fechaInicioNormal="
				+ fechaInicioNormal + ", fechaFinNormal=" + fechaFinNormal + ", usuarioCreacion=" + usuarioCreacion
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estadoAnterior=" + estadoAnterior + ", estado="
				+ estado + "]";
	}
	public Evento(String id, String nombre, String observaciones, String tipoActividad, String categoria,
			String subCategoria, String pais, String ciudad, boolean eventoNacional, boolean aplicaPreventa,
			boolean publicado, String modoVenta, boolean cancelado, String canceladoComentario, Date fechaCancelado,
			Date fechaHoraEvento, Date fechaCanje, String idEscenario, Date fechaInicioPreventa, Date fechaFinPreventa,
			Date fechaInicioCanje, Date fechaFinCanje, Date fechaInicioNormal, Date fechaFinNormal,
			String usuarioCreacion, String usuarioModificacion, Date fechaCreacion, Date fechaModificacion,
			String estadoAnterior, String estado) {
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
		this.idEscenario = idEscenario;
		this.fechaInicioPreventa = fechaInicioPreventa;
		this.fechaFinPreventa = fechaFinPreventa;
		this.fechaInicioCanje = fechaInicioCanje;
		this.fechaFinCanje = fechaFinCanje;
		this.fechaInicioNormal = fechaInicioNormal;
		this.fechaFinNormal = fechaFinNormal;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estadoAnterior = estadoAnterior;
		this.estado = estado;
	}
	public Evento() {
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
	public String getIdEscenario() {
		return idEscenario;
	}
	public void setIdEscenario(String idEscenario) {
		this.idEscenario = idEscenario;
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
}
