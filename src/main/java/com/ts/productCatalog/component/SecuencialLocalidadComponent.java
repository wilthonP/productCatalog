package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.SecuencialLocalidadQuery;
import com.ts.productCatalog.entity.SecuencialLocalidad;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.SecuencialLocalidadRepository;

@Component
public class SecuencialLocalidadComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(SecuencialLocalidadComponent.class);
	private SecuencialLocalidadRepository secuencialLocalidadRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public SecuencialLocalidadComponent(SecuencialLocalidadRepository secuencialLocalidadRepository) {
		super();
		this.secuencialLocalidadRepository = secuencialLocalidadRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public List<SecuencialLocalidad> getSecuencialLocalidadById(SecuencialLocalidadQuery query){
		List<SecuencialLocalidad> secuencialLocalidad = secuencialLocalidadRepository.findByIdAndEstado(query.getId(), query.getEstado());
		List<SecuencialLocalidad> secuencialLocalidadResult = new ArrayList<SecuencialLocalidad>();
		secuencialLocalidadResult.addAll(secuencialLocalidad);
		return secuencialLocalidadResult;
	}
	public List<SecuencialLocalidad> getSecuencialLocalidadByIdEventoAndEstado(SecuencialLocalidadQuery query){
		List<SecuencialLocalidad> secuencialLocalidad = secuencialLocalidadRepository.findByIdEventoAndEstado(query.getIdEvento(), query.getEstado());
		List<SecuencialLocalidad> secuencialLocalidadResult = new ArrayList<SecuencialLocalidad>();
		secuencialLocalidadResult.addAll(secuencialLocalidad);
		return secuencialLocalidadResult;
	}
	public List<SecuencialLocalidad> getSecuencialLocalidadByIdEvento(SecuencialLocalidadQuery query){
		List<SecuencialLocalidad> secuencialLocalidad = secuencialLocalidadRepository.findByIdEvento(query.getIdEvento());
		List<SecuencialLocalidad> secuencialLocalidadResult = new ArrayList<SecuencialLocalidad>();
		secuencialLocalidadResult.addAll(secuencialLocalidad);
		return secuencialLocalidadResult;
	}
	public List<SecuencialLocalidad> getSecuencialLocalidadByEstado(SecuencialLocalidadQuery query){
		List<SecuencialLocalidad> secuencialLocalidad = secuencialLocalidadRepository.findByEstado(query.getEstado());
		List<SecuencialLocalidad> secuencialLocalidadResult = new ArrayList<SecuencialLocalidad>();
		secuencialLocalidadResult.addAll(secuencialLocalidad);
		return secuencialLocalidadResult;
	}
	public List<SecuencialLocalidad> getSecuencialLocalidadAll(){
		List<SecuencialLocalidad> secuencialLocalidad = secuencialLocalidadRepository.findAll();
		List<SecuencialLocalidad> secuencialLocalidadResult = new ArrayList<SecuencialLocalidad>();
		secuencialLocalidadResult.addAll(secuencialLocalidad);
		return secuencialLocalidadResult;
	}
	public JsonObject create(SecuencialLocalidad secuencialLocalidad){
		try {
			secuencialLocalidad.setFechaCreacion(now);
			secuencialLocalidad.setFechaModificacion(now);
			if(secuencialLocalidadRepository.save(secuencialLocalidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(secuencialLocalidad.getId());
				mensajesAlerta.setMensaje("Secuencia guardada correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear la secuencia.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear la secuencia.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(SecuencialLocalidad secuencialLocalidad){
		try {
			SecuencialLocalidad objSecuencialLocalidad = secuencialLocalidadRepository.findById(secuencialLocalidad.getId()).get();
			secuencialLocalidad.setUsuarioCreacion(objSecuencialLocalidad.getUsuarioCreacion());
			secuencialLocalidad.setFechaCreacion(objSecuencialLocalidad.getFechaCreacion());
			secuencialLocalidad.setFechaModificacion(now);
			if(secuencialLocalidadRepository.save(secuencialLocalidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Secuencia actualizada correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar la secuencia.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al actualizar la secuencia.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject setStatus(SecuencialLocalidadQuery query){
		try {
			SecuencialLocalidad objImp = secuencialLocalidadRepository.findById(query.getId()).get();
			objImp.setEstado(query.getEstado());
			objImp.setFechaModificacion(now);
			String estado = ""; 
			if(secuencialLocalidadRepository.save(objImp) != null) {
				if(query.getEstado().equals("A"))
					estado = "activada";
				else
					estado = "inactivada";
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Secuencia "+estado+" correctamente.");
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
