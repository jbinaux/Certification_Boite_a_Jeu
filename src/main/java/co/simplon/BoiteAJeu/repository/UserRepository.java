package co.simplon.BoiteAJeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.BoiteAJeu.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
