package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.PrecioLocalidadQuery;
import com.ts.productCatalog.entity.PrecioLocalidad;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.PrecioLocalidadRepository;

@Component
public class PrecioLocalidadComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(PrecioLocalidadComponent.class);
	private PrecioLocalidadRepository precioLocalidadRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public PrecioLocalidadComponent(PrecioLocalidadRepository precioLocalidadRepository) {
		super();
		this.precioLocalidadRepository = precioLocalidadRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public List<PrecioLocalidad> getPrecioLocalidadById(PrecioLocalidadQuery query){
		List<PrecioLocalidad> precioLocalidad = precioLocalidadRepository.findByIdAndEstado(query.getId(), query.getEstado());
		List<PrecioLocalidad> precioLocalidadResult = new ArrayList<PrecioLocalidad>();
		precioLocalidadResult.addAll(precioLocalidad);
		return precioLocalidadResult;
	}
	public List<PrecioLocalidad> getPrecioLocalidadByIdEventoAndEstado(PrecioLocalidadQuery query){
		List<PrecioLocalidad> precioLocalidad = precioLocalidadRepository.findByIdEventoAndEstado(query.getIdEvento(), query.getEstado());
		List<PrecioLocalidad> precioLocalidadResult = new ArrayList<PrecioLocalidad>();
		precioLocalidadResult.addAll(precioLocalidad);
		return precioLocalidadResult;
	}
	public List<PrecioLocalidad> getPrecioLocalidadByIdEvento(PrecioLocalidadQuery query){
		List<PrecioLocalidad> precioLocalidad = precioLocalidadRepository.findByIdEvento(query.getIdEvento());
		List<PrecioLocalidad> precioLocalidadResult = new ArrayList<PrecioLocalidad>();
		precioLocalidadResult.addAll(precioLocalidad);
		return precioLocalidadResult;
	}
	public List<PrecioLocalidad> getPrecioLocalidadByEstado(PrecioLocalidadQuery query){
		List<PrecioLocalidad> precioLocalidad = precioLocalidadRepository.findByEstado(query.getEstado());
		List<PrecioLocalidad> precioLocalidadResult = new ArrayList<PrecioLocalidad>();
		precioLocalidadResult.addAll(precioLocalidad);
		return precioLocalidadResult;
	}
	public List<PrecioLocalidad> getPrecioLocalidadAll(){
		List<PrecioLocalidad> precioLocalidad = precioLocalidadRepository.findAll();
		List<PrecioLocalidad> precioLocalidadResult = new ArrayList<PrecioLocalidad>();
		precioLocalidadResult.addAll(precioLocalidad);
		return precioLocalidadResult;
	}
	public JsonObject create(PrecioLocalidad precioLocalidad){
		try {
			precioLocalidad.setFechaCreacion(now);
			precioLocalidad.setFechaModificacion(now);
			if(precioLocalidadRepository.save(precioLocalidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(precioLocalidad.getId());
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
	public JsonObject update(PrecioLocalidad precioLocalidad){
		try {
			PrecioLocalidad objPrecioLocalidad = precioLocalidadRepository.findById(precioLocalidad.getId()).get();
			precioLocalidad.setFechaCreacion(objPrecioLocalidad.getFechaCreacion());
			precioLocalidad.setFechaModificacion(now);
			if(precioLocalidadRepository.save(precioLocalidad) != null) {
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
	public JsonObject setStatus(PrecioLocalidadQuery query){
		try {
			PrecioLocalidad objImp = precioLocalidadRepository.findById(query.getId()).get();
			objImp.setEstado(query.getEstado());
			objImp.setFechaModificacion(now);
			String estado = ""; 
			if(precioLocalidadRepository.save(objImp) != null) {
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
