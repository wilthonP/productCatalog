package com.ts.productCatalog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.ValorLocalidad;

public interface ValorLocalidadRepository extends MongoRepository<ValorLocalidad, String>{
	
	List<ValorLocalidad> findByIdAndEstado(String idEvento,String estado);
	List<ValorLocalidad> findByIdEventoAndEstado(String idEvento,String estado);
	List<ValorLocalidad> findByIdEvento(String idEvento);
	List<ValorLocalidad> findByIdEscenario(String idEscenario);
	List<ValorLocalidad> findByIdLocalidad(String idLocalidad);
	List<ValorLocalidad> findByEstado(String estado);

}