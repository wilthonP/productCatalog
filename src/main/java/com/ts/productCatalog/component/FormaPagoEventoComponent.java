package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.FormaPagoEventoQuery;
import com.ts.productCatalog.entity.FormaPagoEvento;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.FormaPagoEventoRepository;

@Component
public class FormaPagoEventoComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(FormaPagoEventoComponent.class);
	private FormaPagoEventoRepository formaPagoRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public FormaPagoEventoComponent(FormaPagoEventoRepository formaPagoRepository) {
		super();
		this.formaPagoRepository = formaPagoRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public FormaPagoEvento getFormaPagoEventoById(FormaPagoEventoQuery query){
		FormaPagoEvento objFormaPagoEvento = formaPagoRepository.findById(query.getId()).get();
		return objFormaPagoEvento;
	}
	public List<FormaPagoEvento> getFormaPagoEventoByIdEventoAndEstado(FormaPagoEventoQuery query){
		List<FormaPagoEvento> formaPago = formaPagoRepository.findByIdEventoAndEstado(query.getIdEvento(), query.getEstado());
		List<FormaPagoEvento> formaPagoResult = new ArrayList<FormaPagoEvento>();
		formaPagoResult.addAll(formaPago);
		return formaPagoResult;
	}
	public FormaPagoEvento getFormaPagoEventoByIdEvento(FormaPagoEventoQuery query){
		FormaPagoEvento formaPago = formaPagoRepository.findByIdEvento(query.getIdEvento());
		if(formaPago == null)
			formaPago = new FormaPagoEvento();
		return formaPago;
	}
	public List<FormaPagoEvento> getFormaPagoEventoByEstado(FormaPagoEventoQuery query){
		List<FormaPagoEvento> formaPago = formaPagoRepository.findByEstado(query.getEstado());
		List<FormaPagoEvento> formaPagoResult = new ArrayList<FormaPagoEvento>();
		formaPagoResult.addAll(formaPago);
		return formaPagoResult;
	}
	public List<FormaPagoEvento> getFormaPagoEventoAll(){
		List<FormaPagoEvento> formaPago = formaPagoRepository.findAll();
		List<FormaPagoEvento> formaPagoResult = new ArrayList<FormaPagoEvento>();
		formaPagoResult.addAll(formaPago);
		return formaPagoResult;
	}
	public JsonObject create(FormaPagoEvento formaPago){
		try {
			formaPago.setFechaCreacion(now);
			formaPago.setFechaModificacion(now);
			if(formaPagoRepository.save(formaPago) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(formaPago.getId());
				mensajesAlerta.setMensaje("Formas de pago del Evento guardadas correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear las Formas de pago.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear Forma de pago.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(FormaPagoEvento formaPago){
		try {
			FormaPagoEvento objFormaPagoEvento = formaPagoRepository.findById(formaPago.getId()).get();
			formaPago.setUsuarioCreacion(objFormaPagoEvento.getUsuarioCreacion());
			formaPago.setFechaCreacion(objFormaPagoEvento.getFechaCreacion());
			formaPago.setFechaModificacion(now);
			if(formaPagoRepository.save(formaPago) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Formas de pago actualizados correctamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar las Formas de pago.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al actualizar las Formas de pago.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject setStatus(FormaPagoEventoQuery query){
		try {
			FormaPagoEvento objImp = formaPagoRepository.findById(query.getId()).get();
			objImp.setEstado(query.getEstado());
			objImp.setFechaModificacion(now);
			String estado = ""; 
			if(formaPagoRepository.save(objImp) != null) {
				if(query.getEstado().equals("A"))
					estado = "activadas";
				else
					estado = "inactivadas";
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Formas de pago "+estado+" correctamente.");
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
