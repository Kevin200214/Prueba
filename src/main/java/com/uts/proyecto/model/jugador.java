package com.uts.proyecto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jugadores")
public class jugador {
    @Id
    private String id; // [cite: 43]
    private String nombre; // [cite: 45]
    private String apellido; // [cite: 46]
    private int numero; // [cite: 47]
    private String posicion; // [cite: 48]

    // Getters y Setters
}