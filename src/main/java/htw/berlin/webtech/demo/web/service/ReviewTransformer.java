package htw.berlin.webtech.demo.web.service;

import htw.berlin.webtech.demo.persistence.ReviewEntity;
import htw.berlin.webtech.demo.web.api.Review;
import org.springframework.stereotype.Service;

@Service
public class ReviewTransformer {

    public Review transformEntity(ReviewEntity reviewEntity) {
        return new Review(
                reviewEntity.getId(),
                reviewEntity.getNutzerBewertung(),
                reviewEntity.getPunktZahl()
        );
    }
}

