package com.ts.productCatalog.controller;

import java.util.List;

public class PrecioLocalidadQuery {

	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private List<String> valoresServicios;
	private List<String> valoresImpuesto;
	private String estado;
	
	public PrecioLocalidadQuery(String id, String idEvento, String idEscenario, String idLocalidad,
			List<String> valoresServicios, List<String> valoresImpuesto, String estado) {
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
	public List<String> getValoresServicios() {
		return valoresServicios;
	}
	public void setValoresServicios(List<String> valoresServicios) {
		this.valoresServicios = valoresServicios;
	}
	public List<String> getValoresImpuesto() {
		return valoresImpuesto;
	}
	public void setValoresImpuesto(List<String> valoresImpuesto) {
		this.valoresImpuesto = valoresImpuesto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
