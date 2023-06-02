package com.exemple.films.api.domaine.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO qui représente un film
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FilmDTO {
    private Long id;
    private String titre;
    private String description;
    private List<ActeurDTO> acteurs;
}
