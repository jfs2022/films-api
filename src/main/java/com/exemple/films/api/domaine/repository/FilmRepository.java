package com.exemple.films.api.domaine.repository;

import com.exemple.films.api.domaine.entite.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Dépot de données pour les films
 */
public interface FilmRepository extends JpaRepository<Film, Long>, JpaSpecificationExecutor<Film> {
}
