package org.springframework.social.daum.api;

public interface CafeOperations {


	DaumFavoriteCafe favorite();


	DaumCafeBoards boards(String cafeCode);


	DaumCafeArticles articles(String cafeCode, String boardId);


	DaumCafeRecentArticles recentArticles(String cafeCode);


	DaumCafeAlimis alimis();


	DaumCafeArticle writeArticle(String cafeCode, String content, boolean hideyn);

}
