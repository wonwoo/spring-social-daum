package org.springframework.social.daum.api.impl;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.social.daum.api.DaumBlogSearch;
import org.springframework.social.daum.api.DaumRestApi;
import org.springframework.social.daum.api.DaumSearch;
import org.springframework.social.daum.api.SearchOperations;
import org.springframework.web.client.RestTemplate;

public class SearchTemplate implements SearchOperations {

	private RestTemplate restTemplate = null;
	private DaumRestApi daumRestApi = null;

	public SearchTemplate(DaumRestApi daumRestApi, RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		this.daumRestApi = daumRestApi;
	}

	@Override
	public DaumSearch<DaumBlogSearch> board(String q, Integer result, String advance, Integer pageno, String sort) {
		ResponseEntity<DaumSearch<DaumBlogSearch>> responseEntity = restTemplate.exchange(
				"https://apis.daum.net/search/board?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
				HttpMethod.GET, null, new ParameterizedTypeReference<DaumSearch<DaumBlogSearch>>() {
				}, q, result, advance, pageno, sort);
		return responseEntity.getBody();
	}

	@Override
	public DaumSearch<DaumBlogSearch> board(String q, Integer result, String advance, Integer pageno) {
		return this.board(q, result, advance, pageno, "accu");
	}

	@Override
	public DaumSearch<DaumBlogSearch> board(String q, Integer result, String advance) {
		return this.board(q, result, advance, 1);
	}

	@Override
	public DaumSearch<DaumBlogSearch> board(String q, Integer result) {
		return this.board(q, result, "n");
	}

	@Override
	public DaumSearch<DaumBlogSearch> board(String q) {
		return this.board(q, 20);
	}

}