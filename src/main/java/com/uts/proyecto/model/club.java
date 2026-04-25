package com.uts.proyecto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import java.util.List;

@Document(collection = "club") // [cite: 9]
public class club {
    @Id
    private String id;
    private String nombre;

    @DocumentReference // Relación Uno a Uno [cite: 12]
    private entrenador entrenador;

    @DocumentReference // Relación Uno a Muchos [cite: 36]
    private List<jugador> jugadores;

    // Getters y Setters
}