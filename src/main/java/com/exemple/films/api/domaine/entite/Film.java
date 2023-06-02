package com.exemple.films.api.domaine.entite;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entité Film
 */
@Entity
@Table(name = "FILM")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Film {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String titre;
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    @EqualsAndHashCode.Exclude
    private List<Acteur> acteurs;

}
