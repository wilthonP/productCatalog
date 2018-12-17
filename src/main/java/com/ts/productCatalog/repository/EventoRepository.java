package com.ts.productCatalog.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.Evento;

public interface EventoRepository extends MongoRepository<Evento, String>{
	
	List<Evento> findByIdAndEstado(String id, String estado);
	List<Evento> findByNombreAndEstado(String nombre, String estado);
	List<Evento> findByFechaHoraEventoBetween(Date fechaInicio, Date fechaFin);
	List<Evento> findByTipoActividad(String tipoActividad);
	List<Evento> findByEventoNacional(boolean eventoNacional);
	List<Evento> findByAplicaPreventa(boolean aplicaPreventa);
	List<Evento> findByCiudad(String ciudad);
	List<Evento> findByEstado(String estado);
	List<Evento> findAllByOrderByNombre();
}
