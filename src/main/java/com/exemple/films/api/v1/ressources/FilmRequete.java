package com.exemple.films.api.v1.ressources;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO qui représente un film
 */
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
@Data
public class FilmRequete {

    private String titre;
    private String description;
    private List<ActeurRequete> acteurs;

}
