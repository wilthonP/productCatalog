package com.ts.productCatalog.controller;

public class ValorLocalidadQuery {
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private double valorPreventa;
	private double valorCortesia;
	private double valorDefinitivo;
	private String estado;
	
	@Override
	public String toString() {
		return "ValorLocalidadQuery [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidad=" + idLocalidad + ", valorPreventa=" + valorPreventa + ", valorCortesia="
				+ valorCortesia + ", valorDefinitivo=" + valorDefinitivo + ", estado=" + estado + "]";
	}
	public ValorLocalidadQuery(String id, String idEvento, String idEscenario, String idLocalidad, double valorPreventa,
			double valorCortesia, double valorDefinitivo, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.valorPreventa = valorPreventa;
		this.valorCortesia = valorCortesia;
		this.valorDefinitivo = valorDefinitivo;
		this.estado = estado;
	}
	public ValorLocalidadQuery() {
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
