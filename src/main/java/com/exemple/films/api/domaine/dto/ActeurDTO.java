package com.exemple.films.api.domaine.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO qui représente un acteur
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ActeurDTO {
    private Long id;
    private String nom;
    private String prenom;
}
