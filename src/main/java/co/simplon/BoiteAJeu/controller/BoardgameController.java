package co.simplon.BoiteAJeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.BoiteAJeu.comparator.DateComparator;
import co.simplon.BoiteAJeu.model.Boardgame;
import co.simplon.BoiteAJeu.model.Review;
import co.simplon.BoiteAJeu.service.BoardgameService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/boardgame")
public class BoardgameController {

	@Autowired
	private BoardgameService boardgameService;
	
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
		DateComparator comp = new DateComparator();
		List<Boardgame> list = boardgameService.findAll();
		for (Boardgame bg : list)
		{
			bg.setRating(averageReviews(bg.getReviews()));
		}
		list.sort(comp);
		return list;
	}
	
	@GetMapping("/{id}")
	public Boardgame getBoardgameById(@PathVariable(value="id") long id)
	{
		Boardgame bg = boardgameService.findOne(id);
		bg.setRating(averageReviews(bg.getReviews()));
		return bg;
	}
	
	@GetMapping("/recherche/{name}")
	public List<Boardgame> searchBoardgameByName(@PathVariable(value="name") String name)
	{
		return boardgameService.findByNameContaining(name);
	}
}
