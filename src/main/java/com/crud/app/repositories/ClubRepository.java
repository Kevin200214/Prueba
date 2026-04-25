package com.crud.app.repositories;

import com.crud.app.models.Club;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends MongoRepository<Club, String> {
    // No necesitas escribir nada más, Spring hace la magia.
}