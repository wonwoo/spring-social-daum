package org.springframework.social.daum.api.impl;

import java.net.URI;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.social.daum.api.DaumSearchRequest;
import org.springframework.web.client.RestTemplate;

public class ApiRestTemplate extends RestTemplate {

	public ApiRestTemplate() {
		super();
	}

	public ApiRestTemplate(ClientHttpRequestFactory requestFactory) {
		super(requestFactory);
	}

	public ApiRestTemplate(List<HttpMessageConverter<?>> messageConverters) {
		super(messageConverters);
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, ParameterizedTypeReference<T> responseType,
			DaumSearchRequest daumSearchRequest) {
		URI uri = new DaumURIBuilder(url).param(daumSearchRequest.toRequestParameters()).build();
		ResponseEntity<T> responseEntity = exchange(uri, HttpMethod.GET, null, responseType);
		return responseEntity;
	}
}
