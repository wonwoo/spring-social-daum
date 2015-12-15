package org.springframework.social.daum.api.impl;

import java.net.URI;

import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class DaumURIBuilder {

	private URIBuilder uriBuilder;

	private String uri;

	private MultiValueMap<String, Object> parameters;

	public DaumURIBuilder(String uri) {
		uriBuilder = URIBuilder.fromUri(uri);
		parameters = new LinkedMultiValueMap<String, Object>();
		this.uri = uri;
	}

	public DaumURIBuilder param(String name, Object value) {
		parameters.add(name, value);
		convert(name, value);
		return this;
	}

	private void convert(String name, Object value) {
		if (value instanceof String) {
			uriBuilder.queryParam(name, (String) value);
		}
		if (value instanceof Number) {
			uriBuilder.queryParam(name, ((Number) value).toString());
		}
	}

	public DaumURIBuilder param(MultiValueMap<String, Object> parameters) {
		this.parameters.putAll(parameters);
		for (String name : this.parameters.keySet()) {
			convert(name, this.parameters.getFirst(name));
		}
		return this;
	}

	public String getUri() {
		return uri;
	}

	public URI build() {
		return uriBuilder.build();
	}

}
