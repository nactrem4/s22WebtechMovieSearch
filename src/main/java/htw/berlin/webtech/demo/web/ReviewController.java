package htw.berlin.webtech.demo.web;

import htw.berlin.webtech.demo.web.api.Review;
import htw.berlin.webtech.demo.web.api.ReviewManipulationRequest;
import htw.berlin.webtech.demo.web.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping(path = "/api/v1/create-review")
    public ResponseEntity<Void> createReview(@Validated @RequestBody ReviewManipulationRequest request) {
        var review = reviewService.createReview(request);
        return review != false ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @GetMapping(path = "/api/v1/reviews/movie/{id}")
    public ResponseEntity<List<Review>> getReviewsOfMovie(@PathVariable Long id) {
        var reviews = reviewService.getReviewsOfMovie(id);
        return reviews != null ? ResponseEntity.ok(reviews) : ResponseEntity.notFound().build();
    }
}
