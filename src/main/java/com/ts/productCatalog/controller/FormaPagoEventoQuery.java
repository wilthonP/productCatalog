package com.ts.productCatalog.controller;

import java.util.List;

import com.ts.productCatalog.entity.EntityGeneric;

public class FormaPagoEventoQuery {
	private String id;
	private String idEvento;
	private List<EntityGeneric> idFormaPago;
	private List<EntityGeneric> tarjetasCredito;
	private String estado;
	
	@Override
	public String toString() {
		return "FormaPagoEventoQuery [id=" + id + ", idEvento=" + idEvento + ", idFormaPago=" + idFormaPago
				+ ", tarjetasCredito=" + tarjetasCredito + ", estado=" + estado + "]";
	}
	public FormaPagoEventoQuery(String id, String idEvento, List<EntityGeneric> idFormaPago, List<EntityGeneric> tarjetasCredito,
			String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idFormaPago = idFormaPago;
		this.tarjetasCredito = tarjetasCredito;
		this.estado = estado;
	}
	public FormaPagoEventoQuery() {
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
