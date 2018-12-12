package co.simplon.BoiteAJeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.BoiteAJeu.model.User;
import co.simplon.BoiteAJeu.service.UserService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getUsers()
	{
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable(value="id") long id)
	{
		return userService.findOne(id);
	}
}
