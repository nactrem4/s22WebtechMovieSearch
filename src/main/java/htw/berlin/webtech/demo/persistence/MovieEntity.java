package htw.berlin.webtech.demo.persistence;
import javax.persistence.*;

@Entity(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "film_name", nullable = false)
    private String filmName;

    @Column(name = "schauspieler_name", nullable = false)
    private String schauSpielerName;

    public MovieEntity(String filmName, String schauSpielerName) {
        this.filmName = filmName;
        this.schauSpielerName = schauSpielerName;
    }

    protected MovieEntity() {}

    public Long getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
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

}
