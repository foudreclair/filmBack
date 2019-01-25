package isep.web.sakila.webapi.model;

import java.math.BigDecimal;
import java.time.Year;
import java.util.Date;

import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Film;
import isep.web.sakila.jpa.entities.Language;

public class FilmWO extends WebObject
{

	private static final long	serialVersionUID	= -1377067679473844279L;

	protected int							film_id;
	protected String					title;
	protected String					description;
	protected Date                      release_year;
	protected int                       language1;
	protected int                       language2;
	protected byte                           rentalDuration;
	protected BigDecimal                           rental_rate;
	protected int                            length;
	protected BigDecimal                     replacementCost;
	protected String                          rating;
	protected String                         specialFeatures;
	

	public FilmWO()
	{
		super();
	}


	public int getFilm_id() {
		return film_id;
	}


	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getRelease_year() {
		return release_year;
	}


	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}


	public int getLanguage1() {
		return language1;
	}


	public void setLanguage1(Language language1) {
		this.language1 = language1.getLanguageId();
	}


	public int getLanguage2() {
		return language2;
	}


	public void setLanguage2(Language language2) {
		this.language2 = language2.getLanguageId();
	}


	public byte getRentalDuration() {
		return rentalDuration;
	}


	public void setRentalDuration(byte rentalDuration) {
		this.rentalDuration = rentalDuration;
	}


	public BigDecimal getRental_rate() {
		return rental_rate;
	}


	public void setRental_rate(BigDecimal rental_rate) {
		this.rental_rate = rental_rate;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public BigDecimal getReplacementCost() {
		return replacementCost;
	}


	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getSpecialFeatures() {
		return specialFeatures;
	}


	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}


	@Override
	public String toString() {
		return "FilmWO [film_id=" + film_id + ", title=" + title + ", description=" + description + ", release_year="
				+ release_year + ", language1=" + language1 + ", language2=" + language2 + ", rentalDuration="
				+ rentalDuration + ", rental_rate=" + rental_rate + ", length=" + length + ", replacementCost="
				+ replacementCost + ", rating=" + rating + ", specialFeatures=" + specialFeatures + "]";
	}


	public FilmWO(int film_id, String title, String description, Date release_year, int language1,
			int language2, byte rentalDuration, BigDecimal rental_rate, int length, BigDecimal replacementCost,
			String rating, String specialFeatures) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.rentalDuration = rentalDuration;
		this.rental_rate = rental_rate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.language1 = language1;
		this.language2 = language2;
	}
	public FilmWO(final Film film) {
		super();
		this.film_id = film.getFilmId();
		this.title = film.getTitle();
		this.description = film.getDescription();
		this.release_year = film.getReleaseYear();
		this.rentalDuration = film.getRentalDuration();
		this.rental_rate = film.getRentalRate();
		this.length = film.getLength();
		this.replacementCost = film.getReplacementCost();
		this.rating = film.getRating();
		this.specialFeatures = film.getSpecialFeatures();
		
	}


	

	
}