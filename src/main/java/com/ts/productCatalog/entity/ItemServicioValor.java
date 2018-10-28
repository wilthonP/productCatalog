package com.ts.productCatalog.entity;

public class ItemServicioValor {
	
	String idItemServicio;
	double valor;
	
	@Override
	public String toString() {
		return "ItemServicioValor [idItemServicio=" + idItemServicio + ", valor=" + valor + "]";
	}
	public ItemServicioValor(String idItemServicio, double valor) {
		super();
		this.idItemServicio = idItemServicio;
		this.valor = valor;
	}
	public ItemServicioValor() {
		super();
		// TODO Auto-generated constructor stub
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
