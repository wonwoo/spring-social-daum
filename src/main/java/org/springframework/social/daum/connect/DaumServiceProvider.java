package org.springframework.social.daum.connect;

import org.springframework.social.daum.api.Daum;
import org.springframework.social.daum.api.impl.DaumTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

public class DaumServiceProvider extends AbstractOAuth2ServiceProvider<Daum> {

	private String appNamespace;

	public DaumServiceProvider(String clientId, String appSecret, String appNamespace) {
		super(new DaumOAuth2Template(clientId, appSecret));
		this.appNamespace = appNamespace;
	}
//	private static OAuth2Template getOAuth2Template(String clientId, String appSecret) {
//		OAuth2Template oAuth2Template = new OAuth2Template(clientId, appSecret, "https://apis.daum.net/oauth2/authorize", "https://apis.daum.net/oauth2/token");
//		oAuth2Template.setUseParametersForClientAuthentication(true);
//		return oAuth2Template;
//	}

	public Daum getApi(String accessToken) {
		return new DaumTemplate(accessToken);
	}
}