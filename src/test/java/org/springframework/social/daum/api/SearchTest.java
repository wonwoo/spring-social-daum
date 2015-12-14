package org.springframework.social.daum.api;

import org.junit.Test;

import java.util.stream.Collectors;

public class SearchTest extends DaumTest {

	@Test
	public void board() {
		DaumSearch<DaumBoardSearch> daumBoardSearch = daum.searchOperations().board("카카오프렌즈 -네오", 10, "n");
		System.out.println(daumBoardSearch.getChannel().getItem().get(0).getAuthor());
	}

	@Test
	public void vclip() {
		DaumSearch<DaumVclipSearch> daumBlogSearchs = daum.searchOperations().vclip("다음카카오");
		System.out.println(daumBlogSearchs.getChannel().getItem().stream().map(f -> f.toString()).collect(Collectors.joining("\n")));
	}

	@Test
	public void blog() {
		DaumSearch<DaumBlogSearch> daumBlogSearchs = daum.searchOperations().blog("카카오프렌즈");
		System.out.println(daumBlogSearchs.getChannel().getItem().stream().map(f -> f.toString()).collect(Collectors.joining("\n")));
	}

	@Test
	public void web() {
		DaumSearch<DaumWebSearch> daumWebSearch = daum.searchOperations().web("다음카카오");
		System.out.println(daumWebSearch.getChannel().getItem().stream().map(f -> f.toString()).collect(Collectors.joining("\n")));
	}

	@Test
	public void image() {
		DaumSearch<DaumImageSearch> daumImageSearch = daum.searchOperations().image("카카오프렌즈 -네오");
		System.out.println(daumImageSearch.getChannel().getItem().stream().map(f -> f.toString()).collect(Collectors.joining("\n")));
	}
}
