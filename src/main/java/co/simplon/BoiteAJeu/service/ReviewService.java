package co.simplon.BoiteAJeu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.BoiteAJeu.model.Review;
import co.simplon.BoiteAJeu.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepo ;
	
	public List<Review> findAll()
	{
		return reviewRepo.findAll();
	}
	
	public Review findOne(long id)
	{
		return reviewRepo.findOne(id);
	}
}
