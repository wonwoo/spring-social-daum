package org.springframework.social.daum.api;

public interface CafeOperations {

	/**
	 * ���ְ��� ī��
	 * 
	 * @return
	 */
	DaumFavoriteCafe favorite();

	/**
	 * �Խ��� ����Ʈ
	 * 
	 * @param cafeCode
	 *            ī�� �ڵ�
	 * @return
	 */
	DaumCafeBoards boards(String cafeCode);

	/**
	 * �Խñ� ����Ʈ
	 * 
	 * @param cafeCode
	 *            ī�� �ڵ�
	 * @param boardId
	 *            �Խ���ID
	 * @return
	 */
	DaumCafeArticles articles(String cafeCode, String boardId);

	/**
	 * �ֽű� ����
	 * 
	 * @param cafeCode
	 *            ī�� �ڵ�
	 */
	DaumCafeRecentArticles recentArticles(String cafeCode);

	/**
	 * �˸���
	 * 
	 * @return
	 */
	DaumCafeAlimis alimis();

	/**
	 * �Խñ� ����
	 * 
	 * @param cafeCode
	 * @param content
	 * @param hideyn
	 * @return
	 */
	DaumCafeArticle writeArticle(String cafeCode, String content, boolean hideyn);

}
