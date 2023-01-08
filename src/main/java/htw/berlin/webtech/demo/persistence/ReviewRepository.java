package htw.berlin.webtech.demo.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
    List<ReviewEntity> findAllById(Long id);

    List<ReviewEntity> findByMovieEntity(MovieEntity movieEntity);
}
