package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.ContentsOperations;
import org.springframework.social.daum.api.DaumRestApi;

public class ContentsTemplate extends AbstractApiRestTemplate implements ContentsOperations {

	private ApiRestTemplate apiRestTemplate = null;
	private DaumRestApi daumRestApi = null;

	@Override
	public void setUrl(StringBuilder builder) {
		builder.append("contents");
	}

	public ContentsTemplate(DaumRestApi daumRestApi, ApiRestTemplate apiRestTemplate) {
		this.apiRestTemplate = apiRestTemplate;
		this.daumRestApi = daumRestApi;
	}
}
