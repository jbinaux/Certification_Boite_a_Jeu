package co.simplon.BoiteAJeu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.BoiteAJeu.model.Boardgame;
import co.simplon.BoiteAJeu.repository.BoardgameRepository;

@Service
public class BoardgameService {

	@Autowired
	private BoardgameRepository boardgameRepo;

	public List<Boardgame> findAll() {
		return boardgameRepo.findAll();
	}

	public Boardgame findOne(long id) {
		return boardgameRepo.findOne(id);
	}

	public List<Boardgame> findByNameContaining(String name) {
		return boardgameRepo.findByNameContaining(name);
	}
}
