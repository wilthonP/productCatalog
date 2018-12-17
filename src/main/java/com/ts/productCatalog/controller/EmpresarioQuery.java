package com.ts.productCatalog.controller;

public class EmpresarioQuery {

	private String id;
	private String idEvento;
	private String idEmpresario;
	private String emailFacturacion;
	private String codigoMunicipal;
	private String caracterEspecial;
	private String mascara;
	private boolean codigoBarraLineal;
	private String estado;
	
	public EmpresarioQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpresarioQuery(String id, String idEvento, String idEmpresario, String emailFacturacion,
			String codigoMunicipal, String caracterEspecial, String mascara, boolean codigoBarraLineal, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEmpresario = idEmpresario;
		this.emailFacturacion = emailFacturacion;
		this.codigoMunicipal = codigoMunicipal;
		this.caracterEspecial = caracterEspecial;
		this.mascara = mascara;
		this.codigoBarraLineal = codigoBarraLineal;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "EmpresarioQuery [id=" + id + ", idEvento=" + idEvento + ", idEmpresario=" + idEmpresario
				+ ", emailFacturacion=" + emailFacturacion + ", codigoMunicipal=" + codigoMunicipal
				+ ", caracterEspecial=" + caracterEspecial + ", mascara=" + mascara + ", codigoBarraLineal="
				+ codigoBarraLineal + ", estado=" + estado + "]";
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
	public String getIdEmpresario() {
		return idEmpresario;
	}
	public void setIdEmpresario(String idEmpresario) {
		this.idEmpresario = idEmpresario;
	}
	public String getEmailFacturacion() {
		return emailFacturacion;
	}
	public void setEmailFacturacion(String emailFacturacion) {
		this.emailFacturacion = emailFacturacion;
	}
	public String getCodigoMunicipal() {
		return codigoMunicipal;
	}
	public void setCodigoMunicipal(String codigoMunicipal) {
		this.codigoMunicipal = codigoMunicipal;
	}
	public String getCaracterEspecial() {
		return caracterEspecial;
	}
	public void setCaracterEspecial(String caracterEspecial) {
		this.caracterEspecial = caracterEspecial;
	}
	public String getMascara() {
		return mascara;
	}
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	public boolean isCodigoBarraLineal() {
		return codigoBarraLineal;
	}
	public void setCodigoBarraLineal(boolean codigoBarraLineal) {
		this.codigoBarraLineal = codigoBarraLineal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
