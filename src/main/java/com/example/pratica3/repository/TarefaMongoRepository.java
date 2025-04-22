package com.example.pratica3.repository;

import com.example.pratica3.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaMongoRepository extends MongoRepository<Tarefa, Long> {}