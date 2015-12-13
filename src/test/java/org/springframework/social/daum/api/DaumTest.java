package org.springframework.social.daum.api;

import org.junit.Before;
import org.springframework.social.daum.api.impl.DaumTemplate;

public class DaumTest {

	static final String ACCESS_TOKEN = "a3145e963e42412c10d6762970267f2514646230013cd2cb88b5624ca966346f"; // ACCESS_TOKEN

	static final String CLIENT_SECRET = "6bd7c95b77fe4d8a4733e5a01419bb54"; // CLIENT_SECRET

	Daum daum;

	@Before
	public void before() {
		daum = new DaumTemplate(ACCESS_TOKEN, CLIENT_SECRET);
	}
}
