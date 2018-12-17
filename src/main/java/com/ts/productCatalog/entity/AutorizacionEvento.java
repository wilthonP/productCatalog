package com.ts.productCatalog.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcAutorizacion")
public class AutorizacionEvento {
	
	@Id
	private String id;
	private String idEvento;
	private String numAutorizacion;
	private String descripcion;
	private Integer inicio;
	private Integer fin;
	private String serie;
	private Date validezDesde;
	private Date validezHasta;
	
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "AutorizacionEvento [id=" + id + ", idEvento=" + idEvento + ", numAutorizacion=" + numAutorizacion
				+ ", descripcion=" + descripcion + ", inicio=" + inicio + ", fin=" + fin + ", serie=" + serie
				+ ", validezDesde=" + validezDesde + ", validezHasta=" + validezHasta + ", usuarioCreacion="
				+ usuarioCreacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
	}
	public AutorizacionEvento(String id, String idEvento, String numAutorizacion, String descripcion, Integer inicio,
			Integer fin, String serie, Date validezDesde, Date validezHasta, String usuarioCreacion,
			String usuarioModificacion, Date fechaCreacion, Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.numAutorizacion = numAutorizacion;
		this.descripcion = descripcion;
		this.inicio = inicio;
		this.fin = fin;
		this.serie = serie;
		this.validezDesde = validezDesde;
		this.validezHasta = validezHasta;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public AutorizacionEvento() {
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
	public String getNumAutorizacion() {
		return numAutorizacion;
	}
	public void setNumAutorizacion(String numAutorizacion) {
		this.numAutorizacion = numAutorizacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getInicio() {
		return inicio;
	}
	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}
	public Integer getFin() {
		return fin;
	}
	public void setFin(Integer fin) {
		this.fin = fin;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Date getValidezDesde() {
		return validezDesde;
	}
	public void setValidezDesde(Date validezDesde) {
		this.validezDesde = validezDesde;
	}
	public Date getValidezHasta() {
		return validezHasta;
	}
	public void setValidezHasta(Date validezHasta) {
		this.validezHasta = validezHasta;
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
