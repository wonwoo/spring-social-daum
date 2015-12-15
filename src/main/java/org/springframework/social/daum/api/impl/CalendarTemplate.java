package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.CalendarOperations;
import org.springframework.social.daum.api.DaumRestApi;
import org.springframework.web.client.RestTemplate;

public class CalendarTemplate extends AbstractDaumOperations implements CalendarOperations {

	private RestTemplate restTemplate;
	private String prefix = "/calendar/v1/";
	DaumRestApi daumRestApi;

	public CalendarTemplate(boolean isAuthorized) {
		super(isAuthorized);
	}

	public CalendarTemplate(DaumRestApi daumRestApi, RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
		this.daumRestApi = daumRestApi;
	}

}
