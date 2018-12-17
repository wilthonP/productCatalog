package com.ts.productCatalog.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcFormaPago")
public class FormaPagoEvento {
	
	@Id
	private String id;
	private String idEvento;
	private List<EntityGeneric> idFormaPago;
	private List<EntityGeneric> tarjetasCredito;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "FormaPagoEvento [id=" + id + ", idEvento=" + idEvento + ", idFormaPago=" + idFormaPago
				+ ", tarjetasCredito=" + tarjetasCredito + ", usuarioCreacion=" + usuarioCreacion
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaCreacion=" + fechaCreacion
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
	}
	public FormaPagoEvento(String id, String idEvento, List<EntityGeneric> idFormaPago, List<EntityGeneric> tarjetasCredito,
			String usuarioCreacion, String usuarioModificacion, Date fechaCreacion, Date fechaModificacion,
			String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idFormaPago = idFormaPago;
		this.tarjetasCredito = tarjetasCredito;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public FormaPagoEvento() {
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
	public List<EntityGeneric> getIdFormaPago() {
		return idFormaPago;
	}
	public void setIdFormaPago(List<EntityGeneric> idFormaPago) {
		this.idFormaPago = idFormaPago;
	}
	public List<EntityGeneric> getTarjetasCredito() {
		return tarjetasCredito;
	}
	public void setTarjetasCredito(List<EntityGeneric> tarjetasCredito) {
		this.tarjetasCredito = tarjetasCredito;
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
