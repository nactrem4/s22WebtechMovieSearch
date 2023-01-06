package htw.berlin.webtech.demo.web.api;

public class MovieManipulationRequest {

    private String filmName;
    private String schauSpielerName;

    public MovieManipulationRequest(String filmName, String schauSpielerName) {
        this.filmName = filmName;
        this.schauSpielerName = schauSpielerName;
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
}
