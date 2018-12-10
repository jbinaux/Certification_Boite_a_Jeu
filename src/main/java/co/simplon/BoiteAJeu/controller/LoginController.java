package co.simplon.BoiteAJeu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.BoiteAJeu.model.Login;
import co.simplon.BoiteAJeu.repository.LoginRepository;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/login")
public class LoginController {

	private LoginRepository loginRepo;
	
	public LoginController(LoginRepository loginRepo)
	{
		this.loginRepo = loginRepo;
	}
	
	@GetMapping
	public List<Login> getLogins()
	{
		return loginRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Login getLoginById(@PathVariable(value="id") long id)
	{
		return loginRepo.findOne(id);
	}
}
