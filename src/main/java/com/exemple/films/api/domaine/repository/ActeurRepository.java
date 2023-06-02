package com.exemple.films.api.domaine.repository;

import com.exemple.films.api.domaine.entite.Acteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Dépot de données pour les acteurs
 */
public interface ActeurRepository extends JpaRepository<Acteur, Long>, JpaSpecificationExecutor<Acteur> {
}
