package org.springframework.social.daum.api;

public class DaumKnowledgeSearch {

	private String pubDate;
	private String category;
	private String title;
	private String answerCount;
	private String description;
	private String link;

	public String getPubDate() {
		return pubDate;
	}

	public String getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public String getAnswerCount() {
		return answerCount;
	}

	public String getDescription() {
		return description;
	}

	public String getLink() {
		return link;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumKnowledgeSearch [pubDate=");
		builder.append(pubDate);
		builder.append(", category=");
		builder.append(category);
		builder.append(", title=");
		builder.append(title);
		builder.append(", answerCount=");
		builder.append(answerCount);
		builder.append(", description=");
		builder.append(description);
		builder.append(", link=");
		builder.append(link);
		builder.append("]");
		return builder.toString();
	}
}
