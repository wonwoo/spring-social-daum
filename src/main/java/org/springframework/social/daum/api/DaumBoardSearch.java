package org.springframework.social.daum.api;

public class DaumBoardSearch {

	private String pubDate;
	private String author;
	private String title;
	private String description;
	private String link;
	private String keyword;
	private String comment;

	public String getPubDate() {
		return pubDate;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getLink() {
		return link;
	}

	public String getKeyword() {
		return keyword;
	}

	public String getComment() {
		return comment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumBoardSearch [pubDate=");
		builder.append(pubDate);
		builder.append(", author=");
		builder.append(author);
		builder.append(", title=");
		builder.append(title);
		builder.append(", description=");
		builder.append(description);
		builder.append(", link=");
		builder.append(link);
		builder.append(", keyword=");
		builder.append(keyword);
		builder.append(", comment=");
		builder.append(comment);
		builder.append("]");
		return builder.toString();
	}

}
