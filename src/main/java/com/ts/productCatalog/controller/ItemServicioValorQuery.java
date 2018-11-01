package com.ts.productCatalog.controller;

public class ItemServicioValorQuery {
	
	private String id;
	String idItemServicio;
	double valor;
	
	public ItemServicioValorQuery(String id, String idItemServicio, double valor) {
		super();
		this.id = id;
		this.idItemServicio = idItemServicio;
		this.valor = valor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdItemServicio() {
		return idItemServicio;
	}
	public void setIdItemServicio(String idItemServicio) {
		this.idItemServicio = idItemServicio;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
