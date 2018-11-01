package com.ts.productCatalog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ts.productCatalog.entity.ImpuestoValor;

public interface ImpuestoValorRepository extends MongoRepository<ImpuestoValor, String>{

}
