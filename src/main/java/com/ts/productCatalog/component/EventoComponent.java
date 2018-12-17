package com.ts.productCatalog.component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ts.productCatalog.controller.EventoQuery;
import com.ts.productCatalog.entity.Evento;
import com.ts.productCatalog.entity.MensajesAlerta;
import com.ts.productCatalog.repository.EmpresarioRepository;
import com.ts.productCatalog.repository.EventoRepository;

@Component
public class EventoComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(EventoComponent.class);
	private EventoRepository eventoRepository;
	MensajesAlerta mensajesAlerta;
	Date now = new Date();
	
	@Autowired
	public EventoComponent(EventoRepository eventoRepository,EmpresarioRepository empresarioRepository) {
		super();
		this.eventoRepository = eventoRepository;
		this.mensajesAlerta = new MensajesAlerta();
	}
	
	public List<Evento> getEventoById(EventoQuery query){
		List<Evento> evento = eventoRepository.findByIdAndEstado(query.getId(), query.getEstado());
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public List<Evento> getEventoByNombre(EventoQuery query){
		List<Evento> evento = eventoRepository.findByNombreAndEstado(query.getNombre(), query.getEstado());
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public List<Evento> getEventoByEstado(EventoQuery query){
		List<Evento> evento = eventoRepository.findByEstado(query.getEstado());
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public List<Evento> getEventoByCiudad(EventoQuery query){
		List<Evento> evento = eventoRepository.findByCiudad(query.getCiudad());
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public List<Evento> getEventoByEventoNacional(EventoQuery query){
		List<Evento> evento = eventoRepository.findByEventoNacional(query.isEventoNacional());
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public List<Evento> getEventoByAplicaPreventa(EventoQuery query){
		List<Evento> evento = eventoRepository.findByAplicaPreventa(query.isAplicaPreventa());
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public List<Evento> getEventoByTipoActividad(EventoQuery query){
		List<Evento> evento = eventoRepository.findByTipoActividad(query.getTipoActividad());
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public List<Evento> getEventoAll(){
		List<Evento> evento = eventoRepository.findAllByOrderByNombre();
		List<Evento> eventoResult = new ArrayList<Evento>();
		eventoResult.addAll(evento);
		return eventoResult;
	}
	public JsonObject create(Evento evento){
		try {
			evento.setFechaCreacion(now);
			evento.setFechaModificacion(now);
			evento.setFechaInicioCanje(null);
			evento.setFechaInicioNormal(null);
			evento.setFechaInicioPreventa(null);
			evento.setFechaFinCanje(null);
			evento.setFechaFinNormal(null);
			evento.setFechaFinPreventa(null);
			if(evento.getEstado() != "P") {
				if(evento.getModoVenta() == "C")
					evento.setFechaInicioCanje(now);
				else if(evento.getModoVenta() == "N")
					evento.setFechaInicioNormal(now);
				else
					evento.setFechaInicioPreventa(now);
			}
			
			if(eventoRepository.save(evento) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setParam(evento.getId());
				mensajesAlerta.setMensaje("Evento creado exitosamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al crear evento.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al crear evento.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject update(Evento evento){
		try {
			Evento objEvento = eventoRepository.findById(evento.getId()).get();
			evento.setUsuarioCreacion(objEvento.getUsuarioCreacion());
			evento.setFechaCreacion(objEvento.getFechaCreacion());
			evento.setFechaModificacion(now);
			
			if(evento.getEstado() != "P") {
				if(evento.getModoVenta() == "C" && objEvento.getModoVenta() != "C") {
					evento.setFechaInicioCanje(now);
				}else if(evento.getModoVenta() == "N" && objEvento.getModoVenta() != "N") {
					evento.setFechaInicioNormal(now);
				}else if(evento.getModoVenta() == "P" && objEvento.getModoVenta() != "P") {
					evento.setFechaInicioPreventa(now);
				}
				
				if(objEvento.getModoVenta() != null && objEvento.getModoVenta() != "") {
					if(objEvento.getModoVenta() == "C" && evento.getModoVenta() != "C") {
						evento.setFechaInicioCanje(now);
					}else if(objEvento.getModoVenta() == "N" && evento.getModoVenta() != "N") {
						evento.setFechaInicioNormal(now);
					}else if(objEvento.getModoVenta() == "P" && evento.getModoVenta() != "P") {
						evento.setFechaInicioPreventa(now);
					}
				}
					
			}
			
			if(objEvento.isCancelado() == false && evento.isCancelado() == true)
				objEvento.setFechaCancelado(now);
			
			if(eventoRepository.save(evento) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Evento actualizado exitosamente.");
			}
			else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al actualizar evento.");
			}
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("Hubo un error en el sistema al actualizar evento.");
			logger.info("Error: " + e);
		}
		return mensajesAlerta.getJsonMessage();
	}
	public JsonObject setStatus(EventoQuery query){
		try {
			Evento objEvento = eventoRepository.findById(query.getId()).get();
			objEvento.setEstado(query.getEstado());
			objEvento.setFechaModificacion(now);
			if(objEvento.isCancelado() == false && query.isCancelado() == true)
				objEvento.setFechaCancelado(now);
			String estado = ""; 
			if(eventoRepository.save(objEvento) != null) {
				if(query.getEstado().equals("A"))
					estado = "activado";
				else
					estado = "inactivado";
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Evento "+estado+" correctamente.");
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
	
	public JsonObject publishEvent(EventoQuery query){
		try {
			Evento objEvento = eventoRepository.findById(query.getId()).get();
			objEvento.setPublicado(true);
			objEvento.setFechaModificacion(now);
			if(eventoRepository.save(objEvento) != null) {
				mensajesAlerta.setCodigo("01");
				mensajesAlerta.setMensaje("Evento publicado correctamente.");
			}else {
				mensajesAlerta.setCodigo("00");
				mensajesAlerta.setMensaje("Hubo un error al publicar el evento, intente nuevamente.");
			}
			return mensajesAlerta.getJsonMessage();
		}catch(Exception e) {
			mensajesAlerta.setCodigo("00");
			mensajesAlerta.setMensaje("problema en el sistema al publicar el evento.");
			logger.info("Error: " + e);
			return mensajesAlerta.getJsonMessage();
		}
	}
}
