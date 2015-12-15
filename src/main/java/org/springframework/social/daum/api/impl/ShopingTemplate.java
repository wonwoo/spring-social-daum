package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.DaumRestApi;
import org.springframework.social.daum.api.ShopingOperations;

public class ShopingTemplate extends AbstractApiRestTemplate implements ShopingOperations {

	private ApiRestTemplate apiRestTemplate = null;
	private DaumRestApi daumRestApi = null;

	@Override
	public void setUrl(StringBuilder builder) {
		builder.append("shopping");
	}

	public ShopingTemplate(DaumRestApi daumRestApi, ApiRestTemplate apiRestTemplate) {
		this.apiRestTemplate = apiRestTemplate;
		this.daumRestApi = daumRestApi;
	}
}
