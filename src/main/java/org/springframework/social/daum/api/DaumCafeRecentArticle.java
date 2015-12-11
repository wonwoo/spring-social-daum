package org.springframework.social.daum.api;

public class DaumCafeRecentArticle extends DaumCafeArticle {

	private String boardName;

	public String getBoardName() {
		return boardName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumCafeRecentArticle [boardName=");
		builder.append(boardName);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getHidden()=");
		builder.append(getHidden());
		builder.append(", getUserName()=");
		builder.append(getUserName());
		builder.append(", getBoardId()=");
		builder.append(getBoardId());
		builder.append(", getCommentCount()=");
		builder.append(getCommentCount());
		builder.append(", getRegDateTime()=");
		builder.append(getRegDateTime());
		builder.append(", getViewCount()=");
		builder.append(getViewCount());
		builder.append(", getArticleId()=");
		builder.append(getArticleId());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
}
