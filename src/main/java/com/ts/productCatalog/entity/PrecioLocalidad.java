package com.ts.productCatalog.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcPrecioLocalidad")
public class PrecioLocalidad {
	
	@Id
	private String id;
	private String idEvento;
	private String idEscenario;
	private String idLocalidad;
	private List<ItemServicioValor> valoresServicios;
	private List<ImpuestoValor> valoresImpuesto;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Date fechaCreacion;
	private Date fechaModificacion;	
	private String estado;
	
	@Override
	public String toString() {
		return "PrecioLocalidad [id=" + id + ", idEvento=" + idEvento + ", idEscenario=" + idEscenario
				+ ", idLocalidad=" + idLocalidad + ", valoresServicios=" + valoresServicios + ", valoresImpuesto="
				+ valoresImpuesto + ", usuarioCreacion=" + usuarioCreacion + ", usuarioModificacion="
				+ usuarioModificacion + ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion
				+ ", estado=" + estado + "]";
	}
	public PrecioLocalidad(String id, String idEvento, String idEscenario, String idLocalidad,
			List<ItemServicioValor> valoresServicios, List<ImpuestoValor> valoresImpuesto, String usuarioCreacion,
			String usuarioModificacion, Date fechaCreacion, Date fechaModificacion, String estado) {
		super();
		this.id = id;
		this.idEvento = idEvento;
		this.idEscenario = idEscenario;
		this.idLocalidad = idLocalidad;
		this.valoresServicios = valoresServicios;
		this.valoresImpuesto = valoresImpuesto;
		this.usuarioCreacion = usuarioCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public PrecioLocalidad() {
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
