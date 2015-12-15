package org.springframework.social.daum.api.impl;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.social.daum.api.DaumBlogSearch;
import org.springframework.social.daum.api.DaumBoardSearch;
import org.springframework.social.daum.api.DaumBookSearch;
import org.springframework.social.daum.api.DaumCafeSearch;
import org.springframework.social.daum.api.DaumImageSearch;
import org.springframework.social.daum.api.DaumKnowledgeSearch;
import org.springframework.social.daum.api.DaumRestApi;
import org.springframework.social.daum.api.DaumSearch;
import org.springframework.social.daum.api.DaumSearchRequest;
import org.springframework.social.daum.api.DaumVclipSearch;
import org.springframework.social.daum.api.DaumWebSearch;
import org.springframework.social.daum.api.SearchOperations;

public class SearchTemplate extends AbstractApiRestTemplate implements SearchOperations {

	private ApiRestTemplate apiRestTemplate = null;
	private DaumRestApi daumRestApi = null;

	@Override
	public void setUrl(StringBuilder builder) {
		builder.append("search/");
	}

	public SearchTemplate(DaumRestApi daumRestApi, ApiRestTemplate apiRestTemplate) {
		this.apiRestTemplate = apiRestTemplate;
		this.daumRestApi = daumRestApi;
	}

	@Override
	public DaumSearch<DaumBoardSearch> board(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "board";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumBoardSearch>>() {
				}, daumSearchRequest).getBody();
	}

	@Override
	public DaumSearch<DaumVclipSearch> vclip(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "vclip";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumVclipSearch>>() {
				}, daumSearchRequest).getBody();
	}

	@Override
	public DaumSearch<DaumBlogSearch> blog(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "blog";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumBlogSearch>>() {
				}, daumSearchRequest).getBody();
	}

	@Override
	public DaumSearch<DaumWebSearch> web(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "web";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumWebSearch>>() {
				}, daumSearchRequest).getBody();
	}

	@Override
	public DaumSearch<DaumImageSearch> image(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "image";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumImageSearch>>() {
				}, daumSearchRequest).getBody();
	}

	@Override
	public DaumSearch<DaumKnowledgeSearch> knowledge(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "knowledge";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumKnowledgeSearch>>() {
				}, daumSearchRequest).getBody();
	}

	@Override
	public DaumSearch<DaumBookSearch> book(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "book";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumBookSearch>>() {
				}, daumSearchRequest).getBody();
	}

	@Override
	public DaumSearch<DaumCafeSearch> cafe(DaumSearchRequest daumSearchRequest) {
		String url = getUrl() + "cafe";
		return apiRestTemplate
				.exchange(url, HttpMethod.GET, new ParameterizedTypeReference<DaumSearch<DaumCafeSearch>>() {
				}, daumSearchRequest).getBody();
	}

	// @Override
	// public DaumSearch<DaumBoardSearch> board(String q, Integer result, String
	// advance, Integer pageno, String sort) {
	// ResponseEntity<DaumSearch<DaumBoardSearch>> responseEntity =
	// restTemplate.exchange(
	// "https://apis.daum.net/search/board?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
	// HttpMethod.GET, null, new
	// ParameterizedTypeReference<DaumSearch<DaumBoardSearch>>() {
	// }, q, result, advance, pageno, sort);
	// return responseEntity.getBody();
	// }
	//
	// @Override
	// public DaumSearch<DaumBoardSearch> board(String q, Integer result, String
	// advance, Integer pageno) {
	// return this.board(q, result, advance, pageno, "accu");
	// }
	//
	// @Override
	// public DaumSearch<DaumBoardSearch> board(String q, Integer result, String
	// advance) {
	// return this.board(q, result, advance, 1);
	// }
	//
	// @Override
	// public DaumSearch<DaumBoardSearch> board(String q, Integer result) {
	// return this.board(q, result, "n");
	// }
	//
	// @Override
	// public DaumSearch<DaumBoardSearch> board(String q) {
	// return this.board(q, 20);
	// }

	// @Override
	// public DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String
	// advance, Integer pageno, String sort) {
	// ResponseEntity<DaumSearch<DaumVclipSearch>> responseEntity =
	// restTemplate.exchange(
	// "https://apis.daum.net/search/vclip?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
	// HttpMethod.GET, null, new
	// ParameterizedTypeReference<DaumSearch<DaumVclipSearch>>() {
	// }, q, result, advance, pageno, sort);
	// return responseEntity.getBody();
	// }
	//
	// @Override
	// public DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String
	// advance, Integer pageno) {
	// return this.vclip(q, result, advance, pageno, "accuracy");
	// }
	//
	// @Override
	// public DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String
	// advance) {
	// return this.vclip(q, result, advance, 1);
	// }
	//
	// @Override
	// public DaumSearch<DaumVclipSearch> vclip(String q, Integer result) {
	// return this.vclip(q, result, "n");
	// }
	//
	// @Override
	// public DaumSearch<DaumVclipSearch> vclip(String q) {
	// return this.vclip(q, 10);
	// }
	//
	// @Override
	// public DaumSearch<DaumBlogSearch> blog(String q, Integer result, String
	// advance, Integer pageno, String sort) {
	// ResponseEntity<DaumSearch<DaumBlogSearch>> responseEntity =
	// restTemplate.exchange(
	// "https://apis.daum.net/search/blog?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
	// HttpMethod.GET, null, new
	// ParameterizedTypeReference<DaumSearch<DaumBlogSearch>>() {
	// }, q, result, advance, pageno, sort);
	// return responseEntity.getBody();
	// }
	//
	// @Override
	// public DaumSearch<DaumBlogSearch> blog(String q, Integer result, String
	// advance, Integer pageno) {
	// return this.blog(q, result, advance, pageno, "date");
	// }
	//
	// @Override
	// public DaumSearch<DaumBlogSearch> blog(String q, Integer result, String
	// advance) {
	// return this.blog(q, result, advance, 1);
	// }
	//
	// @Override
	// public DaumSearch<DaumBlogSearch> blog(String q, Integer result) {
	// return this.blog(q, result, "n");
	// }
	//
	// @Override
	// public DaumSearch<DaumBlogSearch> blog(String q) {
	// return this.blog(q, 10);
	// }
	//
	// @Override
	// public DaumSearch<DaumWebSearch> web(String q, Integer result, String
	// advance, Integer pageno) {
	// ResponseEntity<DaumSearch<DaumWebSearch>> responseEntity =
	// restTemplate.exchange(
	// "https://apis.daum.net/search/web?q={q}&result={result}&advance={advance}&pageno={pageno}",
	// HttpMethod.GET, null, new
	// ParameterizedTypeReference<DaumSearch<DaumWebSearch>>() {
	// }, q, result, advance, pageno);
	// return responseEntity.getBody();
	// }
	//
	// @Override
	// public DaumSearch<DaumWebSearch> web(String q, Integer result, String
	// advance) {
	// return this.web(q, result, advance, 1);
	// }
	//
	// @Override
	// public DaumSearch<DaumWebSearch> web(String q, Integer result) {
	// return this.web(q, result, "n");
	// }
	//
	// @Override
	// public DaumSearch<DaumWebSearch> web(String q) {
	// return this.web(q, 10);
	// }
	//
	// @Override
	// public DaumSearch<DaumImageSearch> image(String q, Integer result, String
	// advance, Integer pageno, String sort) {
	// ResponseEntity<DaumSearch<DaumImageSearch>> responseEntity =
	// restTemplate.exchange(
	// "https://apis.daum.net/search/image?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
	// HttpMethod.GET, null, new
	// ParameterizedTypeReference<DaumSearch<DaumImageSearch>>() {
	// }, q, result, advance, pageno, sort);
	// return responseEntity.getBody();
	// }
	//
	// @Override
	// public DaumSearch<DaumImageSearch> image(String q, Integer result, String
	// advance, Integer pageno) {
	// return this.image(q, result, advance, pageno, "accu");
	// }
	//
	// @Override
	// public DaumSearch<DaumImageSearch> image(String q, Integer result, String
	// advance) {
	// return this.image(q, result, advance, 1);
	// }
	//
	// @Override
	// public DaumSearch<DaumImageSearch> image(String q, Integer result) {
	// return this.image(q, result, "n");
	// }
	//
	// @Override
	// public DaumSearch<DaumImageSearch> image(String q) {
	// return this.image(q, 20);
	// }
	//
	// @Override
	// public DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer
	// result, String advance, Integer pageno,
	// String sort, String range) {
	// ResponseEntity<DaumSearch<DaumKnowledgeSearch>> responseEntity =
	// restTemplate.exchange(
	// "https://apis.daum.net/search/knowledge?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}&range={range}",
	// HttpMethod.GET, null, new
	// ParameterizedTypeReference<DaumSearch<DaumKnowledgeSearch>>() {
	// }, q, result, advance, pageno, sort, range);
	// return responseEntity.getBody();
	// }
	//
	// @Override
	// public DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer
	// result, String advance, Integer pageno,
	// String sort) {
	// return this.knowledge(q, result, advance, pageno, sort, "all");
	// }
	//
	// @Override
	// public DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer
	// result, String advance, Integer pageno) {
	// return this.knowledge(q, result, advance, pageno, "date");
	// }
	//
	// @Override
	// public DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer
	// result, String advance) {
	// return this.knowledge(q, result, advance, 1);
	// }
	//
	// @Override
	// public DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer
	// result) {
	// return this.knowledge(q, result, "n");
	// }
	//
	// @Override
	// public DaumSearch<DaumKnowledgeSearch> knowledge(String q) {
	// return this.knowledge(q, 10);
	// }
	//
	// @Override
	// public DaumSearch<DaumBookSearch> book(String q, Integer result, String
	// advance, Integer pageno, String sort,
	// String searchType, String cate_id) {
	// String cateId = "";
	// if (cate_id != null && cate_id != "") {
	// cateId = "&cate_id={cate_id}";
	// }
	// ResponseEntity<DaumSearch<DaumBookSearch>> responseEntity = restTemplate
	// .exchange(
	// "https://apis.daum.net/search/book?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}&searchType={searchType}"
	// + cateId,
	// HttpMethod.GET, null, new
	// ParameterizedTypeReference<DaumSearch<DaumBookSearch>>() {
	// }, q, result, advance, pageno, sort, searchType, cate_id);
	// return responseEntity.getBody();
	// }
	//
	// @Override
	// public DaumSearch<DaumBookSearch> book(String q, Integer result, String
	// advance, Integer pageno, String sort,
	// String searchType) {
	// return this.book(q, result, advance, pageno, sort, searchType, "");
	// }
	//
	// @Override
	// public DaumSearch<DaumBookSearch> book(String q, Integer result, String
	// advance, Integer pageno, String sort) {
	// return this.book(q, result, advance, pageno, sort, "all");
	// }
	//
	// @Override
	// public DaumSearch<DaumBookSearch> book(String q, Integer result, String
	// advance, Integer pageno) {
	// return this.book(q, result, advance, pageno, "popular");
	// }
	//
	// @Override
	// public DaumSearch<DaumBookSearch> book(String q, Integer result, String
	// advance) {
	// return this.book(q, result, advance, 1);
	// }
	//
	// @Override
	// public DaumSearch<DaumBookSearch> book(String q, Integer result) {
	// return this.book(q, result, "n");
	// }
	//
	// @Override
	// public DaumSearch<DaumBookSearch> book(String q) {
	// return this.book(q, 10);
	// }
}