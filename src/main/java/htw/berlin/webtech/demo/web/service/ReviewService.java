package htw.berlin.webtech.demo.web.service;

import htw.berlin.webtech.demo.persistence.MovieEntity;
import htw.berlin.webtech.demo.persistence.ReviewEntity;
import htw.berlin.webtech.demo.persistence.ReviewRepository;
import htw.berlin.webtech.demo.web.api.Review;
import htw.berlin.webtech.demo.web.api.ReviewManipulationRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewTransformer reviewTransformer;

    public ReviewService(ReviewRepository reviewRepository, ReviewTransformer reviewTransformer) {
        this.reviewRepository = reviewRepository;
        this.reviewTransformer = reviewTransformer;
    }

    // Get
    public List<Review> getReviewsOfMovie(long movieId) {
        var movieEntity = new MovieEntity(movieId);
        var reviews = reviewRepository.findByMovieEntity(movieEntity)
                .stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());

        return reviews;
    }

    // Create
    public boolean createReview(ReviewManipulationRequest request) {
        var reviewEntity = new ReviewEntity(request.getBenutzerBewertung(), request.getPunktZahl(), request.getMovieEntity());
        try {
            reviewRepository.save(reviewEntity);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    // Update
    // Delete
    private Review transformEntity(ReviewEntity reviewEntity) {
        return new Review(
                reviewEntity.getId(),
                reviewEntity.getNutzerBewertung(),
                reviewEntity.getPunktZahl()
        );
    }
}


