package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.ItemServicioValorQuery;
import com.ts.productCatalog.entity.ItemServicioValor;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.ItemServicioValorRepository;

@Component
public class ItemServicioValorComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(ItemServicioValorComponent.class);
	private ItemServicioValorRepository itemServicioValorRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public ItemServicioValorComponent(ItemServicioValorRepository itemServicioValorRepository) {
		super();
		this.itemServicioValorRepository = itemServicioValorRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public ItemServicioValor getItemServicioValorById(ItemServicioValorQuery query){
		ItemServicioValor objItemServicioValor = itemServicioValorRepository.findById(query.getId()).get();
		return objItemServicioValor;
	}
	
	public List<ItemServicioValor> getItemServicioValorAll(){
		List<ItemServicioValor> itemServicioValor = itemServicioValorRepository.findAll();
		List<ItemServicioValor> itemServicioValorResult = new ArrayList<ItemServicioValor>();
		itemServicioValorResult.addAll(itemServicioValor);
		return itemServicioValorResult;
	}
	public JsonObject create(ItemServicioValor itemServicioValor){
		try {
			if(itemServicioValorRepository.save(itemServicioValor) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(itemServicioValor.getId());
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
	public JsonObject update(ItemServicioValor itemServicioValor){
		try {
			if(itemServicioValorRepository.save(itemServicioValor) != null) {
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
