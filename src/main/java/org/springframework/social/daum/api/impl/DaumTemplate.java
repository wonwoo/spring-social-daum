package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.BlogOperations;
import org.springframework.social.daum.api.CafeOperations;
import org.springframework.social.daum.api.Daum;
import org.springframework.social.daum.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.support.URIBuilder;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

public class DaumTemplate extends AbstractOAuth2ApiBinding implements Daum {

	private UserOperations userOperation;
	private CafeOperations cafeOperation;
	private BlogOperations blogOperations;

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

	@Override
	public BlogOperations blogOperations() {
		return blogOperations;
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
		blogOperations = new BlogTemplate(this, getRestTemplate(), isAuthorized());
	}

	@Override
	protected void configureRestTemplate(RestTemplate restTemplate) {
		restTemplate.setErrorHandler(new DaumErrorHandler());
	}

	public <T> T fetchObject(String url, Class<T> type) {
		return getRestTemplate().getForObject(URIBuilder.fromUri(getBaseGraphApiUrl() + url).build(), type);
	}

	public <T> T fetchObject(URI uri, Class<T> type, Object... urlVariables) {
		return fetchObject(uri.toString(), type, urlVariables);
	}

	public <T> T fetchObject(String url, Class<T> type, Object... urlVariables) {
		return getRestTemplate().getForObject(getBaseGraphApiUrl() + url, type, urlVariables);
	}

	@Override
	public <T> T fetchObject(String url, Class<T> type, Map<String, ?> urlVariables) {
		return getRestTemplate().getForObject(getBaseGraphApiUrl() + url, type, urlVariables);
	}

	public <T> T fetchPostObject(String url, Object request, Class<T> type, Object... urlVariables) {
		return getRestTemplate().postForObject(getBaseGraphApiUrl() + url, request, type, urlVariables);
	}
}
