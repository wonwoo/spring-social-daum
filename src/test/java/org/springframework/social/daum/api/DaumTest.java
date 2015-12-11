package org.springframework.social.daum.api;

import org.junit.Before;
import org.springframework.social.daum.api.impl.DaumTemplate;

public class DaumTest {

	static final String ACCESS_TOKEN = "f1f1a98467348446bdd412f6322dc7e38ffa205e0f085372ab5e435e6811fc6a"; // ACCESS_TOKEN

	static final String CLIENT_SECRET = "6bd7c95b77fe4d8a4733e5a01419bb54"; // CLIENT_SECRET

	Daum daum;

	@Before
	public void before() {
		daum = new DaumTemplate(ACCESS_TOKEN, CLIENT_SECRET);
	}
}
