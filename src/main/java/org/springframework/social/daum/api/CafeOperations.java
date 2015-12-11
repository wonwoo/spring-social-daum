package org.springframework.social.daum.api;

public interface CafeOperations {

	/**
	 * 자주가는 카페
	 * 
	 * @return
	 */
	DaumFavoriteCafe favorite();

	/**
	 * 게시판 리스트
	 * 
	 * @param cafeCode
	 *            카페 코드
	 * @return
	 */
	DaumCafeBoards boards(String cafeCode);

	/**
	 * 게시글 리스트
	 * 
	 * @param cafeCode
	 *            카페 코드
	 * @param boardId
	 *            게시판ID
	 * @return
	 */
	DaumCafeArticles articles(String cafeCode, String boardId);

	/**
	 * 최신글 보기
	 * 
	 * @param cafeCode
	 *            카페 코드
	 */
	DaumCafeRecentArticles recentArticles(String cafeCode);

	/**
	 * 알리미
	 * 
	 * @return
	 */
	DaumCafeAlimis alimis();

	/**
	 * 게시글 쓰기
	 * 
	 * @param cafeCode
	 * @param content
	 * @param hideyn
	 * @return
	 */
	DaumCafeArticle writeArticle(String cafeCode, String content, boolean hideyn);

}
