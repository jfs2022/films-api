package com.exemple.films.api.v1.controller;

import com.exemple.films.api.domaine.service.FilmService;
import com.exemple.films.api.v1.mapping.MapperRest;
import com.exemple.films.api.v1.ressources.FilmReponse;
import com.exemple.films.api.v1.ressources.FilmRequete;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Contrôleur REST
 */
@RestController
@RequestMapping(path = "/api/film")
@Slf4j
public class FilmRestController {
    private final FilmService filmService;
    private final MapperRest mapperRest;

    public FilmRestController(FilmService filmService, MapperRest mapperRest) {
        this.filmService = filmService;
        this.mapperRest = mapperRest;
    }

    /**
     * Obtention d'un film
     *
     * @param id identifiant unique du film
     * @return les infos du film
     */
    @GetMapping(value = "/{id}")
    public @ResponseBody
    ResponseEntity<FilmReponse> obtenirFilm(@PathVariable Long id) {

        var film = filmService.obtenirFilm(id);

        log.debug("film obtenu: {}", film);

        return ResponseEntity.ok().body(mapperRest.dtoVersReponse(film));
    }

    /**
     * Création d'un film
     *
     * @param request les informations du film à créer
     * @return les informations du film créé
     */
    @PostMapping()
    public ResponseEntity<FilmReponse> ajouterFilm(@RequestBody FilmRequete request) {

        log.debug("requête: {}", request);

        var nouveauFilm = mapperRest.requeteVersDto(request);

        var filmSauvegarde = filmService.sauvegarderFilm(nouveauFilm);

        log.debug("film sauvegardé: {}", filmSauvegarde);

        return ResponseEntity.status(HttpStatus.CREATED).body(mapperRest.dtoVersReponse(filmSauvegarde));
    }
}
