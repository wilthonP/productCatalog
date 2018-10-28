package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.DisenioTicketLocalidadQuery;
import com.ts.productCatalog.entity.DisenioTicketLocalidad;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.DisenioTicketLocalidadRepository;

@Component
public class DisenioTicketLocalidadComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(DisenioTicketLocalidadComponent.class);
	private DisenioTicketLocalidadRepository disenioTicketLocalidadRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public DisenioTicketLocalidadComponent(DisenioTicketLocalidadRepository disenioTicketLocalidadRepository) {
		super();
		this.disenioTicketLocalidadRepository = disenioTicketLocalidadRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public List<DisenioTicketLocalidad> getDisenioTicketLocalidadById(DisenioTicketLocalidadQuery query){
		List<DisenioTicketLocalidad> disenioTicketLocalidad = disenioTicketLocalidadRepository.findByIdAndEstado(query.getId(), query.getEstado());
		List<DisenioTicketLocalidad> disenioTicketLocalidadResult = new ArrayList<DisenioTicketLocalidad>();
		disenioTicketLocalidadResult.addAll(disenioTicketLocalidad);
		return disenioTicketLocalidadResult;
	}
	public List<DisenioTicketLocalidad> getDisenioTicketLocalidadByIdEventoAndEstado(DisenioTicketLocalidadQuery query){
		List<DisenioTicketLocalidad> disenioTicketLocalidad = disenioTicketLocalidadRepository.findByIdEventoAndEstado(query.getIdEvento(), query.getEstado());
		List<DisenioTicketLocalidad> disenioTicketLocalidadResult = new ArrayList<DisenioTicketLocalidad>();
		disenioTicketLocalidadResult.addAll(disenioTicketLocalidad);
		return disenioTicketLocalidadResult;
	}
	public List<DisenioTicketLocalidad> getDisenioTicketLocalidadByIdEvento(DisenioTicketLocalidadQuery query){
		List<DisenioTicketLocalidad> disenioTicketLocalidad = disenioTicketLocalidadRepository.findByIdEvento(query.getIdEvento());
		List<DisenioTicketLocalidad> disenioTicketLocalidadResult = new ArrayList<DisenioTicketLocalidad>();
		disenioTicketLocalidadResult.addAll(disenioTicketLocalidad);
		return disenioTicketLocalidadResult;
	}
	public List<DisenioTicketLocalidad> getDisenioTicketLocalidadByEstado(DisenioTicketLocalidadQuery query){
		List<DisenioTicketLocalidad> disenioTicketLocalidad = disenioTicketLocalidadRepository.findByEstado(query.getEstado());
		List<DisenioTicketLocalidad> disenioTicketLocalidadResult = new ArrayList<DisenioTicketLocalidad>();
		disenioTicketLocalidadResult.addAll(disenioTicketLocalidad);
		return disenioTicketLocalidadResult;
	}
	public List<DisenioTicketLocalidad> getDisenioTicketLocalidadAll(){
		List<DisenioTicketLocalidad> disenioTicketLocalidad = disenioTicketLocalidadRepository.findAll();
		List<DisenioTicketLocalidad> disenioTicketLocalidadResult = new ArrayList<DisenioTicketLocalidad>();
		disenioTicketLocalidadResult.addAll(disenioTicketLocalidad);
		return disenioTicketLocalidadResult;
	}
	public JsonObject create(DisenioTicketLocalidad disenioTicketLocalidad){
		try {
			disenioTicketLocalidad.setFechaCreacion(now);
			disenioTicketLocalidad.setFechaModificacion(now);
			if(disenioTicketLocalidadRepository.save(disenioTicketLocalidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(disenioTicketLocalidad.getId());
				mensajesAlerta.setMensaje("Precios del Evento guardados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear los precios.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear los precios.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(DisenioTicketLocalidad disenioTicketLocalidad){
		try {
			DisenioTicketLocalidad objDisenioTicketLocalidad = disenioTicketLocalidadRepository.findById(disenioTicketLocalidad.getId()).get();
			disenioTicketLocalidad.setFechaCreacion(objDisenioTicketLocalidad.getFechaCreacion());
			disenioTicketLocalidad.setFechaModificacion(now);
			if(disenioTicketLocalidadRepository.save(disenioTicketLocalidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Precios actualizados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar los precios.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al actualizar los precios.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject setStatus(DisenioTicketLocalidadQuery query){
		try {
			DisenioTicketLocalidad objImp = disenioTicketLocalidadRepository.findById(query.getId()).get();
			objImp.setEstado(query.getEstado());
			objImp.setFechaModificacion(now);
			String estado = ""; 
			if(disenioTicketLocalidadRepository.save(objImp) != null) {
				if(query.getEstado().equals("A"))
					estado = "activados";
				else
					estado = "inactivados";
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Precios "+estado+" correctamente.");
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
