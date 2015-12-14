package org.springframework.social.daum.api.impl;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.social.support.HttpRequestDecorator;

public class ApiRequestInterceptor implements ClientHttpRequestInterceptor {

	private final String apiKey;

	public ApiRequestInterceptor(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public ClientHttpResponse intercept(final HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		HttpRequestDecorator httpRequestDecorator = new HttpRequestDecorator(request);
		httpRequestDecorator.addParameter("apiKey", apiKey);
		httpRequestDecorator.addParameter("output", "json");
		return execution.execute(httpRequestDecorator, body);
	}
}
