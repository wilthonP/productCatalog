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

import com.ts.productCatalog.component.AutorizacionEventoComponent;
import com.ts.productCatalog.component.DisenioTicketLocalidadComponent;
import com.ts.productCatalog.component.EmpresarioComponent;
import com.ts.productCatalog.component.EventoComponent;
import com.ts.productCatalog.component.PrecioLocalidadComponent;
import com.ts.productCatalog.component.SecuencialLocalidadComponent;
import com.ts.productCatalog.component.ValorLocalidadComponent;
import com.ts.productCatalog.entity.AutorizacionEvento;
import com.ts.productCatalog.entity.DisenioTicketLocalidad;
import com.ts.productCatalog.entity.Empresario;
import com.ts.productCatalog.entity.Evento;
import com.ts.productCatalog.entity.PrecioLocalidad;
import com.ts.productCatalog.entity.SecuencialLocalidad;
import com.ts.productCatalog.entity.ValorLocalidad;

@CrossOrigin
@RestController
@RequestMapping("/productCatalog")
public class ProductCatalogController {
	
	private EventoComponent eventoComponent;
	private EmpresarioComponent empresarioComponent;
	private AutorizacionEventoComponent autorizacionEventoComponent;
	private PrecioLocalidadComponent precioLocalidadComponent;
	private SecuencialLocalidadComponent secuencialLocalidadComponent;
	private DisenioTicketLocalidadComponent disenioTicketLocalidadComponent;
	private ValorLocalidadComponent valorLocalidadComponent;

	@Autowired
	public ProductCatalogController(EventoComponent eventoComponent, EmpresarioComponent empresarioComponent,
			AutorizacionEventoComponent autorizacionEventoComponent,PrecioLocalidadComponent precioLocalidadComponent,
			SecuencialLocalidadComponent secuencialLocalidadComponent, DisenioTicketLocalidadComponent disenioTicketLocalidadComponent,
			ValorLocalidadComponent valorLocalidadComponent) {
		super();
		this.eventoComponent = eventoComponent;
		this.empresarioComponent = empresarioComponent;
		this.autorizacionEventoComponent = autorizacionEventoComponent;
		this.precioLocalidadComponent = precioLocalidadComponent;
		this.secuencialLocalidadComponent = secuencialLocalidadComponent;
		this.disenioTicketLocalidadComponent = disenioTicketLocalidadComponent;
		this.valorLocalidadComponent = valorLocalidadComponent;
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
	
	/******************************** AUTORIZACION EVENTO ****************************************/
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcAutorizacionEventoById", method = RequestMethod.POST)
	List<AutorizacionEvento> searchAutorizacionEventoById(@RequestBody AutorizacionEventoQuery query){
		return autorizacionEventoComponent.getAutorizacionEventoById(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcAutorizacionEventoByIdEventoAndEstado", method = RequestMethod.POST)
	List<AutorizacionEvento> getAutorizacionEventoByIdEventoAndEstado(@RequestBody AutorizacionEventoQuery query){
		return autorizacionEventoComponent.getAutorizacionEventoByIdEventoAndEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcAutorizacionEventoByIdEvento", method = RequestMethod.POST)
	List<AutorizacionEvento> getAutorizacionEventoByIdEvento(@RequestBody AutorizacionEventoQuery query){
		return autorizacionEventoComponent.getAutorizacionEventoByIdEvento(query);
	}	
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcAutorizacionEventoByEstado", method = RequestMethod.POST)
	List<AutorizacionEvento> searchAutorizacionEventoByEstado(@RequestBody AutorizacionEventoQuery query){
		return autorizacionEventoComponent.getAutorizacionEventoByEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcAutorizacionEventoAll", method = RequestMethod.POST)
	List<AutorizacionEvento> getAutorizacionEventoAll(){
		return autorizacionEventoComponent.getAutorizacionEventoAll();
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/createPcAutorizacionEvento", method = RequestMethod.POST)
	JsonObject createAutorizacionEvento(@RequestBody AutorizacionEvento autorizacionEvento) throws Exception{
		return autorizacionEventoComponent.create(autorizacionEvento);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/updatePcAutorizacionEvento", method = RequestMethod.POST)
	JsonObject updateAutorizacionEvento(@RequestBody AutorizacionEvento autorizacionEvento) throws Exception{
		return autorizacionEventoComponent.update(autorizacionEvento);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/setStatusAutorizacionEvento", method = RequestMethod.POST)
	JsonObject setStatusAutorizacionEvento(@RequestBody AutorizacionEventoQuery query) throws Exception{
		return autorizacionEventoComponent.setStatus(query);
	}
	
	/******************************** PRRECIOS POR LOCALIDAD ****************************************/
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcPrecioLocalidadById", method = RequestMethod.POST)
	List<PrecioLocalidad> searchPrecioLocalidadById(@RequestBody PrecioLocalidadQuery query){
		return precioLocalidadComponent.getPrecioLocalidadById(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcPrecioLocalidadByIdEventoAndEstado", method = RequestMethod.POST)
	List<PrecioLocalidad> getPrecioLocalidadByIdEventoAndEstado(@RequestBody PrecioLocalidadQuery query){
		return precioLocalidadComponent.getPrecioLocalidadByIdEventoAndEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcPrecioLocalidadByIdEvento", method = RequestMethod.POST)
	List<PrecioLocalidad> getPrecioLocalidadByIdEvento(@RequestBody PrecioLocalidadQuery query){
		return precioLocalidadComponent.getPrecioLocalidadByIdEvento(query);
	}	
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcPrecioLocalidadByEstado", method = RequestMethod.POST)
	List<PrecioLocalidad> searchPrecioLocalidadByEstado(@RequestBody PrecioLocalidadQuery query){
		return precioLocalidadComponent.getPrecioLocalidadByEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcPrecioLocalidadAll", method = RequestMethod.POST)
	List<PrecioLocalidad> getPrecioLocalidadAll(){
		return precioLocalidadComponent.getPrecioLocalidadAll();
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/createPcPrecioLocalidad", method = RequestMethod.POST)
	JsonObject createPrecioLocalidad(@RequestBody PrecioLocalidad precioLocalidad) throws Exception{
		return precioLocalidadComponent.create(precioLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/updatePcPrecioLocalidad", method = RequestMethod.POST)
	JsonObject updatePrecioLocalidad(@RequestBody PrecioLocalidad precioLocalidad) throws Exception{
		return precioLocalidadComponent.update(precioLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/setStatusPrecioLocalidad", method = RequestMethod.POST)
	JsonObject setStatusPrecioLocalidad(@RequestBody PrecioLocalidadQuery query) throws Exception{
		return precioLocalidadComponent.setStatus(query);
	}
	
	/**************************** SECUENCIALES DE LOCALIDADES *************************************/
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcSecuencialLocalidadById", method = RequestMethod.POST)
	List<SecuencialLocalidad> searchSecuencialLocalidadById(@RequestBody SecuencialLocalidadQuery query){
		return secuencialLocalidadComponent.getSecuencialLocalidadById(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcSecuencialLocalidadByIdEventoAndEstado", method = RequestMethod.POST)
	List<SecuencialLocalidad> getSecuencialLocalidadByIdEventoAndEstado(@RequestBody SecuencialLocalidadQuery query){
		return secuencialLocalidadComponent.getSecuencialLocalidadByIdEventoAndEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcSecuencialLocalidadByIdEvento", method = RequestMethod.POST)
	List<SecuencialLocalidad> getSecuencialLocalidadByIdEvento(@RequestBody SecuencialLocalidadQuery query){
		return secuencialLocalidadComponent.getSecuencialLocalidadByIdEvento(query);
	}	
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcSecuencialLocalidadByEstado", method = RequestMethod.POST)
	List<SecuencialLocalidad> searchSecuencialLocalidadByEstado(@RequestBody SecuencialLocalidadQuery query){
		return secuencialLocalidadComponent.getSecuencialLocalidadByEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcSecuencialLocalidadAll", method = RequestMethod.POST)
	List<SecuencialLocalidad> getSecuencialLocalidadAll(){
		return secuencialLocalidadComponent.getSecuencialLocalidadAll();
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/createPcSecuencialLocalidad", method = RequestMethod.POST)
	JsonObject createSecuencialLocalidad(@RequestBody SecuencialLocalidad secuencialLocalidad) throws Exception{
		return secuencialLocalidadComponent.create(secuencialLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/updatePcSecuencialLocalidad", method = RequestMethod.POST)
	JsonObject updateSecuencialLocalidad(@RequestBody SecuencialLocalidad secuencialLocalidad) throws Exception{
		return secuencialLocalidadComponent.update(secuencialLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/setStatusSecuencialLocalidad", method = RequestMethod.POST)
	JsonObject setStatusSecuencialLocalidad(@RequestBody SecuencialLocalidadQuery query) throws Exception{
		return secuencialLocalidadComponent.setStatus(query);
	}
	
	/**************************** DISENIO DE TICKETS POR LOCALIDAD *******************************/
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcDisenioTicketLocalidadById", method = RequestMethod.POST)
	List<DisenioTicketLocalidad> searchDisenioTicketLocalidadById(@RequestBody DisenioTicketLocalidadQuery query){
		return disenioTicketLocalidadComponent.getDisenioTicketLocalidadById(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcDisenioTicketLocalidadByIdEventoAndEstado", method = RequestMethod.POST)
	List<DisenioTicketLocalidad> getDisenioTicketLocalidadByIdEventoAndEstado(@RequestBody DisenioTicketLocalidadQuery query){
		return disenioTicketLocalidadComponent.getDisenioTicketLocalidadByIdEventoAndEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcDisenioTicketLocalidadByIdEvento", method = RequestMethod.POST)
	List<DisenioTicketLocalidad> getDisenioTicketLocalidadByIdEvento(@RequestBody DisenioTicketLocalidadQuery query){
		return disenioTicketLocalidadComponent.getDisenioTicketLocalidadByIdEvento(query);
	}	
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcDisenioTicketLocalidadByEstado", method = RequestMethod.POST)
	List<DisenioTicketLocalidad> searchDisenioTicketLocalidadByEstado(@RequestBody DisenioTicketLocalidadQuery query){
		return disenioTicketLocalidadComponent.getDisenioTicketLocalidadByEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcDisenioTicketLocalidadAll", method = RequestMethod.POST)
	List<DisenioTicketLocalidad> getDisenioTicketLocalidadAll(){
		return disenioTicketLocalidadComponent.getDisenioTicketLocalidadAll();
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/createPcDisenioTicketLocalidad", method = RequestMethod.POST)
	JsonObject createDisenioTicketLocalidad(@RequestBody DisenioTicketLocalidad disenioTicketLocalidad) throws Exception{
		return disenioTicketLocalidadComponent.create(disenioTicketLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/updatePcDisenioTicketLocalidad", method = RequestMethod.POST)
	JsonObject updateDisenioTicketLocalidad(@RequestBody DisenioTicketLocalidad disenioTicketLocalidad) throws Exception{
		return disenioTicketLocalidadComponent.update(disenioTicketLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/setStatusDisenioTicketLocalidad", method = RequestMethod.POST)
	JsonObject setStatusDisenioTicketLocalidad(@RequestBody DisenioTicketLocalidadQuery query) throws Exception{
		return disenioTicketLocalidadComponent.setStatus(query);
	}
	
	/**************************** VALORES DE LOCALIDAD *******************************/
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcValorLocalidadById", method = RequestMethod.POST)
	List<ValorLocalidad> searchValorLocalidadById(@RequestBody ValorLocalidadQuery query){
		return valorLocalidadComponent.getValorLocalidadById(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcValorLocalidadByIdEventoAndEstado", method = RequestMethod.POST)
	List<ValorLocalidad> getValorLocalidadByIdEventoAndEstado(@RequestBody ValorLocalidadQuery query){
		return valorLocalidadComponent.getValorLocalidadByIdEventoAndEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcValorLocalidadByIdEvento", method = RequestMethod.POST)
	List<ValorLocalidad> getValorLocalidadByIdEvento(@RequestBody ValorLocalidadQuery query){
		return valorLocalidadComponent.getValorLocalidadByIdEvento(query);
	}	
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcValorLocalidadByEstado", method = RequestMethod.POST)
	List<ValorLocalidad> searchValorLocalidadByEstado(@RequestBody ValorLocalidadQuery query){
		return valorLocalidadComponent.getValorLocalidadByEstado(query);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/getPcValorLocalidadAll", method = RequestMethod.POST)
	List<ValorLocalidad> getValorLocalidadAll(){
		return valorLocalidadComponent.getValorLocalidadAll();
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/createPcValorLocalidad", method = RequestMethod.POST)
	JsonObject createValorLocalidad(@RequestBody ValorLocalidad valorLocalidad) throws Exception{
		return valorLocalidadComponent.create(valorLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/updatePcValorLocalidad", method = RequestMethod.POST)
	JsonObject updateValorLocalidad(@RequestBody ValorLocalidad valorLocalidad) throws Exception{
		return valorLocalidadComponent.update(valorLocalidad);
	}
	@Cacheable(value = "post-single", key = "#query", unless = "#result.shares < 500")
	@RequestMapping(value="/setStatusValorLocalidad", method = RequestMethod.POST)
	JsonObject setStatusValorLocalidad(@RequestBody ValorLocalidadQuery query) throws Exception{
		return valorLocalidadComponent.setStatus(query);
	}
}
