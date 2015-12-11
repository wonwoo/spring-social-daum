package org.springframework.social.daum.api;

public class DaumCafeArticle {


	private String name;


	private String hidden;


	private DaumCafeArticleUsername userName;


	private String boardId;


	private Integer commentCount;


	private Long regDateTime;


	private Integer viewCount;

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
