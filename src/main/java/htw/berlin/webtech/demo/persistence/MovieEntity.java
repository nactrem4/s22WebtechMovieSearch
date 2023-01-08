package htw.berlin.webtech.demo.persistence;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "image_path", nullable = false)
    private String imagePath;

    @Column(name = "release_date", nullable = false)
    private Date releaseDate;

    @Column(name = "film_name", nullable = false)
    private String filmName;

    @Column(name = "schauspieler_name", nullable = false)
    private String schauSpielerName;

    public MovieEntity(String filmName, String schauSpielerName, Date releaseDate, String imagePath) {
        this.filmName = filmName;
        this.schauSpielerName = schauSpielerName;
        this.releaseDate = releaseDate;
        this.imagePath = imagePath;
    }

    public MovieEntity(Long movieID) {
        this.id = movieID;
    }

    public MovieEntity() {

    }

    public Long getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void SetReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public void setFilmName(String firstName) {
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
}


