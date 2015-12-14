package org.springframework.social.daum.api;

import org.junit.Before;
import org.springframework.social.daum.api.impl.DaumTemplate;

public class DaumTest {

	static final String ACCESS_TOKEN = "a3145e963e42412c10d6762970267f2514646230013cd2cb88b5624ca966346f"; // ACCESS_TOKEN

	static final String API_KEY = "d551150502bc18f8954486890c8a19a7"; // API_KEY

	Daum daum;

	@Before
	public void before() {
		daum = new DaumTemplate(ACCESS_TOKEN, API_KEY);
	}
}
