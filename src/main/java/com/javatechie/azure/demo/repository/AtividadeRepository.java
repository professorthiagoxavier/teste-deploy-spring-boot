package com.javatechie.azure.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.javatechie.azure.model.Atividade;


public interface AtividadeRepository extends MongoRepository<Atividade, String> {

}
