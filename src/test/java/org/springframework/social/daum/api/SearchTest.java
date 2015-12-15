package org.springframework.social.daum.api;

import org.junit.Test;

import java.util.stream.Collectors;

public class SearchTest extends DaumTest {

	// @Test
	// public void board() {
	// DaumSearch<DaumBoardSearch> daumBoardSearch =
	// daum.searchOperations().board("카카오프렌즈 -네오", 10, "n");
	// System.out.println(daumBoardSearch.getChannel().getItem().get(0).getAuthor());
	// }

	@Test
	public void board2() {

		DaumSearchRequest daumSearchRequest = new DaumSearchRequest();
		daumSearchRequest.q("카카오프렌즈 -네오");
		daumSearchRequest.result(3);
		DaumSearch<DaumBoardSearch> daumBoardSearch = daum.searchOperations().board(daumSearchRequest);
		System.out.println(daumBoardSearch.getChannel().getItem().stream().map(t -> t.toString())
				.collect(Collectors.joining("\n")));
	}

	//
	@Test
	public void vclip() {
		DaumSearchRequest daumSearchRequest = new DaumSearchRequest();
		daumSearchRequest.q("카카오프렌즈 -네오");
		daumSearchRequest.result(3);
		DaumSearch<DaumVclipSearch> daumBlogSearchs = daum.searchOperations().vclip(daumSearchRequest);
		System.out.println(daumBlogSearchs.getChannel().getItem().stream().map(f -> f.toString())
				.collect(Collectors.joining("\n")));
	}

	//
	@Test
	public void blog() {
		DaumSearchRequest daumSearchRequest = new DaumSearchRequest();
		daumSearchRequest.q("카카오프렌즈");
		daumSearchRequest.result(3);
		DaumSearch<DaumBlogSearch> daumBlogSearchs = daum.searchOperations().blog(daumSearchRequest);
		System.out.println(daumBlogSearchs.getChannel().getItem().stream().map(f -> f.toString())
				.collect(Collectors.joining("\n")));
	}

	//
	@Test
	public void web() {
		DaumSearchRequest daumSearchRequest = new DaumSearchRequest();
		daumSearchRequest.q("다음카카오");
		daumSearchRequest.result(3);
		DaumSearch<DaumWebSearch> daumWebSearch = daum.searchOperations().web(daumSearchRequest);
		System.out.println(
				daumWebSearch.getChannel().getItem().stream().map(f -> f.toString()).collect(Collectors.joining("\n")));
	}

	//
	@Test
	public void image() {
		DaumSearchRequest daumSearchRequest = new DaumSearchRequest();
		daumSearchRequest.q("다음카카오");
		daumSearchRequest.result(3);
		DaumSearch<DaumImageSearch> daumImageSearch = daum.searchOperations().image(daumSearchRequest);
		System.out.println(daumImageSearch.getChannel().getItem().stream().map(f -> f.toString())
				.collect(Collectors.joining("\n")));
	}

	@Test
	public void knowledge() {

		DaumSearchRequestKnowledge daumSearchRequestKnowledge = new DaumSearchRequestKnowledge();
		daumSearchRequestKnowledge.q("다음카카오");
		daumSearchRequestKnowledge.range("complete");
		DaumSearch<DaumKnowledgeSearch> daumImageSearch = daum.searchOperations().knowledge(daumSearchRequestKnowledge);
		System.out.println(daumImageSearch.getChannel().getItem().stream().map(f -> f.toString())
				.collect(Collectors.joining("\n")));
	}

	@Test
	public void book() {
		DaumSearchRequestBook daumSearchRequestBook = new DaumSearchRequestBook();
		daumSearchRequestBook.cate_id("33");
		// daumSearchRequestBook.result(3);
		daumSearchRequestBook.q("네티");
		DaumSearch<DaumBookSearch> daumImageSearch = daum.searchOperations().book(daumSearchRequestBook);
		System.out.println(daumImageSearch.getChannel().getItem().stream().map(f -> f.toString())
				.collect(Collectors.joining("\n")));
	}

	@Test
	public void cafe() {
		DaumSearchRequest daumSearchRequestBook = new DaumSearchRequest();
		// daumSearchRequestBook.result(3);
		daumSearchRequestBook.q("카카오프렌즈 -네오");
		DaumSearch<DaumCafeSearch> daumImageSearch = daum.searchOperations().cafe(daumSearchRequestBook);
		System.out.println(daumImageSearch.getChannel().getItem().stream().map(f -> f.toString())
				.collect(Collectors.joining("\n")));
	}
}
