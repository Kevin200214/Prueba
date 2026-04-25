package com.crud.app.controllers;

import com.crud.app.models.Club;
import com.crud.app.models.entrenador; // Asegúrate de que la E sea mayúscula
import com.crud.app.models.Jugador;
import com.crud.app.models.Asociacion; // Nueva entidad
import com.crud.app.models.Competicion; // Nueva entidad
import com.crud.app.repositories.ClubRepository;
import com.crud.app.repositories.EntrenadorRepository;
import com.crud.app.repositories.JugadorRepository;
import com.crud.app.repositories.AsociacionRepository; // Nuevo repo
import com.crud.app.repositories.CompeticionRepository; // Nuevo repo
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clubes")
@CrossOrigin(origins = "*")
public class ClubController {

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private AsociacionRepository asociacionRepository;

    @Autowired
    private CompeticionRepository competicionRepository;

    // --- MÉTODOS DE CONSULTA ---

    @GetMapping("/listar")
    public List<Club> listar() {
        return clubRepository.findAll();
    }

    // --- MÉTODOS DE CREACIÓN (Para usar en Postman) ---

    @PostMapping("/guardar")
    public Club guardar(@RequestBody Club club) {
        return clubRepository.save(club);
    }

    @PostMapping("/entrenador")
    public entrenador guardarEntrenador(@RequestBody entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    @PostMapping("/jugador")
    public Jugador guardarJugador(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @PostMapping("/asociacion")
    public Asociacion guardarAsociacion(@RequestBody Asociacion asociacion) {
        return asociacionRepository.save(asociacion);
    }

    @PostMapping("/competicion")
    public Competicion guardarCompeticion(@RequestBody Competicion competicion) {
        return competicionRepository.save(competicion);
    }
}