package com.exemple.films.api.v1.ressources;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Réponse pour les info d'un film
 */
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class FilmReponse {

    private Long id;
    private String titre;
    private String description;
    private List<ActeurReponse> acteurs;

}
