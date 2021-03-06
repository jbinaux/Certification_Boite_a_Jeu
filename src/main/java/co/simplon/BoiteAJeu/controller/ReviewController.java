package co.simplon.BoiteAJeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.BoiteAJeu.service.ReviewService;
import co.simplon.BoiteAJeu.model.Review;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService ;
	
	@GetMapping
	public List<Review> getReview()
	{
		return reviewService.findAll();
	}
	
	@GetMapping("/{id}")
	public Review getReviewById(@PathVariable(value="id") long id)
	{
		return reviewService.findOne(id);
	}
}
