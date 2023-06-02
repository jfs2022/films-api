package com.exemple.films.api.domaine.entite;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entité Acteur
 */
@Entity
@Table(name = "ACTEUR")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Acteur {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String nom;
    private String prenom;

}
