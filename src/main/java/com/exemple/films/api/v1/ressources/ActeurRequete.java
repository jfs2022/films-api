package com.exemple.films.api.v1.ressources;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Ressource pour la création d'un acteur
 *
 */
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ActeurRequete {
    private String nom;
    private String prenom;
}
