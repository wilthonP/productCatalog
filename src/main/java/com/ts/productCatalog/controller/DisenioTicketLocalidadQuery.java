package com.ts.productCatalog.controller;

import java.util.List;

import com.ts.productCatalog.entity.Localidad;

public class DisenioTicketLocalidadQuery {
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idTipoTicket;
	private List<Localidad> idLocalidades;
	private String disenio;
	private String estado;
	
	@Override
	public String toString() {
		return "DisenioTicketLocalidadQuery [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idTipoTicket=" + idTipoTicket + ", idLocalidades=" + idLocalidades + ", disenio=" + disenio
				+ ", estado=" + estado + "]";
	}
	public DisenioTicketLocalidadQuery(String id, String idEvento, String idEscenario, String idTipoTicket,
			List<Localidad> idLocalidades, String disenio, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idTipoTicket = idTipoTicket;
		this.idLocalidades = idLocalidades;
		this.disenio = disenio;
		this.estado = estado;
	}
	public DisenioTicketLocalidadQuery() {
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
