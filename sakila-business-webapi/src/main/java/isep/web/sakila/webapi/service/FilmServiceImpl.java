package isep.web.sakila.webapi.service;

import java.sql.Timestamp;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import isep.web.sakila.dao.repositories.ActorRepository;
import isep.web.sakila.dao.repositories.FilmRepository;
import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Film;
import isep.web.sakila.webapi.model.FilmWO;

@Service("filmService")
@Transactional
public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilmRepository filmRepository;

	private static final Log log = LogFactory.getLog(FilmServiceImpl.class);

	@Override
	public List<FilmWO> findAllFilm() {
		List<FilmWO> films = new LinkedList<FilmWO>();

		for (Film film : filmRepository.findAll()) {
			System.out.println(film);
			films.add(new FilmWO(film));
			log.debug("Adding " + film);
		}

		return films;
	}

	@Override
	public FilmWO findById(int id) {
		log.debug(String.format("Looking for film by Id %s", id));
		Film film = filmRepository.findById(id).get();

		if (film != null) {
			return new FilmWO(film);
		}
		return null;
	}

	@Override
	public void saveFilm(FilmWO filmWO) {
		Film film = new Film();
		film.setDescription(filmWO.getDescription());
		film.setTitle(filmWO.getTitle());
		film.setReleaseYear(filmWO.getRelease_year());
		film.setRentalDuration(filmWO.getRentalDuration());
		film.setRentalRate(filmWO.getRental_rate());
		film.setLength(filmWO.getLength());
		film.setReplacementCost(filmWO.getReplacementCost());
		film.setRating(filmWO.getRating());
		film.setSpecialFeatures(filmWO.getSpecialFeatures());
		film.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		filmRepository.save(film);
	}

	@Override
	public void updateFilm(FilmWO filmWO) {
		Film film2update = filmRepository.findById(filmWO.getFilm_id()).get();
		film2update.setDescription(filmWO.getDescription());
		film2update.setTitle(filmWO.getTitle());
		film2update.setReleaseYear(filmWO.getRelease_year());
		film2update.setRentalDuration(filmWO.getRentalDuration());
         film2update.setRentalRate(filmWO.getRental_rate());
         film2update.setLength(filmWO.getLength());
         film2update.setReplacementCost(filmWO.getReplacementCost());
         film2update.setRating(filmWO.getRating());
         film2update.setSpecialFeatures(filmWO.getSpecialFeatures());
		film2update.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		filmRepository.save(film2update);
	}

	@Override
	public void deleteFilmById(int id) {
		filmRepository.deleteById(id);
	}

}