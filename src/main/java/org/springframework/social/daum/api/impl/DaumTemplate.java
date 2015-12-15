package org.springframework.social.daum.api.impl;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.social.daum.api.BlogOperations;
import org.springframework.social.daum.api.CafeOperations;
import org.springframework.social.daum.api.Daum;
import org.springframework.social.daum.api.SearchOperations;
import org.springframework.social.daum.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.support.URIBuilder;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DaumTemplate extends AbstractOAuth2ApiBinding implements Daum {

	private UserOperations userOperation;
	private CafeOperations cafeOperation;
	private BlogOperations blogOperations;
	private SearchOperations searchOperations;

	private ApiRestTemplate apiRestTemplate;

	private String apiKey;

	public DaumTemplate() {
		initialize();
	}

	public DaumTemplate(String apiKey) {
		this.apiKey = apiKey;
		initialize();
	}

	public DaumTemplate(String accessToken, String apiKey) {
		super(accessToken);
		this.apiKey = apiKey;
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

	@Override
	public SearchOperations searchOperations() {
		return searchOperations;
	}

	private void initialize() {
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		apiRestTemplate = createRestTemplate(DaumTokenStrategy.API_KEY);
		initSubApis();
	}

	private ApiRestTemplate createRestTemplate(DaumTokenStrategy daumTokenStrategy) {
		ApiRestTemplate client = newInstanceRest();
		client.setRequestFactory(ClientHttpRequestFactorySelector.getRequestFactory());
		ClientHttpRequestInterceptor interceptor = daumTokenStrategy.interceptor(apiKey);
		List<ClientHttpRequestInterceptor> interceptors = new LinkedList<ClientHttpRequestInterceptor>();
		interceptors.add(interceptor);
		client.setInterceptors(interceptors);
		return client;
	}

	private ApiRestTemplate newInstanceRest() {
		ApiRestTemplate apiRestTemplate = null;
		List<HttpMessageConverter<?>> messageConverters = getMessageConverters();
		try {
			apiRestTemplate = new ApiRestTemplate(messageConverters);
		} catch (NoSuchMethodError e) {
			apiRestTemplate = new ApiRestTemplate();
			apiRestTemplate.setMessageConverters(messageConverters);
		}
		return apiRestTemplate;
	}

	public String getBaseGraphApiUrl() {
		return "https://apis.daum.net";
	}

	private void initSubApis() {
		userOperation = new UserTemplate(this, getRestTemplate(), isAuthorized());
		cafeOperation = new CafeTemplate(this, getRestTemplate(), isAuthorized());
		blogOperations = new BlogTemplate(this, getRestTemplate(), isAuthorized());
		searchOperations = new SearchTemplate(this, apiRestTemplate);
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

	public <T> T post(String url, Object request, Class<T> type, Object... urlVariables) {
		return getRestTemplate().postForObject(getBaseGraphApiUrl() + url, request, type, urlVariables);
	}

	public <T> T post(String url, Object request, Class<T> type) {
		return getRestTemplate().postForObject(getBaseGraphApiUrl() + url, request, type);
	}

}
