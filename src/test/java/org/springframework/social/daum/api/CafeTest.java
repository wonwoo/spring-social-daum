package org.springframework.social.daum.api;

import static java.util.stream.Collectors.*;

import org.junit.Test;

public class CafeTest extends DaumTest {

	@Test
	public void getDaumCafeFavorite() {
		DaumFavoriteCafe daumFavoriteCafe = daum.cafeOperation().favorite();
		System.out.println(daumFavoriteCafe.getCafe().stream().map(t -> t.toString()).collect(joining("\n")));
	}

	@Test
	public void getDaumCafeBoards() {
		DaumCafeBoards daumCafeBoards = daum.cafeOperation().boards("10201010");
		System.out.println(String.format("getTotalSize : %s", daumCafeBoards.getTotalSize()));
		System.out.println(daumCafeBoards.getBoard().stream().map(t -> t.toString()).collect(joining("\n")));
	}

	@Test
	public void getDaumCafeArticles() {
		DaumCafeArticles daumCafeArticles = daum.cafeOperation().articles("10201010", "bDB1");
		System.out.println(String.format("getTotalSize : %s", daumCafeArticles.getTotalSize()));
		System.out.println(String.format("getTotalNewSize : %s", daumCafeArticles.getTotalNewSize()));
		System.out.println(daumCafeArticles.getArticle().stream().map(t -> t.toString()).collect(joining("\n")));
	}

	@Test
	public void getDaumCafeRecentArticles() {
		DaumCafeRecentArticles daumCafeRecentArticles = daum.cafeOperation().recentArticles("10201010");
		System.out.println(String.format("getTotalSize : %s", daumCafeRecentArticles.getTotalSize()));
		System.out.println(daumCafeRecentArticles.getArticle().stream().map(t -> t.toString()).collect(joining("\n")));
	}

	@Test
	public void getDaumCafealimis() {
		DaumCafeAlimis daumCafeAlimis = daum.cafeOperation().alimis();
		System.out
				.println(daumCafeAlimis.getAlimiBbs().getItem().stream().map(t -> t.toString()).collect(joining("\n")));
		System.out.println(
				daumCafeAlimis.getAlimiUser().getItem().stream().map(t -> t.toString()).collect(joining("\n")));
	}

	@Test
	public void getDaumWriteArticle() {
		DaumCafeArticle daumCafeAlimis = daum.cafeOperation().writeArticle("10201010", "TEST 123", true);
		System.out.println(daumCafeAlimis);
	}
}
