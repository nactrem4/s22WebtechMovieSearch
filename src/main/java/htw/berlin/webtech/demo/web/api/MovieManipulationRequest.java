package htw.berlin.webtech.demo.web.api;

import java.util.Date;

public class MovieManipulationRequest {

    private String filmName;
    private String schauSpielerName;

    private String imagePath;

    private Date releaseDate;

    public MovieManipulationRequest(String filmName, String schauSpielerName, String imagePath, Date releaseDate) {
        this.filmName = filmName;
        this.schauSpielerName = schauSpielerName;
        this.imagePath = imagePath;
        this.releaseDate = releaseDate;
    }
    public MovieManipulationRequest() {}

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getSchauSpielerName() {
        return schauSpielerName;
    }

    public void setSchauSpielerName(String schauSpielerName) {
        this.schauSpielerName = schauSpielerName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
