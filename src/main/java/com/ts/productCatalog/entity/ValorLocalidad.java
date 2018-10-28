package com.ts.productCatalog.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcValorLocalidad")
public class ValorLocalidad {
	@Id
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private double valorPreventa;
	private double valorCortesia;
	private double valorDefinitivo;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "ValorLocalidad [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario + ", idLocalidad="
				+ idLocalidad + ", valorPreventa=" + valorPreventa + ", valorCortesia=" + valorCortesia
				+ ", valorDefinitivo=" + valorDefinitivo + ", usuarioCreacion=" + usuarioCreacion
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
	}
	public ValorLocalidad(String id, String idEvento, String idEscenario, String idLocalidad, double valorPreventa,
			double valorCortesia, double valorDefinitivo, String usuarioCreacion, String usuarioModificacion,
			Date fechaCreacion, Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.valorPreventa = valorPreventa;
		this.valorCortesia = valorCortesia;
		this.valorDefinitivo = valorDefinitivo;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public ValorLocalidad() {
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
	public String getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public double getValorPreventa() {
		return valorPreventa;
	}
	public void setValorPreventa(double valorPreventa) {
		this.valorPreventa = valorPreventa;
	}
	public double getValorCortesia() {
		return valorCortesia;
	}
	public void setValorCortesia(double valorCortesia) {
		this.valorCortesia = valorCortesia;
	}
	public double getValorDefinitivo() {
		return valorDefinitivo;
	}
	public void setValorDefinitivo(double valorDefinitivo) {
		this.valorDefinitivo = valorDefinitivo;
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
