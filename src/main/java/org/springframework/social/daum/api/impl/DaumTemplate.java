package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.CafeOperations;
import org.springframework.social.daum.api.Daum;
import org.springframework.social.daum.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.support.URIBuilder;

public class DaumTemplate extends AbstractOAuth2ApiBinding implements Daum {

	private UserOperations userOperation;
	private CafeOperations cafeOperation;

	private String adminKey;

	public DaumTemplate() {
		initialize();
	}

	@Deprecated
	public DaumTemplate(String accessToken) {
		super(accessToken);
		initialize();
	}

	public DaumTemplate(String accessToken, String adminKey) {
		super(accessToken);
		this.adminKey = adminKey;
		initialize();
	}

	public UserOperations userOperation() {
		return userOperation;
	}

	public CafeOperations cafeOperation() {
		return cafeOperation;
	}

	private void initialize() {
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		initSubApis();
	}

	public String getBaseGraphApiUrl() {
		return "https://apis.daum.net";
	}

	private void initSubApis() {
		userOperation = new UserTemplate(this, getRestTemplate(), isAuthorized());
		cafeOperation = new CafeTemplate(this, getRestTemplate(), isAuthorized());
	}

	@Override
	public <T> T fetchObject(String url, Class<T> type) {
		return getRestTemplate().getForObject(URIBuilder.fromUri(getBaseGraphApiUrl() + url).build(), type);
	}
}
