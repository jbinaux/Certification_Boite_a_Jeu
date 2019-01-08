package co.simplon.BoiteAJeu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Autowired
	private TokenStore tokenStore;
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources
		.tokenStore(tokenStore)
		.resourceId("resource_id")
		.stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.anonymous()
		.disable()
		.authorizeRequests()
		.antMatchers("/api/user").hasAuthority("ROLE_ADMIN")
		.antMatchers("/api/login/**").hasAuthority("ROLE_ADMIN")
		.and()
		.exceptionHandling()
		.accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}
}
