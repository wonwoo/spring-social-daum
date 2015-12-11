package org.springframework.social.daum.api;

import org.junit.Before;
import org.springframework.social.daum.api.impl.DaumTemplate;

public class DaumTest {

	static final String ACCESS_TOKEN = "558c55b459504032f8ba4821ff93c767fe6c5cb5b3253230a8551043ef63b76azaq12wsx"; // ACCESS_TOKEN

	static final String CLIENT_SECRET = "6bd7c95b77fe4d8a4733e5a01419bb54f123"; // CLIENT_SECRET

	Daum daum;

	@Before
	public void before() {
		daum = new DaumTemplate(ACCESS_TOKEN, CLIENT_SECRET);
	}
}
