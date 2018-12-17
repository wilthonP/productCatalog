package com.ts.productCatalog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.Localidad;

public interface LocalidadRepository extends MongoRepository<Localidad, String>{
	
	List<Localidad> findByNombre(String nombre);
	List<Localidad> findByIdEventoAndIdLocalidadEstandar(String idEvento,String idLocalidadEstandar);
	List<Localidad> findByIdEventoOrderByIdLocalidadEstandarAsc(String idEvento);
	List<Localidad> findByIdEscenario(String idEscenario);
	List<Localidad> findByEstado(String estado);
	void deleteByIdEvento(String idEvento);
}
