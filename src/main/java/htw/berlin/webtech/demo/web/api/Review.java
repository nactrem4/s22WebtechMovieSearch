package htw.berlin.webtech.demo.web.api;

public class Review {
    private Long id;
    private String nutzerBewertung;
    private Integer punktZahl;


    public Review(Long id, String nutzerBewertung, Integer punktZahl) {
        this.id = id;
        this.nutzerBewertung = nutzerBewertung;
        this.punktZahl = punktZahl;
    }

    public long getId() {
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
