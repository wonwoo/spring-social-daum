package org.springframework.social.daum.api;

import org.junit.Before;
import org.springframework.social.daum.api.impl.DaumTemplate;

public class DaumTest {

	static final String ACCESS_TOKEN = "aec4f1b2e2ff30fa76ec5fda67599f9e8dd01797d0251294c6be601ef04ea50b"; // ACCESS_TOKEN

	static final String CLIENT_SECRET = "6bd7c95b77fe4d8a4733e5a01419bb54"; // CLIENT_SECRET

	Daum daum;

	@Before
	public void before() {
		daum = new DaumTemplate(ACCESS_TOKEN, CLIENT_SECRET);
	}
}
