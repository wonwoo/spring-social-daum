package org.springframework.social.daum.api;

public class DaumBlogActivitiyItem {

	private String title;
	private String postId;
	private String pubDate;
	private String description;
	private String author;
	private String type;

	public String getTitle() {
		return title;
	}

	public String getPostId() {
		return postId;
	}

	public String getPubDate() {
		return pubDate;
	}

	public String getDescription() {
		return description;
	}

	public String getAuthor() {
		return author;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumBlogActivitiyItem [title=");
		builder.append(title);
		builder.append(", postId=");
		builder.append(postId);
		builder.append(", pubDate=");
		builder.append(pubDate);
		builder.append(", description=");
		builder.append(description);
		builder.append(", author=");
		builder.append(author);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

}
