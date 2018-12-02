package co.simplon.BoiteAJeu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.BoiteAJeu.model.Boardgame;
import co.simplon.BoiteAJeu.model.Review;
import co.simplon.BoiteAJeu.repository.BoardgameRepository;

@RestController
@RequestMapping("/api/boardgame")
public class BoardgameController {

	private BoardgameRepository boardgameRepo;
	
	public BoardgameController (BoardgameRepository boardgameRepo)
	{
		this.boardgameRepo = boardgameRepo;
	}
	
	private double averageReviews (List<Review> list)
	{
		double sum = 0;
		for (Review rv : list)
		{
			sum += rv.getRating();
		}
		if (list.size() > 0)
		{
			return sum/list.size();
		}
		else
		{
			return 0;
		}
	}
	
	@GetMapping
	public List<Boardgame> getBoardgame()
	{
		List<Boardgame> list = boardgameRepo.findAll();
		for (Boardgame bg : list)
		{
			bg.setRating(averageReviews(bg.getReviews()));
		}
		return list;
	}
	
	@GetMapping("/{id}")
	public Boardgame getBoardgameById(@PathVariable(value="id") long id)
	{
		Boardgame bg = boardgameRepo.findOne(id);
		bg.setRating(averageReviews(bg.getReviews()));
		return bg;
	}
}
