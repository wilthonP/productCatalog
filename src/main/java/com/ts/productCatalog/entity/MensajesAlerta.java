package com.ts.productCatalog.entity;

import org.apache.camel.json.simple.JsonObject;

public class MensajesAlerta {
	
	String param = "";
	String codigo = "";
	String titulo = "";
	String mensaje = "";
	JsonObject jsonObj;
	
	public MensajesAlerta() {
		super();
		// TODO Auto-generated constructor stub
		this.jsonObj = new JsonObject();
	}
	public MensajesAlerta(String codigo, String titulo, String mensaje) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "MensajesAlerta [param=" + param + ", codigo=" + codigo + ", titulo=" + titulo + ", mensaje=" + mensaje
				+ "]";
	}
	
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public JsonObject getJsonMessage() {
		if(param != "")
			jsonObj.put("param", param);
		if(titulo != "")
			jsonObj.put("titulo", titulo);
		jsonObj.put("codigo", codigo);
		jsonObj.put("mensaje", mensaje);
		return jsonObj;
	}
}
