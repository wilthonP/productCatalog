package com.ts.productCatalog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcItemServicioValor")
public class ItemServicioValor {
	
	@Id
	private String id;
	String idItemServicio;
	double valor;
	
	@Override
	public String toString() {
		return "ItemServicioValor [id=" + id + ", idItemServicio=" + idItemServicio + ", valor=" + valor + "]";
	}
	public ItemServicioValor(String id, String idItemServicio, double valor) {
		super();
		this.id = id;
		this.idItemServicio = idItemServicio;
		this.valor = valor;
	}
	public ItemServicioValor() {
		super();
		// TODO Auto-generated constructor stub
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
