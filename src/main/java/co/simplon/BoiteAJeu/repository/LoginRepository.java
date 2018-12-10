package co.simplon.BoiteAJeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.BoiteAJeu.model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
