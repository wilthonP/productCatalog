package com.ts.productCatalog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.DisenioTicketLocalidad;

public interface DisenioTicketLocalidadRepository extends MongoRepository<DisenioTicketLocalidad, String>{
	
	List<DisenioTicketLocalidad> findByIdAndEstado(String idEvento,String estado);
	List<DisenioTicketLocalidad> findByIdEventoAndEstado(String idEvento,String estado);
	List<DisenioTicketLocalidad> findByIdEvento(String idEvento);
	List<DisenioTicketLocalidad> findByIdEscenario(String idEscenario);
	List<DisenioTicketLocalidad> findByIdLocalidad(String idLocalidad);
	List<DisenioTicketLocalidad> findByEstado(String estado);

}