package com.ts.productCatalog.controller;

import com.ts.productCatalog.entity.Secuencia;

public class SecuencialLocalidadQuery {
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private String codMunicipalVenta;
	private String codMunicipalCortesia;
	private Secuencia secuencialVenta;
	private Secuencia secuencialCortesia;
	private String estado;
	
	@Override
	public String toString() {
		return "SecuencialLocalidadQuery [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidad=" + idLocalidad + ", codMunicipalVenta=" + codMunicipalVenta
				+ ", codMunicipalCortesia=" + codMunicipalCortesia + ", secuencialVenta=" + secuencialVenta
				+ ", secuencialCortesia=" + secuencialCortesia + ", estado=" + estado + "]";
	}
	public SecuencialLocalidadQuery(String id, String idEvento, String idEscenario, String idLocalidad,
			String codMunicipalVenta, String codMunicipalCortesia, Secuencia secuencialVenta,
			Secuencia secuencialCortesia, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.codMunicipalVenta = codMunicipalVenta;
		this.codMunicipalCortesia = codMunicipalCortesia;
		this.secuencialVenta = secuencialVenta;
		this.secuencialCortesia = secuencialCortesia;
		this.estado = estado;
	}
	public SecuencialLocalidadQuery() {
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
	public String getCodMunicipalVenta() {
		return codMunicipalVenta;
	}
	public void setCodMunicipalVenta(String codMunicipalVenta) {
		this.codMunicipalVenta = codMunicipalVenta;
	}
	public String getCodMunicipalCortesia() {
		return codMunicipalCortesia;
	}
	public void setCodMunicipalCortesia(String codMunicipalCortesia) {
		this.codMunicipalCortesia = codMunicipalCortesia;
	}
	public Secuencia getSecuencialVenta() {
		return secuencialVenta;
	}
	public void setSecuencialVenta(Secuencia secuencialVenta) {
		this.secuencialVenta = secuencialVenta;
	}
	public Secuencia getSecuencialCortesia() {
		return secuencialCortesia;
	}
	public void setSecuencialCortesia(Secuencia secuencialCortesia) {
		this.secuencialCortesia = secuencialCortesia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
