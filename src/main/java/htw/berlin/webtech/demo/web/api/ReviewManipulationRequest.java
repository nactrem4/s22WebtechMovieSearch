package htw.berlin.webtech.demo.web.api;

import htw.berlin.webtech.demo.persistence.MovieEntity;

public class ReviewManipulationRequest {

    private String benutzerBewertung;

    private Integer punktZahl;

    private MovieEntity movieEntity;

    public ReviewManipulationRequest(String benutzerBewertung, Integer punktZahl, MovieEntity movieEntity) {
        this.benutzerBewertung = benutzerBewertung;
        this.punktZahl = punktZahl;
        this.movieEntity = movieEntity;
    }

    public ReviewManipulationRequest() {
    }

    public String getBenutzerBewertung() {
        return benutzerBewertung;
    }

    public void setBenutzerBewertung(String benutzerBewertung) {
        this.benutzerBewertung = benutzerBewertung;
    }

    public Integer getPunktZahl() {
        return punktZahl;
    }

    public void setPunktZahl(Integer punktZahl) {
        this.punktZahl = punktZahl;
    }

    public MovieEntity getMovieEntity() {
        return movieEntity;
    }

    public void setMovieEntity(MovieEntity movieEntity) {
        this.movieEntity = movieEntity;
    }
}
