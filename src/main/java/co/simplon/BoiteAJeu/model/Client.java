package co.simplon.BoiteAJeu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Client {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @NotNull
    private String clientId;
    private String clientSecret;
    private String resourceIds;
    private boolean secretRequired;
    private boolean scoped;
    private String scope;
    private String authorizedGrantTypes;
    private String registeredRedirectUri;
    private String authorities;
    private Integer accessTokenValiditySeconds;
    private Integer refreshTokenValiditySeconds;
    private boolean autoApprove;
    private String AdditionalInformation;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getResourceIds() {
		return resourceIds;
	}
	public void setResourceIds(String resourceIds) {
		this.resourceIds = resourceIds;
	}
	public boolean isSecretRequired() {
		return secretRequired;
	}
	public void setSecretRequired(boolean secretRequired) {
		this.secretRequired = secretRequired;
	}
	public boolean isScoped() {
		return scoped;
	}
	public void setScoped(boolean scoped) {
		this.scoped = scoped;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getAuthorizedGrantTypes() {
		return authorizedGrantTypes;
	}
	public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
		this.authorizedGrantTypes = authorizedGrantTypes;
	}
	public String getRegisteredRedirectUri() {
		return registeredRedirectUri;
	}
	public void setRegisteredRedirectUri(String registeredRedirectUri) {
		this.registeredRedirectUri = registeredRedirectUri;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	public Integer getAccessTokenValiditySeconds() {
		return accessTokenValiditySeconds;
	}
	public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
		this.accessTokenValiditySeconds = accessTokenValiditySeconds;
	}
	public Integer getRefreshTokenValiditySeconds() {
		return refreshTokenValiditySeconds;
	}
	public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
		this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
	}
	public boolean isAutoApprove() {
		return autoApprove;
	}
	public void setAutoApprove(boolean autoApprove) {
		this.autoApprove = autoApprove;
	}
	public String getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(String additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
    
   
}
