package com.ts.productCatalog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.PrecioLocalidad;

public interface PrecioLocalidadRepository extends MongoRepository<PrecioLocalidad, String>{
	
	List<PrecioLocalidad> findByIdAndEstado(String idEvento,String estado);
	List<PrecioLocalidad> findByIdEventoAndEstado(String idEvento,String estado);
	List<PrecioLocalidad> findByIdEvento(String idEvento);
	List<PrecioLocalidad> findByIdEscenario(String idEscenario);
	List<PrecioLocalidad> findByIdLocalidad(String idLocalidad);
	List<PrecioLocalidad> findByEstado(String estado);

}