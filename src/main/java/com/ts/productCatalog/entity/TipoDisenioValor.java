package com.ts.productCatalog.entity;

public class TipoDisenioValor {
	String idTipoTcket;
	String printerOne;
	String printerTwo;
	
	@Override
	public String toString() {
		return "TipoDisenioValor [idTipoTcket=" + idTipoTcket + ", printerOne=" + printerOne + ", printerTwo="
				+ printerTwo + "]";
	}
	public TipoDisenioValor(String idTipoTcket, String printerOne, String printerTwo) {
		super();
		this.idTipoTcket = idTipoTcket;
		this.printerOne = printerOne;
		this.printerTwo = printerTwo;
	}
	public TipoDisenioValor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdTipoTcket() {
		return idTipoTcket;
	}
	public void setIdTipoTcket(String idTipoTcket) {
		this.idTipoTcket = idTipoTcket;
	}
	public String getPrinterOne() {
		return printerOne;
	}
	public void setPrinterOne(String printerOne) {
		this.printerOne = printerOne;
	}
	public String getPrinterTwo() {
		return printerTwo;
	}
	public void setPrinterTwo(String printerTwo) {
		this.printerTwo = printerTwo;
	}
}
