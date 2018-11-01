package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.ImpuestoValorQuery;
import com.ts.productCatalog.entity.ImpuestoValor;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.ImpuestoValorRepository;

@Component
public class ImpuestoValorComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(ImpuestoValorComponent.class);
	private ImpuestoValorRepository impuestoValorRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public ImpuestoValorComponent(ImpuestoValorRepository impuestoValorRepository) {
		super();
		this.impuestoValorRepository = impuestoValorRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public ImpuestoValor getImpuestoValorById(ImpuestoValorQuery query){
		ImpuestoValor objImpuestoValor = impuestoValorRepository.findById(query.getId()).get();
		return objImpuestoValor;
	}
	
	public List<ImpuestoValor> getImpuestoValorAll(){
		List<ImpuestoValor> impuestoValor = impuestoValorRepository.findAll();
		List<ImpuestoValor> impuestoValorResult = new ArrayList<ImpuestoValor>();
		impuestoValorResult.addAll(impuestoValor);
		return impuestoValorResult;
	}
	public JsonObject create(ImpuestoValor impuestoValor){
		try {
			if(impuestoValorRepository.save(impuestoValor) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(impuestoValor.getId());
				mensajesAlerta.setMensaje("Datos guardados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(ImpuestoValor impuestoValor){
		try {
			if(impuestoValorRepository.save(impuestoValor) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Datos actualizados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al actualizar.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
}
