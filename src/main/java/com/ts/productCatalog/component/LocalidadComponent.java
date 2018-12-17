package com.ts.productCatalog.component;

import com.ts.productCatalog.controller.LocalidadQuery;
import com.ts.productCatalog.entity.Localidad;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.LocalidadRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocalidadComponent {
	private static final Logger logger = LoggerFactory.getLogger(LocalidadComponent.class);
	private LocalidadRepository localidadRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public LocalidadComponent(LocalidadRepository localidadRepository) {
		super();
		this.localidadRepository = localidadRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public Localidad getLocalidadById(LocalidadQuery query){
		Localidad localidad = localidadRepository.findById(query.getId()).get();
		return localidad;
	}
	public List<Localidad> getLocalidadByIdEventoAndIdLocalidadEstandar(LocalidadQuery query){
		List<Localidad> localidad = localidadRepository.findByIdEventoAndIdLocalidadEstandar(query.getIdEvento(), query.getIdLocalidadEstandar());
		List<Localidad> localidadResult = new ArrayList<Localidad>();
		localidadResult.addAll(localidad);
		return localidadResult;
	}
	public List<Localidad> getLocalidadByNombre(LocalidadQuery query){
		List<Localidad> localidad = localidadRepository.findByNombre(query.getNombre());
		List<Localidad> localidadResult = new ArrayList<Localidad>();
		localidadResult.addAll(localidad);
		return localidadResult;
	}
	public List<Localidad> getLocalidadByIdEvento(LocalidadQuery query){
		List<Localidad> localidad = localidadRepository.findByIdEventoOrderByIdLocalidadEstandarAsc(query.getIdEvento());
		List<Localidad> localidadResult = new ArrayList<Localidad>();
		localidadResult.addAll(localidad);
		return localidadResult;
	}
	public List<Localidad> getLocalidadByIdEscenario(LocalidadQuery query){
		List<Localidad> localidad = localidadRepository.findByIdEscenario(query.getIdEscenario());
		List<Localidad> localidadResult = new ArrayList<Localidad>();
		localidadResult.addAll(localidad);
		return localidadResult;
	}
	public List<Localidad> getLocalidadByEstado(LocalidadQuery query){
		List<Localidad> localidad = localidadRepository.findByEstado(query.getEstado());
		List<Localidad> localidadResult = new ArrayList<Localidad>();
		localidadResult.addAll(localidad);
		return localidadResult;
	}
	public List<Localidad> getLocalidadAll(){
		List<Localidad> localidad = localidadRepository.findAll();
		List<Localidad> localidadResult = new ArrayList<Localidad>();
		localidadResult.addAll(localidad);
		return localidadResult;
	}
	public JsonObject create(Localidad localidad){
		try {
			localidad.setFechaCreacion(now);
			localidad.setFechaModificacion(now);
			if(localidadRepository.save(localidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(localidad.getId());
				mensajesAlerta.setMensaje("Localidad guardada correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear la localidad.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear la localiaad.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(Localidad localidad){
		try {
			Localidad objLocalidad = localidadRepository.findById(localidad.getId()).get();
			localidad.setUsuarioCreacion(objLocalidad.getUsuarioCreacion());
			localidad.setFechaCreacion(objLocalidad.getFechaCreacion());
			localidad.setFechaModificacion(now);
			if(localidadRepository.save(localidad) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Localidad actualizada correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar la localidad.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject setStatus(LocalidadQuery query){
		try {
			Localidad objImp = localidadRepository.findById(query.getId()).get();
			objImp.setEstado(query.getEstado());
			objImp.setFechaModificacion(now);
			String estado = ""; 
			if(localidadRepository.save(objImp) != null) {
				if(query.getEstado().equals("A"))
					estado = "activada";
				else
					estado = "inactivada";
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Localidad "+estado+" correctamente.");
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
	
	public JsonObject deleteLocalidad(LocalidadQuery query){
		try { 
			localidadRepository.deleteByIdEvento(query.getIdEvento());
			mensajesAlerta.setCodigo("01");
			mensajesAlerta.setMensaje("Localidad eliminado correctamente.");
			return mensajesAlerta.getJsonMessage();
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("problema en el sistema al eliminar la localidad.");
			logger.info("Error: " + e);
			return mensajesAlerta.getJsonMessage();
		}
	}
}
