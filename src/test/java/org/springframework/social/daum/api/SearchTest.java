package org.springframework.social.daum.api;

import org.junit.Test;

public class SearchTest extends DaumTest {

	@Test
	public void board() {
		DaumSearch<DaumBlogSearch> daumBlogSearchs = daum.searchOperations().board("카카오프렌즈 -네오", 10, "n", 2, "accu");
		System.out.println(daumBlogSearchs.getChannel().getItem().get(0).getAuthor());
	}
}
