package org.springframework.social.daum.api;

public class DaumCafeArticle {

	/**
	 * 게시글 제목
	 */
	private String name;

	/**
	 * 비밀글 여부 (한줄 메모장에 한함)
	 */
	private String hidden;

	/**
	 * 작성자 nickname
	 */
	private DaumCafeArticleUsername userName;

	/**
	 * 게시판Id
	 */
	private String boardId;

	/**
	 * 댓글 개수
	 */
	private Integer commentCount;

	/**
	 * 작성일(milliseconds since January 1, 1970, 00:00:00 GMT)
	 */
	private Long regDateTime;

	/**
	 * 조회수
	 */
	private Integer viewCount;

	/**
	 * 게시글 번호
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
