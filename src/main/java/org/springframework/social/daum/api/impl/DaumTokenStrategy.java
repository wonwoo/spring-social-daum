package org.springframework.social.daum.api.impl;

import org.springframework.http.client.ClientHttpRequestInterceptor;

public enum DaumTokenStrategy {

	API_KEY {
		public ClientHttpRequestInterceptor interceptor(String apiKey) {
			return new ApiRequestInterceptor(apiKey);
		}
	};
	abstract ClientHttpRequestInterceptor interceptor(String apiKey);

}
