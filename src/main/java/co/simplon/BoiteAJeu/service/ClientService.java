package co.simplon.BoiteAJeu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import co.simplon.BoiteAJeu.model.Client;
import co.simplon.BoiteAJeu.repository.ClientRepository;

@Service
public class ClientService implements ClientDetailsService {

	@Autowired
	ClientRepository clientRepo;

	@Override
	public ClientDetails loadClientByClientId(String arg0) throws ClientRegistrationException {
		Client client = clientRepo.findByClientId(arg0);

		if (client != null) {
			String resourceIds = client.getResourceIds();
			String scopes = client.getScope();
			String grantTypes = client.getAuthorizedGrantTypes();
			String authorities = client.getAuthorities();

			BaseClientDetails base = new BaseClientDetails(client.getClientId(), resourceIds, scopes, grantTypes,
					authorities);
			base.setClientSecret(client.getClientSecret());
			base.setAccessTokenValiditySeconds(client.getAccessTokenValiditySeconds());
			base.setRefreshTokenValiditySeconds(client.getRefreshTokenValiditySeconds());
			return base;
		}
		throw new ClientRegistrationException(arg0);
	}

}
