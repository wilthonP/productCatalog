package com.ts.productCatalog.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcSecuencialLocalidad")
public class SecuencialLocalidad {
	
	@Id
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private String codMunicipalVenta;
	private String codMunicipalCortesia;
	private Secuencia secuencialVenta;
	private Secuencia secuencialCortesia;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "SecuencialLocalidad [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidad=" + idLocalidad + ", codMunicipalVenta=" + codMunicipalVenta
				+ ", codMunicipalCortesia=" + codMunicipalCortesia + ", secuencialVenta=" + secuencialVenta
				+ ", secuencialCortesia=" + secuencialCortesia + ", usuarioCreacion=" + usuarioCreacion
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
	}
	public SecuencialLocalidad(String id, String idEvento, String idEscenario, String idLocalidad,
			String codMunicipalVenta, String codMunicipalCortesia, Secuencia secuencialVenta,
			Secuencia secuencialCortesia, String usuarioCreacion, String usuarioModificacion, Date fechaCreacion,
			Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.codMunicipalVenta = codMunicipalVenta;
		this.codMunicipalCortesia = codMunicipalCortesia;
		this.secuencialVenta = secuencialVenta;
		this.secuencialCortesia = secuencialCortesia;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public SecuencialLocalidad() {
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
	public String getIdEscenario() {
		return idEscenario;
	}
	public void setIdEscenario(String idEscenario) {
		this.idEscenario = idEscenario;
	}
	public String getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public String getCodMunicipalVenta() {
		return codMunicipalVenta;
	}
	public void setCodMunicipalVenta(String codMunicipalVenta) {
		this.codMunicipalVenta = codMunicipalVenta;
	}
	public String getCodMunicipalCortesia() {
		return codMunicipalCortesia;
	}
	public void setCodMunicipalCortesia(String codMunicipalCortesia) {
		this.codMunicipalCortesia = codMunicipalCortesia;
	}
	public Secuencia getSecuencialVenta() {
		return secuencialVenta;
	}
	public void setSecuencialVenta(Secuencia secuencialVenta) {
		this.secuencialVenta = secuencialVenta;
	}
	public Secuencia getSecuencialCortesia() {
		return secuencialCortesia;
	}
	public void setSecuencialCortesia(Secuencia secuencialCortesia) {
		this.secuencialCortesia = secuencialCortesia;
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
