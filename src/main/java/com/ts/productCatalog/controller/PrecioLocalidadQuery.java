package com.ts.productCatalog.controller;

import java.util.List;

import com.ts.productCatalog.entity.ImpuestoValor;
import com.ts.productCatalog.entity.ItemServicioValor;

public class PrecioLocalidadQuery {

	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private List<ItemServicioValor> valoresServicios;
	private List<ImpuestoValor> valoresImpuesto;
	private String estado;
	
	public PrecioLocalidadQuery(String id, String idEvento, String idEscenario, String idLocalidad,
			List<ItemServicioValor> valoresServicios, List<ImpuestoValor> valoresImpuesto, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.valoresServicios = valoresServicios;
		this.valoresImpuesto = valoresImpuesto;
		this.estado = estado;
	}
	public PrecioLocalidadQuery() {
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
	public List<ItemServicioValor> getValoresServicios() {
		return valoresServicios;
	}
	public void setValoresServicios(List<ItemServicioValor> valoresServicios) {
		this.valoresServicios = valoresServicios;
	}
	public List<ImpuestoValor> getValoresImpuesto() {
		return valoresImpuesto;
	}
	public void setValoresImpuesto(List<ImpuestoValor> valoresImpuesto) {
		this.valoresImpuesto = valoresImpuesto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
