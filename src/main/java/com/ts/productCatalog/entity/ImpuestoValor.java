package com.ts.productCatalog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcImpuestoValor")
public class ImpuestoValor {
	
	@Id
	private String id;
	String idItemServicio;
	double valor;
	
	@Override
	public String toString() {
		return "ImpuestoValor [id=" + id + ", idItemServicio=" + idItemServicio + ", valor=" + valor + "]";
	}
	public ImpuestoValor(String id, String idItemServicio, double valor) {
		super();
		this.id = id;
		this.idItemServicio = idItemServicio;
		this.valor = valor;
	}
	public ImpuestoValor() {
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
