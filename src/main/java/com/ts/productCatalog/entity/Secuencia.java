package com.ts.productCatalog.entity;

public class Secuencia {

	int inicio;
	int fin;
	int actual;
	
	@Override
	public String toString() {
		return "Secuencia [inicio=" + inicio + ", fin=" + fin + ", actual=" + actual + "]";
	}
	public Secuencia(int inicio, int fin, int actual) {
		super();
		this.inicio = inicio;
		this.fin = fin;
		this.actual = actual;
	}
	public Secuencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getFin() {
		return fin;
	}
	public void setFin(int fin) {
		this.fin = fin;
	}
	public int getActual() {
		return actual;
	}
	public void setActual(int actual) {
		this.actual = actual;
	}
}
