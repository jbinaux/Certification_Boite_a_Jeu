package co.simplon.BoiteAJeu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.BoiteAJeu.model.Boardgame;

public interface BoardgameRepository extends JpaRepository<Boardgame, Long> {

	List<Boardgame> findByNameContaining(String name);
}
