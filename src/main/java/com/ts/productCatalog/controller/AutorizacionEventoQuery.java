package com.ts.productCatalog.controller;

import java.util.Date;

public class AutorizacionEventoQuery {
	
	private String id;
	private String idEvento;
	private String numAutorizacion;
	private String descripcion;
	private Integer inicio;
	private Integer fin;
	private String serie;
	private Date validezDesde;
	private Date validezHasta;
	private String estado;
	
	@Override
	public String toString() {
		return "AutorizacionEventoQuery [id=" + id + ", idEvento=" + idEvento + ", numAutorizacion=" + numAutorizacion
				+ ", descripcion=" + descripcion + ", inicio=" + inicio + ", fin=" + fin + ", serie=" + serie
				+ ", validezDesde=" + validezDesde + ", validezHasta=" + validezHasta + ", estado=" + estado + "]";
	}
	public AutorizacionEventoQuery(String id, String idEvento, String numAutorizacion, String descripcion,
			Integer inicio, Integer fin, String serie, Date validezDesde, Date validezHasta, String estado) {
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
		this.estado = estado;
	}
	public AutorizacionEventoQuery() {
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
