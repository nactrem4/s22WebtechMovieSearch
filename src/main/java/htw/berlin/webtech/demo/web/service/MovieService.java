package htw.berlin.webtech.demo.web.service;


import htw.berlin.webtech.demo.persistence.MovieEntity;
import htw.berlin.webtech.demo.persistence.MovieRepository;
import htw.berlin.webtech.demo.web.api.MovieManipulationRequest;
import htw.berlin.webtech.demo.web.api.Movie;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final MovieTransformer movieTransformer;

    public MovieService(MovieRepository movieRepository, MovieTransformer movieTransformer) {
        this.movieRepository = movieRepository;
        this.movieTransformer = movieTransformer;
    }

    public List<Movie> findAll() {
        List<MovieEntity> movies = movieRepository.findAll();
        return movies.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public Movie findById(Long id) {
        var movieEntity = movieRepository.findById(id);
        return movieEntity.map(this::transformEntity).orElse(null);
    }

    public Movie create(MovieManipulationRequest request) {
        var movieEntity = new MovieEntity(request.getFilmName(), request.getSchauSpielerName(), request.getReleaseDate(), request.getImagePath());
        movieEntity = movieRepository.save(movieEntity);
        return transformEntity(movieEntity);
    }

    public Movie update(Long id, MovieManipulationRequest request) {
        var movieEntityOptional = movieRepository.findById(id);
        if (movieEntityOptional.isEmpty()) {
            return null;
        }

        var movieEntity = movieEntityOptional.get();
        movieEntity.setFilmName(request.getFilmName());
        movieEntity.setSchauSpielerName(request.getSchauSpielerName());
        movieEntity = movieRepository.save(movieEntity);

        return movieTransformer.transformEntity(movieEntity);
    }

    public boolean deleteById(Long id) {
        if (!movieRepository.existsById(id)) {
            return false;
        }

        movieRepository.deleteById(id);
        return true;
    }

    private Movie transformEntity(MovieEntity movieEntity) {
        return new Movie(
                movieEntity.getId(),
                movieEntity.getFilmName(),
                movieEntity.getSchauSpielerName(),
                movieEntity.getReleaseDate(),
                movieEntity.getImagePath()
        );
    }

    public List<Movie> getThreeLatestMovies() {
        var movies = movieRepository.findAll(Sort.by(Sort.Direction.DESC, "releaseDate"))
                .stream()
                .limit(3)
                .collect(Collectors.toList());
        var finalMoviesList = movies.stream().map(el -> transformEntity(el)).toList();
        return finalMoviesList;
    }
}
