package com.ts.productCatalog.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcEmpresario")
public class Empresario {	
	@Id
	private String id;
	private String idEvento;
	private String idEmpresario;
	private String codigoMunicipal;
	private String caracterEspecial;
	private String mascara;
	private boolean codigoBarraLineal;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "Empresario [id=" + id + ", idEvento=" + idEvento + ", idEmpresario=" + idEmpresario
				+ ", codigoMunicipal=" + codigoMunicipal + ", caracterEspecial=" + caracterEspecial + ", mascara="
				+ mascara + ", codigoBarraLineal=" + codigoBarraLineal + ", usuarioCreacion=" + usuarioCreacion
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
	}
	public Empresario(String id, String idEvento, String idEmpresario, String codigoMunicipal, String caracterEspecial,
			String mascara, boolean codigoBarraLineal, String usuarioCreacion, String usuarioModificacion,
			Date fechaCreacion, Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEmpresario = idEmpresario;
		this.codigoMunicipal = codigoMunicipal;
		this.caracterEspecial = caracterEspecial;
		this.mascara = mascara;
		this.codigoBarraLineal = codigoBarraLineal;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public Empresario() {
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
	public String getIdEmpresario() {
		return idEmpresario;
	}
	public void setIdEmpresario(String idEmpresario) {
		this.idEmpresario = idEmpresario;
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
