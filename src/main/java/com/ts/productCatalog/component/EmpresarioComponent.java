package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.EmpresarioQuery;
import com.ts.productCatalog.entity.Empresario;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.EmpresarioRepository;

@Component
public class EmpresarioComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpresarioComponent.class);
	private EmpresarioRepository empresarioRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public EmpresarioComponent(EmpresarioRepository empresarioRepository) {
		super();
		this.empresarioRepository = empresarioRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public List<Empresario> getEmpresarioById(EmpresarioQuery query){
		List<Empresario> empresario = empresarioRepository.findByIdAndEstado(query.getId(), query.getEstado());
		List<Empresario> empresarioResult = new ArrayList<Empresario>();
		empresarioResult.addAll(empresario);
		return empresarioResult;
	}
	public List<Empresario> getEmpresarioByIdEventoAndEstado(EmpresarioQuery query){
		List<Empresario> empresario = empresarioRepository.findByIdEventoAndEstado(query.getIdEvento(), query.getEstado());
		List<Empresario> empresarioResult = new ArrayList<Empresario>();
		empresarioResult.addAll(empresario);
		return empresarioResult;
	}
	public List<Empresario> getEmpresarioByIdEvento(EmpresarioQuery query){
		List<Empresario> empresario = empresarioRepository.findByIdEvento(query.getIdEvento());
		List<Empresario> empresarioResult = new ArrayList<Empresario>();
		empresarioResult.addAll(empresario);
		return empresarioResult;
	}
	public List<Empresario> getEmpresarioByEstado(EmpresarioQuery query){
		List<Empresario> empresario = empresarioRepository.findByEstado(query.getEstado());
		List<Empresario> empresarioResult = new ArrayList<Empresario>();
		empresarioResult.addAll(empresario);
		return empresarioResult;
	}
	public List<Empresario> getEmpresarioAll(){
		List<Empresario> empresario = empresarioRepository.findAll();
		List<Empresario> empresarioResult = new ArrayList<Empresario>();
		empresarioResult.addAll(empresario);
		return empresarioResult;
	}
	public JsonObject create(Empresario empresario){
		try {
			empresario.setFechaCreacion(now);
			empresario.setFechaModificacion(now);
			empresario.setEstado("P");
			if(empresarioRepository.save(empresario) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(empresario.getId());
				mensajesAlerta.setMensaje("Datos de Empresario guardados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear empresario.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear empresario.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(Empresario empresario){
		try {
			Empresario objEmpresario = empresarioRepository.findById(empresario.getId()).get();
			empresario.setFechaCreacion(objEmpresario.getFechaCreacion());
			empresario.setFechaModificacion(now);
			if(empresarioRepository.save(empresario) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Datos de Empresario actualizado correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar empresario.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al actualizar empresario.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject setStatus(EmpresarioQuery query){
		try {
			Empresario objImp = empresarioRepository.findById(query.getId()).get();
			objImp.setEstado(query.getEstado());
			objImp.setFechaModificacion(now);
			String estado = ""; 
			if(empresarioRepository.save(objImp) != null) {
				if(query.getEstado().equals("A"))
					estado = "activado";
				else
					estado = "inactivado";
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Empresario "+estado+" correctamente.");
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
