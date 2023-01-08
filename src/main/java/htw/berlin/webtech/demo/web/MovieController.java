package htw.berlin.webtech.demo.web;

import htw.berlin.webtech.demo.web.api.Movie;
import htw.berlin.webtech.demo.web.api.MovieManipulationRequest;
import htw.berlin.webtech.demo.web.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(path = "/api/v1/movies")
    public ResponseEntity<List<Movie>> fetchMovies() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping(path = "/api/v1/movies/{id}")
    public ResponseEntity<Movie> fetchMovieById(@PathVariable Long id) {
        var movie = movieService.findById(id);
        return movie != null ? ResponseEntity.ok(movie) : ResponseEntity.notFound().build();
    }

    @GetMapping(path = "/api/v1/movies/getthreelatest")
    public ResponseEntity<List<Movie>> getThreeLatestMovies() {
        var movies = movieService.getThreeLatestMovies();
        return movies != null ? ResponseEntity.ok(movies) : ResponseEntity.notFound().build();
    }

    @PostMapping(path = "/api/v1/movies")
    public ResponseEntity<Void> createMovie(@Validated @RequestBody MovieManipulationRequest request) throws URISyntaxException {
        var movie = movieService.create(request);
        URI uri = new URI("/api/v1/movies/" + movie.getId());
        return ResponseEntity
                .created(uri)
                .header("Access-Control-Expose-Headers", "Location")
                .build();
    }

    @PutMapping(path = "/api/v1/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody MovieManipulationRequest request) {
        var movie = movieService.update(id, request);
        return movie != null ? ResponseEntity.ok(movie) : ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/api/v1/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        boolean successful = movieService.deleteById(id);
        return successful ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

}
