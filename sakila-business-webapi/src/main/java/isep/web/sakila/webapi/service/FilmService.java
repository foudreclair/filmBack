package isep.web.sakila.webapi.service;

import java.util.List;

import isep.web.sakila.webapi.model.ActorWO;
import isep.web.sakila.webapi.model.FilmWO;

public interface FilmService
{
	FilmWO findById(int id);

	void saveFilm(FilmWO userWO);

	void updateFilm(FilmWO userWO);

	void deleteFilmById(int id);

	List<FilmWO> findAllFilm();

}