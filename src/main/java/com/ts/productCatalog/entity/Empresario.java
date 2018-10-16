package com.ts.productCatalog.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcEmpresario")
public class Empresario {	
	@Id
	private String id;
	private String idEvento;
	private String idEmpresario;
	private String emailFacturacion;
	private String codigoMunicipal;
	private String caracterEspecial;
	private String mascara;
	private boolean codigoBarraLineal;
	private List<String> autorizacionesSri;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	public Empresario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empresario(String id, String idEvento, String idEmpresario, String emailFacturacion,
			String codigoMunicipal, String caracterEspecial, String mascara, boolean codigoBarraLineal,
			List<String> autorizacionesSri, String usuarioCreacion, String usuarioModificacion, Date fechaCreacion,
			Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEmpresario = idEmpresario;
		this.emailFacturacion = emailFacturacion;
		this.codigoMunicipal = codigoMunicipal;
		this.caracterEspecial = caracterEspecial;
		this.mascara = mascara;
		this.codigoBarraLineal = codigoBarraLineal;
		this.autorizacionesSri = autorizacionesSri;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "EmpresarioEvento [id=" + id + ", idEvento=" + idEvento + ", idEmpresario=" + idEmpresario
				+ ", emailFacturacion=" + emailFacturacion + ", codigoMunicipal=" + codigoMunicipal
				+ ", caracterEspecial=" + caracterEspecial + ", mascara=" + mascara + ", codigoBarraLineal="
				+ codigoBarraLineal + ", autorizacionesSri=" + autorizacionesSri + ", usuarioCreacion="
				+ usuarioCreacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
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
	public List<String> getAutorizacionesSri() {
		return autorizacionesSri;
	}
	public void setAutorizacionesSri(List<String> autorizacionesSri) {
		this.autorizacionesSri = autorizacionesSri;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
