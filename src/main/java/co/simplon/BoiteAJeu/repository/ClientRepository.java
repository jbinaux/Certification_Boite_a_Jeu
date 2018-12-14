package co.simplon.BoiteAJeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.BoiteAJeu.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
	Client findByClientId(String clientId);
}
