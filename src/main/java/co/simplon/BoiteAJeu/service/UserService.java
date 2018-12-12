package co.simplon.BoiteAJeu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.BoiteAJeu.model.User;
import co.simplon.BoiteAJeu.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll()
	{
		return userRepo.findAll();
	}

	public User findOne(long id)
	{
		return userRepo.findOne(id);
	}
}
