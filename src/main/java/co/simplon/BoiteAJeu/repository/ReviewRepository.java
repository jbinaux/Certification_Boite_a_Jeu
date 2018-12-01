package co.simplon.BoiteAJeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.BoiteAJeu.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
