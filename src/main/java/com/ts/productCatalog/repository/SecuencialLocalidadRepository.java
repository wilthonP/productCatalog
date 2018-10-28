package com.ts.productCatalog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.SecuencialLocalidad;

public interface SecuencialLocalidadRepository extends MongoRepository<SecuencialLocalidad, String>{
	
	List<SecuencialLocalidad> findByIdAndEstado(String idEvento,String estado);
	List<SecuencialLocalidad> findByIdEventoAndEstado(String idEvento,String estado);
	List<SecuencialLocalidad> findByIdEvento(String idEvento);
	List<SecuencialLocalidad> findByIdEscenario(String idEscenario);
	List<SecuencialLocalidad> findByIdLocalidad(String idLocalidad);
	List<SecuencialLocalidad> findByEstado(String estado);

}