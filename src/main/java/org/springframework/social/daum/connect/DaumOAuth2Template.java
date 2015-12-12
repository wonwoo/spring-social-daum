package org.springframework.social.daum.connect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;
import java.util.List;

public class DaumOAuth2Template extends OAuth2Template {

	private Logger logger = LoggerFactory.getLogger(DaumOAuth2Template.class);

	public DaumOAuth2Template(String clientId, String appSecret) {
		super(clientId, appSecret, "https://apis.daum.net/oauth2/authorize", "https://apis.daum.net/oauth2/token");
		setUseParametersForClientAuthentication(true);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected AccessGrant postForAccessGrant(String accessTokenUrl, MultiValueMap<String, String> parameters) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.ALL }));
		HttpEntity<?> requestEntity = new HttpEntity<MultiValueMap<String, String>>(parameters, headers);
		AccessToken response = getRestTemplate().postForObject(accessTokenUrl, requestEntity, AccessToken.class);
		if (logger.isDebugEnabled()) {
			logger.debug("respones : {}", response);
		}
		List<String> scopes = response.getScopes();
		String scope = "";
		if(!scopes.isEmpty()){
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				scope = objectMapper.writeValueAsString(scopes);
			} catch (JsonProcessingException e) {
			}
		}
		return new AccessGrant(response.getAccess_token(), scope,
				response.getRefresh_token(), response.getExpires_in());
	}

	private static class AccessToken{
		private String access_token;
		private Long expires_in;
		private String token_type;
		private List<String> scopes;
		private String refresh_token;

		public String getAccess_token() {
			return access_token;
		}

		public void setAccess_token(String access_token) {
			this.access_token = access_token;
		}

		public Long getExpires_in() {
			return expires_in;
		}

		public void setExpires_in(Long expires_in) {
			this.expires_in = expires_in;
		}

		public String getToken_type() {
			return token_type;
		}

		public void setToken_type(String token_type) {
			this.token_type = token_type;
		}

		public List<String> getScopes() {
			return scopes;
		}

		public void setScopes(List<String> scopes) {
			this.scopes = scopes;
		}

		public String getRefresh_token() {
			return refresh_token;
		}

		public void setRefresh_token(String refresh_token) {
			this.refresh_token = refresh_token;
		}

		@Override
		public String toString() {
			return new StringBuffer("AccessToken{")
			.append("access_token='").append(access_token).append('\'')
			.append(", expires_in=").append(expires_in)
			.append(", token_type='").append(token_type).append('\'')
			.append(", scopes='").append(scopes).append('\'')
			.append(", refresh_token='").append(refresh_token).append('\'')
			.append('}')
			.toString();
		}
	}

}
