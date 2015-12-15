package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.DaumProfile;
import org.springframework.social.daum.api.DaumRestApi;
import org.springframework.social.daum.api.UserOperations;
import org.springframework.web.client.RestTemplate;

public class UserTemplate extends AbstractDaumOperations implements UserOperations {

	private RestTemplate restTemplate;
	private String prefix = "/user/v1/";
	DaumRestApi daumRestApi;

	public UserTemplate(DaumRestApi daumRestApi, RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
		this.daumRestApi = daumRestApi;
	}

	public long getProfileId() {
		requireAuthorization();
		return getUserProfile().getResult().getId();
	}

	public String getNickname() {
		requireAuthorization();
		return getUserProfile().getResult().getNickname();
	}

	public DaumProfile getUserProfile() {
		requireAuthorization();
		return daumRestApi.fetchObject(prefix + "show.json", DaumProfile.class);
	}
}
