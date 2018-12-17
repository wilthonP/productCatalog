package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.ValorLocalidadQuery;
import com.ts.productCatalog.entity.ValorLocalidad;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.ValorLocalidadRepository;

@Component
public class ValorLocalidadComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(ValorLocalidadComponent.class);
	private ValorLocalidadRepository valorLocalidadRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public ValorLocalidadComponent(ValorLocalidadRepository valorLocalidadRepository) {
		super();
		this.valorLocalidadRepository = valorLocalidadRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public List<ValorLocalidad> getValorLocalidadById(ValorLocalidadQuery query){
		List<ValorLocalidad> valorLocalidad = valorLocalidadRepository.findByIdAndEstado(query.getId(), query.getEstado());
		List<ValorLocalidad> valorLocalidadResult = new ArrayList<ValorLocalidad>();
		valorLocalidadResult.addAll(valorLocalidad);
		return valorLocalidadResult;
	}
	public List<ValorLocalidad> getValorLocalidadByIdEventoAndEstado(ValorLocalidadQuery query){
		List<ValorLocalidad> valorLocalidad = valorLocalidadRepository.findByIdEventoAndEstado(query.getIdEvento(), query.getEstado());
		List<ValorLocalidad> valorLocalidadResult = new ArrayList<ValorLocalidad>();
		valorLocalidadResult.addAll(valorLocalidad);
		return valorLocalidadResult;
	}
	public List<ValorLocalidad> getValorLocalidadByIdEvento(ValorLocalidadQuery query){
		List<ValorLocalidad> valorLocalidad = valorLocalidadRepository.findByIdEvento(query.getIdEvento());
		List<ValorLocalidad> valorLocalidadResult = new ArrayList<ValorLocalidad>();
		valorLocalidadResult.addAll(valorLocalidad);
		return valorLocalidadResult;
	}
	public List<ValorLocalidad> getValorLocalidadByEstado(ValorLocalidadQuery query){
		List<ValorLocalidad> valorLocalidad = valorLocalidadRepository.findByEstado(query.getEstado());
		List<ValorLocalidad> valorLocalidadResult = new ArrayList<ValorLocalidad>();
		valorLocalidadResult.addAll(valorLocalidad);
		return valorLocalidadResult;
	}
	public List<ValorLocalidad> getValorLocalidadAll(){
		List<ValorLocalidad> valorLocalidad = valorLocalidadRepository.findAll();
		List<ValorLocalidad> valorLocalidadResult = new ArrayList<ValorLocalidad>();
		valorLocalidadResult.addAll(valorLocalidad);
		return valorLocalidadResult;
	}
	public JsonObject create(ValorLocalidad valorLocalidad){
		try {
			valorLocalidad.setFechaCreacion(now);
			valorLocalidad.setFechaModificacion(now);
			if(valorLocalidadRepository.save(valorLocalidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(valorLocalidad.getId());
				mensajesAlerta.setMensaje("Valores de localidad guardados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear los valores de localidad.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear los valores de localidad.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(ValorLocalidad valorLocalidad){
		try {
			ValorLocalidad objValorLocalidad = valorLocalidadRepository.findById(valorLocalidad.getId()).get();
			valorLocalidad.setUsuarioCreacion(objValorLocalidad.getUsuarioCreacion());
			valorLocalidad.setFechaCreacion(objValorLocalidad.getFechaCreacion());
			valorLocalidad.setFechaModificacion(now);
			if(valorLocalidadRepository.save(valorLocalidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Valores de localidad actualizados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar los valores de localidad.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al actualizar los valores de localidad.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject setStatus(ValorLocalidadQuery query){
		try {
			ValorLocalidad objImp = valorLocalidadRepository.findById(query.getId()).get();
			objImp.setEstado(query.getEstado());
			objImp.setFechaModificacion(now);
			String estado = ""; 
			if(valorLocalidadRepository.save(objImp) != null) {
				if(query.getEstado().equals("A"))
					estado = "activados";
				else
					estado = "inactivados";
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Valores de localidad "+estado+" correctamente.");
			}else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar estado intente nuevamente.");
			}
			return mensajesAlerta.getJsonMessage();
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("problema en el sistema al actualizar estado.");
			logger.info("Error: " + e);
			return mensajesAlerta.getJsonMessage();
		}
	}
}