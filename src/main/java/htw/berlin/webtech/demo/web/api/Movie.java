package htw.berlin.webtech.demo.web.api;
public class Movie{

    private long id;
    private String filmName;
    private String schauSpielerNamen;

    public Movie(long id, String filmName, String schauSpielerNamen) {
        this.id = id;
        this.filmName = filmName;
        this.schauSpielerNamen = schauSpielerNamen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getSchauSpielerNamen() {
        return schauSpielerNamen;
    }

    public void setSchauSpielerNamen(String lastName) {
        this.schauSpielerNamen = schauSpielerNamen;
    }
}
