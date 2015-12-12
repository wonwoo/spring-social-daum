package org.springframework.social.daum.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.daum.api.Daum;

public class DaumConnectionFactory extends OAuth2ConnectionFactory<Daum> {


	public DaumConnectionFactory(String appId, String appSecret) {
		this(appId, appSecret, null);
	}

	public DaumConnectionFactory(String appId, String appSecret, String appNamespace) {
		super("facebook", new DaumServiceProvider(appId, appSecret, appNamespace), new DaumAdapter());
	}
}