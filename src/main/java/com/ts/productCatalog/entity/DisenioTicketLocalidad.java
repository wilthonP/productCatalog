package com.ts.productCatalog.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcDisenioTicketLocalidad")
public class DisenioTicketLocalidad {
	
	@Id
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idTipoTicket;
	private List<Localidad> idLocalidades;
	private String disenio;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "DisenioTicketLocalidad [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idTipoTicket=" + idTipoTicket + ", idLocalidades=" + idLocalidades + ", disenio=" + disenio
				+ ", usuarioCreacion=" + usuarioCreacion + ", usuarioModificacion=" + usuarioModificacion
				+ ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + ", estado=" + estado
				+ "]";
	}
	public DisenioTicketLocalidad(String id, String idEvento, String idEscenario, String idTipoTicket,
			List<Localidad> idLocalidades, String disenio, String usuarioCreacion, String usuarioModificacion,
			Date fechaCreacion, Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idTipoTicket = idTipoTicket;
		this.idLocalidades = idLocalidades;
		this.disenio = disenio;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public DisenioTicketLocalidad() {
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
	public String getIdTipoTicket() {
		return idTipoTicket;
	}
	public void setIdTipoTicket(String idTipoTicket) {
		this.idTipoTicket = idTipoTicket;
	}
	public List<Localidad> getIdLocalidades() {
		return idLocalidades;
	}
	public void setIdLocalidades(List<Localidad> idLocalidades) {
		this.idLocalidades = idLocalidades;
	}
	public String getDisenio() {
		return disenio;
	}
	public void setDisenio(String disenio) {
		this.disenio = disenio;
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
