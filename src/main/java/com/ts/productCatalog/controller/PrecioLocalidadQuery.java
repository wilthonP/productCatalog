package com.ts.productCatalog.controller;

import java.util.List;

import com.ts.productCatalog.entity.ItemServicioValor;

public class PrecioLocalidadQuery {

	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private List<ItemServicioValor> valoresServicios;
	private String estado;
	
	@Override
	public String toString() {
		return "PrecioLocalidadQuery [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidad=" + idLocalidad + ", valoresServicios=" + valoresServicios + ", estado=" + estado
				+ "]";
	}
	public PrecioLocalidadQuery(String id, String idEvento, String idEscenario, String idLocalidad,
			List<ItemServicioValor> valoresServicios, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.valoresServicios = valoresServicios;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
