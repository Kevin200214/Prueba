package com.uts.proyecto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "entrenadores")
public class entrenador {
    @Id
    private String id; // [cite: 19]
    private String nombre; // [cite: 21]
    private String apellido; // [cite: 22]
    private int edad; // [cite: 23]
    private String nacionalidad; // [cite: 24]

    // Getters y Setters
}