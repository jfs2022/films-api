package com.exemple.films.api.domaine.mapping;

import com.exemple.films.api.domaine.dto.ActeurDTO;
import com.exemple.films.api.domaine.dto.FilmDTO;
import com.exemple.films.api.domaine.entite.Acteur;
import com.exemple.films.api.domaine.entite.Film;

/**
 * Mapper MapStruct pour la couche domaine
 */
@org.mapstruct.Mapper(componentModel = "spring")
public abstract class MapperDomaine {

    public abstract FilmDTO entiteVersDto(Film film);

    public abstract ActeurDTO entiteVersDto(Acteur acteur);

    public abstract Film dtoVersEntite(FilmDTO filmDto);

    public abstract Acteur dtoVersEntite(ActeurDTO acteurDto);

}
