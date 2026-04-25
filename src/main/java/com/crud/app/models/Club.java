package com.crud.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import java.util.List;

@Document(collection = "club")
public class Club {
    @Id
    private String id;
    private String nombre;

    @DocumentReference // Relación Uno a Uno (Diapositiva 4ffcd5)
    private entrenador entrenador; 

    @DocumentReference // Relación Uno a Muchos (Diapositiva 4fedd6)
    private List<Jugador> jugadores;
    
    @DocumentReference // Relación Muchos a Uno (Diapositiva 4f8911)
    private Asociacion asociacion; 
    
    @DocumentReference // Relación Muchos a Muchos (Diapositiva 4f8532)
    private List<Competicion> competiciones;

    // --- GETTERS Y SETTERS ---

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public entrenador getEntrenador() { return entrenador; }
    public void setEntrenador(entrenador entrenador) { this.entrenador = entrenador; }

    public List<Jugador> getJugadores() { return jugadores; }
    public void setJugadores(List<Jugador> jugadores) { this.jugadores = jugadores; }

    public Asociacion getAsociacion() { return asociacion; }
    public void setAsociacion(Asociacion asociacion) { this.asociacion = asociacion; }

    public List<Competicion> getCompeticiones() { return competiciones; }
    public void setCompeticiones(List<Competicion> competiciones) { this.competiciones = competiciones; }
}
