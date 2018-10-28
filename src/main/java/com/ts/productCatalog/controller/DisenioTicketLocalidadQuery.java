package com.ts.productCatalog.controller;

import com.ts.productCatalog.entity.TipoDisenioValor;

public class DisenioTicketLocalidadQuery {
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private TipoDisenioValor tipoDisenioValor;	
	private String estado;
	
	@Override
	public String toString() {
		return "DisenioTicketLocalidadQuery [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidad=" + idLocalidad + ", tipoDisenioValor=" + tipoDisenioValor + ", estado=" + estado
				+ "]";
	}
	public DisenioTicketLocalidadQuery(String id, String idEvento, String idEscenario, String idLocalidad,
			TipoDisenioValor tipoDisenioValor, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.tipoDisenioValor = tipoDisenioValor;
		this.estado = estado;
	}
	public DisenioTicketLocalidadQuery() {
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
	public TipoDisenioValor getTipoDisenioValor() {
		return tipoDisenioValor;
	}
	public void setTipoDisenioValor(TipoDisenioValor tipoDisenioValor) {
		this.tipoDisenioValor = tipoDisenioValor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
