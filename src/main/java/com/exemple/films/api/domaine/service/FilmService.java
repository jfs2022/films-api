package com.exemple.films.api.domaine.service;

import com.exemple.films.api.domaine.dto.FilmDTO;
import com.exemple.films.api.domaine.entite.Acteur;
import com.exemple.films.api.domaine.mapping.MapperDomaine;
import com.exemple.films.api.domaine.repository.ActeurRepository;
import com.exemple.films.api.domaine.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * Service contenant les opérations sur un Film
 */

@Service
public class FilmService {
    private final FilmRepository filmRepository;
    private final ActeurRepository acteurRepository;
    private final MapperDomaine mapperDomaine;

    public FilmService(FilmRepository filmRepository, ActeurRepository acteurRepository, MapperDomaine mapperDomaine) {
        this.filmRepository = filmRepository;
        this.acteurRepository = acteurRepository;
        this.mapperDomaine = mapperDomaine;
    }

    /**
     * Obtention d'un film de la bd
     *
     * @param id identifiant unique du film
     * @return le film trouvé
     */
    public FilmDTO obtenirFilm(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("id est null");
        }
        var film = filmRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Film introuvable"));

        film.getActeurs().sort(Comparator.comparing(Acteur::getId));

        return mapperDomaine.entiteVersDto(film);
    }

    /**
     * Sauvegarde d'un film dans la bd
     *
     * @param film a sauvegardé
     * @return le film nouvellement sauvegardé
     */
    public FilmDTO sauvegarderFilm(FilmDTO film) {

        if (film == null) {
            throw new IllegalArgumentException("Le film est null");
        }
        var entiteFilm = mapperDomaine.dtoVersEntite(film);
        var entiteFilmSauvegardee = filmRepository.save(entiteFilm);

        return mapperDomaine.entiteVersDto(entiteFilmSauvegardee);
    }
}
