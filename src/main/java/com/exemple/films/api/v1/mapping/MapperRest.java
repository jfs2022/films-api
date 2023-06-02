package com.exemple.films.api.v1.mapping;

import com.exemple.films.api.domaine.dto.ActeurDTO;
import com.exemple.films.api.domaine.dto.FilmDTO;
import com.exemple.films.api.v1.ressources.ActeurReponse;
import com.exemple.films.api.v1.ressources.ActeurRequete;
import com.exemple.films.api.v1.ressources.FilmReponse;
import com.exemple.films.api.v1.ressources.FilmRequete;

/**
 * Mapper MapStruct pour la couche Rest
 */
@org.mapstruct.Mapper(componentModel = "spring")
public abstract class MapperRest {

    public abstract FilmDTO requeteVersDto(FilmRequete film);

    public abstract ActeurDTO requeteVersDto(ActeurRequete acteur);

    public abstract FilmReponse dtoVersReponse(FilmDTO filmDto);

    public abstract ActeurReponse dtoVersReponse(ActeurDTO acteurDto);
}
