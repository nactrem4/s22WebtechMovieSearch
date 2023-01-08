package htw.berlin.webtech.demo.web.api;

import java.util.Date;

public class Movie {
    private long id;
    private String filmName;
    private String schauSpielerNamen;
    private String imagePath;
    private Date releaseDate;

    public Movie(long id, String filmName, String schauSpielerNamen, Date releaseDate, String imagePath) {
        this.id = id;
        this.filmName = filmName;
        this.schauSpielerNamen = schauSpielerNamen;
        this.releaseDate = releaseDate;
        this.imagePath = imagePath;
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

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public String getSchauSpielerNamen() {
        return schauSpielerNamen;
    }

    public void setSchauSpielerNamen(String lastName) {
        this.schauSpielerNamen = schauSpielerNamen;
    }

    public String getImagePath() {
        return this.imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
