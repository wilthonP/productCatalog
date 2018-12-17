package com.ts.productCatalog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.FormaPagoEvento;

public interface FormaPagoEventoRepository extends MongoRepository<FormaPagoEvento, String>{
	
	List<FormaPagoEvento> findByIdAndEstado(String idEvento,String estado);
	List<FormaPagoEvento> findByIdEventoAndEstado(String idEvento,String estado);
	FormaPagoEvento findByIdEvento(String idEvento);
	List<FormaPagoEvento> findByEstado(String estado);
}
