package org.springframework.social.daum.connect;

import org.springframework.social.daum.api.Daum;
import org.springframework.social.daum.api.impl.DaumTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

public class DaumServiceProvider extends AbstractOAuth2ServiceProvider<Daum> {
	public DaumServiceProvider(String clientId) {
		super(new DaumOAuth2Template(clientId));
	}

	public Daum getApi(String accessToken) {
		return new DaumTemplate(accessToken);
	}
}