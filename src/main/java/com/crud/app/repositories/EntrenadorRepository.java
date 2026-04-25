package com.crud.app.repositories;

import com.crud.app.models.entrenador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntrenadorRepository extends MongoRepository<entrenador, String> {
}