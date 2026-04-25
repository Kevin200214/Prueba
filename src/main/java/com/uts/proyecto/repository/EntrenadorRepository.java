package com.uts.proyecto.repository;

import com.uts.proyecto.model.entrenador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends MongoRepository<entrenador, String> {
}