package com.ts.productCatalog.controller;

public class AutorizacionEventoQuery {
	
	private String id;
	private String idEvento;
	private String idAutorizacion;	
	private String estado;
	
	public AutorizacionEventoQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AutorizacionEventoQuery(String id, String idEvento, String idAutorizacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idAutorizacion = idAutorizacion;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "AutorizacionEventoQuery [id=" + id + ", idEvento=" + idEvento + ", idAutorizacion=" + idAutorizacion
				+ ", estado=" + estado + "]";
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
	public String getIdAutorizacion() {
		return idAutorizacion;
	}
	public void setIdAutorizacion(String idAutorizacion) {
		this.idAutorizacion = idAutorizacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
