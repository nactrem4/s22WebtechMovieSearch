package htw.berlin.webtech.demo.persistence;

import htw.berlin.webtech.demo.web.api.Movie;

import javax.persistence.*;

@Entity(name="review")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private MovieEntity movieEntity;

    @Column(name = "nutzer_bewertung", nullable = false)
    private String nutzerBewertung;

    @Column(name = "punkt_zahl", nullable = false)
    private Integer punktZahl;


    public ReviewEntity(String nutzerBewertung, Integer punktZahl, MovieEntity movieEntity) {
        this.nutzerBewertung = nutzerBewertung;
        this.punktZahl = punktZahl;
        this.movieEntity = movieEntity;
    }
    protected ReviewEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNutzerBewertung() {
        return nutzerBewertung;
    }

    public void setNutzerBewertung(String nutzerBewertung) {
        this.nutzerBewertung = nutzerBewertung;
    }

    public Integer getPunktZahl() {
        return punktZahl;
    }

    public void setPunktZahl(Integer punktZahl) {
        this.punktZahl = punktZahl;
    }
}
