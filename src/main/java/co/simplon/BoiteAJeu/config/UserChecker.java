package co.simplon.BoiteAJeu.config;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import co.simplon.BoiteAJeu.model.Login;

@Component("userChecker")
public class UserChecker{

	public boolean isUser(Long id) {
		return id == ((Login) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
	}
}
