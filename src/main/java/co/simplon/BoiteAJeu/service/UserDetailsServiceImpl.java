package co.simplon.BoiteAJeu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.simplon.BoiteAJeu.model.Login;
import co.simplon.BoiteAJeu.repository.LoginRepository;

@Service(value = "userService")
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private LoginRepository loginRepo;

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		Login login = loginRepo.findByEmail(arg0);
		if (login != null)
		{
			return (UserDetails) login;
		}
		throw new UsernameNotFoundException(arg0);
	}
	
}
