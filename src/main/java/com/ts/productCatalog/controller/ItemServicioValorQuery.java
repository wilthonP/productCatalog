package com.ts.productCatalog.controller;

public class ItemServicioValorQuery {
	
	private String id;
	private String idEvento;
	private String idItemServicio;
	double valor;
	
	@Override
	public String toString() {
		return "ItemServicioValorQuery [id=" + id + ", idEvento=" + idEvento + ", idItemServicio=" + idItemServicio
				+ ", valor=" + valor + "]";
	}
	public ItemServicioValorQuery(String id, String idEvento, String idItemServicio, double valor) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idItemServicio = idItemServicio;
		this.valor = valor;
	}
	public ItemServicioValorQuery() {
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
