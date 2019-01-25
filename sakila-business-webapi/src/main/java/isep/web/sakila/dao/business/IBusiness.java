package isep.web.sakila.dao.business;

import java.util.List;

import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Film;

public interface IBusiness
{
	public List<Actor> getAllActors();

	public Actor getByID(int actorId);
	
	public List<Film> getAllFilms();

	public Film getByID2(int filmId);

}