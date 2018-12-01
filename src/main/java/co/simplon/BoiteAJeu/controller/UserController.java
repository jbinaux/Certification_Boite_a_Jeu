package co.simplon.BoiteAJeu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.BoiteAJeu.model.User;
import co.simplon.BoiteAJeu.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

	private UserRepository userRepo;
	
	public UserController(UserRepository userRepo)
	{
		this.userRepo = userRepo;
	}
	
	@GetMapping
	public List<User> getUsers()
	{
		return userRepo.findAll();
	}
}
