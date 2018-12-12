package co.simplon.BoiteAJeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.BoiteAJeu.model.Login;
import co.simplon.BoiteAJeu.service.LoginService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping
	public List<Login> getLogins()
	{
		return loginService.findAll();
	}
	
	@GetMapping("/{id}")
	public Login getLoginById(@PathVariable(value="id") long id)
	{
		return loginService.findOne(id);
	}
}
