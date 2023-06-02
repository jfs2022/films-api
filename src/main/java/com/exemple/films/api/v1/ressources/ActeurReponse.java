package com.exemple.films.api.v1.ressources;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Réponse pour les info d'un acteur
 */
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ActeurReponse {
    private Long id;
    private String nom;
    private String prenom;
}
