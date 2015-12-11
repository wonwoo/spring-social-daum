package org.springframework.social.daum.api;

public class DaumCafeArticle {

	/**
	 * �Խñ� ����
	 */
	private String name;

	/**
	 * ��б� ���� (���� �޸��忡 ����)
	 */
	private String hidden;

	/**
	 * �ۼ��� nickname
	 */
	private DaumCafeArticleUsername userName;

	/**
	 * �Խ���Id
	 */
	private String boardId;

	/**
	 * ��� ����
	 */
	private Integer commentCount;

	/**
	 * �ۼ���(milliseconds since January 1, 1970, 00:00:00 GMT)
	 */
	private Long regDateTime;

	/**
	 * ��ȸ��
	 */
	private Integer viewCount;

	/**
	 * �Խñ� ��ȣ
	 */
	private Integer articleId;

	public String getName() {
		return name;
	}

	public String getHidden() {
		return hidden;
	}

	public DaumCafeArticleUsername getUserName() {
		return userName;
	}

	public String getBoardId() {
		return boardId;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public Long getRegDateTime() {
		return regDateTime;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public Integer getArticleId() {
		return articleId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumCafeArticle [name=");
		builder.append(name);
		builder.append(", hidden=");
		builder.append(hidden);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", boardId=");
		builder.append(boardId);
		builder.append(", commentCount=");
		builder.append(commentCount);
		builder.append(", regDateTime=");
		builder.append(regDateTime);
		builder.append(", viewCount=");
		builder.append(viewCount);
		builder.append(", articleId=");
		builder.append(articleId);
		builder.append("]");
		return builder.toString();
	}
}
