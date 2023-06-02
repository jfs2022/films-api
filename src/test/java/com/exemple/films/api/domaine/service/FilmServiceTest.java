package com.exemple.films.api.domaine.service;

import com.exemple.films.api.domaine.dto.ActeurDTO;
import com.exemple.films.api.domaine.dto.FilmDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureTestDatabase
@Slf4j
public class FilmServiceTest {

    @Autowired
    private FilmService filmService;

    @Test
    public void testSauvegarderFilm() {
        var nouveauFilm = FilmDTO.builder()
                .titre("2001 A Space Oddyssey")
                .description("2001: A Space Odyssey is a 1968 epic science fiction film produced and directed by Stanley Kubrick.")
                .acteurs(List.of(
                        ActeurDTO.builder()
                                .prenom("Keir")
                                .nom("Dullea")
                                .build(),
                        ActeurDTO.builder()
                                .prenom("Gary")
                                .nom("Lockwood")
                                .build(),
                        ActeurDTO.builder()
                                .prenom("William")
                                .nom("Sylvester")
                                .build()))
                .build();
        var filmSauvegarde = filmService.sauvegarderFilm(nouveauFilm);
        log.info("Film sauvegardé: {}", filmSauvegarde);
        assertNotNull(filmSauvegarde);
    }

    @Test
    public void testSauvegarderEtObtenirFilm() {
        var nouveauFilm = FilmDTO.builder()
                .titre("Le titre")
                .description("la description")
                .acteurs(List.of(
                        ActeurDTO.builder()
                                .prenom("prenom 1")
                                .nom("nom 1")
                                .build(),
                        ActeurDTO.builder()
                                .prenom("prenom 2")
                                .nom("nom 2")
                                .build(),
                        ActeurDTO.builder()
                                .prenom("prenom 3")
                                .nom("nom 3")
                                .build()))
                .build();

        var filmSauvegarde = filmService.sauvegarderFilm(nouveauFilm);
        log.info("Film sauvegardé: {}", filmSauvegarde);
        var filmObtenu = filmService.obtenirFilm(filmSauvegarde.getId());
        log.info("Film obtenu: {}", filmObtenu);
        assertEquals(filmSauvegarde, filmObtenu);
    }

}
