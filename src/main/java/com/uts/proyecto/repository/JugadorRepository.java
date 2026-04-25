package com.uts.proyecto.repository;

import com.uts.proyecto.model.jugador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends MongoRepository<jugador, String> {
}