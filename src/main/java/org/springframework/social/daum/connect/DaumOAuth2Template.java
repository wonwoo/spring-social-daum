package org.springframework.social.daum.connect;

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.util.MultiValueMap;

public class DaumOAuth2Template extends OAuth2Template {

	private Logger logger = LoggerFactory.getLogger(DaumOAuth2Template.class);

	public DaumOAuth2Template(String clientId) {
		super(clientId, "", "https://apis.daum.net/oauth2/authorize", "https://apis.daum.net/oauth2/token");
		setUseParametersForClientAuthentication(true);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected AccessGrant postForAccessGrant(String accessTokenUrl, MultiValueMap<String, String> parameters) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.ALL }));
		HttpEntity<?> requestEntity = new HttpEntity<MultiValueMap<String, String>>(parameters, headers);

		LinkedHashMap<String, Object> response = getRestTemplate().postForObject(accessTokenUrl, requestEntity,
				LinkedHashMap.class);

		if (logger.isDebugEnabled()) {
			logger.debug(new StringBuilder("response : ").append(response).toString());
		}

		String expires = response.get("expires_in").toString();
		return new AccessGrant(response.get("access_token").toString(), response.get("scope").toString(),
				response.get("refresh_token").toString(), expires != null ? Long.valueOf(expires) : null);
	}

}
