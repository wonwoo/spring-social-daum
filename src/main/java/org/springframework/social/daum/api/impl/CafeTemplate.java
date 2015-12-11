package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.CafeOperations;
import org.springframework.social.daum.api.DaumCafeAlimis;
import org.springframework.social.daum.api.DaumCafeArticle;
import org.springframework.social.daum.api.DaumCafeArticles;
import org.springframework.social.daum.api.DaumCafeBoards;
import org.springframework.social.daum.api.DaumCafeRecentArticles;
import org.springframework.social.daum.api.DaumFavoriteCafe;
import org.springframework.social.daum.api.DaumRestApi;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class CafeTemplate extends AbstractDaumOperations implements CafeOperations {

	private final RestTemplate restTemplate;
	private DaumRestApi daumRestApi;

	public CafeTemplate(DaumRestApi daumRestApi, RestTemplate restTemplate, boolean isAuthorized) {
		super(isAuthorized);
		this.restTemplate = restTemplate;
		this.daumRestApi = daumRestApi;
	}


	public DaumFavoriteCafe favorite() {
		requireAuthorization();
		return daumRestApi.fetchObject("/cafe/v1/favorite_cafes.json", DaumFavoriteCafe.class);
	}
	// TODO daumRestApi


	public DaumCafeBoards boards(String cafeCode) {
		requireAuthorization();
		return daumRestApi.fetchObject("/cafe/v1/boards/{cafeCode}.json", DaumCafeBoards.class, cafeCode);
	}


	public DaumCafeArticles articles(String cafeCode, String boardId) {
		requireAuthorization();
		return daumRestApi.fetchObject("/cafe/v1/articles/{cafeCode}/{boardId}.json", DaumCafeArticles.class, cafeCode,cafeCode, boardId);
	}


	public DaumCafeRecentArticles recentArticles(String cafeCode) {
		requireAuthorization();
		return daumRestApi.fetchObject("/cafe/v1/recent_articles/{cafeCode}.json", DaumCafeRecentArticles.class,
				cafeCode);
	}


	public DaumCafeAlimis alimis() {
		requireAuthorization();
		return daumRestApi.fetchObject("/cafe/v1/alimis.json", DaumCafeAlimis.class);
	}

	public DaumCafeArticle writeArticle(String cafeCode, String content, boolean hideyn) {
		requireAuthorization();
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		String hide = hideyn ? "y" : "n";
		parameters.set("hideyn", hide);
		parameters.set("content", content);
		return daumRestApi.fetchPostObject("/cafe/v1/write_article/{cafeCode}/_memo.json", parameters,
				DaumCafeArticle.class, cafeCode);
	}
}
