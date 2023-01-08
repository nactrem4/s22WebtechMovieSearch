package htw.berlin.webtech.demo.web.service;


import htw.berlin.webtech.demo.persistence.MovieEntity;
import htw.berlin.webtech.demo.web.api.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieTransformer {

    public Movie transformEntity(MovieEntity movieEntity) {
        return new Movie(
                movieEntity.getId(),
                movieEntity.getFilmName(),
                movieEntity.getSchauSpielerName(),
                movieEntity.getReleaseDate(),
                movieEntity.getImagePath());
    }
}
