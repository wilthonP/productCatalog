package com.ts.productCatalog.controller;

import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ts.productCatalog.component.EmpresarioComponent;
import com.ts.productCatalog.component.EventoComponent;
import com.ts.productCatalog.entity.Empresario;
import com.ts.productCatalog.entity.Evento;

@CrossOrigin
@RestController
@RequestMapping("/productCatalog")
public class ProductCatalogController {
	
	private EventoComponent eventoComponent;
	private EmpresarioComponent empresarioComponent;

	@Autowired
	public ProductCatalogController(EventoComponent eventoComponent, EmpresarioComponent empresarioComponent) {
		super();
		this.eventoComponent = eventoComponent;
		this.empresarioComponent = empresarioComponent;
	}
	
	/******************************** EVENTOS ****************************************/
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoById", method = RequestMethod.POST)
	List<Evento> searchById(@RequestBody EventoQuery query){
		return eventoComponent.getEventoById(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoByNombre", method = RequestMethod.POST)
	List<Evento> searchByNombre(@RequestBody EventoQuery query){
		return eventoComponent.getEventoByNombre(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoByCiudad", method = RequestMethod.POST)
	List<Evento> searchByCiudad(@RequestBody EventoQuery query){
		return eventoComponent.getEventoByCiudad(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoByEventoNacional", method = RequestMethod.POST)
	List<Evento> searchByEventoNacional(@RequestBody EventoQuery query){
		return eventoComponent.getEventoByEventoNacional(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoByAplicaPreventa", method = RequestMethod.POST)
	List<Evento> searchByAplicaPreventa(@RequestBody EventoQuery query){
		return eventoComponent.getEventoByAplicaPreventa(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoByTipoActividad", method = RequestMethod.POST)
	List<Evento> searchByTipoActividad(@RequestBody EventoQuery query){
		return eventoComponent.getEventoByTipoActividad(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoByEstado", method = RequestMethod.POST)
	List<Evento> searchByEstado(@RequestBody EventoQuery query){
		return eventoComponent.getEventoByEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getEventoAll", method = RequestMethod.POST)
	List<Evento> getEventoAll(){
		return eventoComponent.getEventoAll();
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/createEvento", method = RequestMethod.POST)
	JsonObject createEvento(@RequestBody Evento evento) throws Exception{
		return eventoComponent.create(evento);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/updateEvento", method = RequestMethod.POST)
	JsonObject updateEvento(@RequestBody Evento evento) throws Exception{
		return eventoComponent.update(evento);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/setStatusEvento", method = RequestMethod.POST)
	JsonObject setStatusEvento(@RequestBody EventoQuery query) throws Exception{
		return eventoComponent.setStatus(query);
	}
	
	/******************************** EMPRESARIO ****************************************/
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcEmpresarioById", method = RequestMethod.POST)
	List<Empresario> searchEmpresarioById(@RequestBody EmpresarioQuery query){
		return empresarioComponent.getEmpresarioById(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcEmpresarioByIdEventoAndEstado", method = RequestMethod.POST)
	List<Empresario> getEmpresarioByIdEventoAndEstado(@RequestBody EmpresarioQuery query){
		return empresarioComponent.getEmpresarioByIdEventoAndEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcEmpresarioByIdEvento", method = RequestMethod.POST)
	List<Empresario> getEmpresarioByIdEvento(@RequestBody EmpresarioQuery query){
		return empresarioComponent.getEmpresarioByIdEvento(query);
	}	
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcEmpresarioByEstado", method = RequestMethod.POST)
	List<Empresario> searchEmpresarioByEstado(@RequestBody EmpresarioQuery query){
		return empresarioComponent.getEmpresarioByEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcEmpresarioAll", method = RequestMethod.POST)
	List<Empresario> getEmpresarioAll(){
		return empresarioComponent.getEmpresarioAll();
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/createPcEmpresario", method = RequestMethod.POST)
	JsonObject createEmpresario(@RequestBody Empresario empresario) throws Exception{
		return empresarioComponent.create(empresario);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/updatePcEmpresario", method = RequestMethod.POST)
	JsonObject updateEmpresario(@RequestBody Empresario empresario) throws Exception{
		return empresarioComponent.update(empresario);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/setStatusEmpresario", method = RequestMethod.POST)
	JsonObject setStatusEmpresario(@RequestBody EmpresarioQuery query) throws Exception{
		return empresarioComponent.setStatus(query);
	}
}
