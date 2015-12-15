package org.springframework.social.daum.api;

public class DaumCafeSearch {
	private String link_bold;
	private String pubDate;
	private String title;
	private String cmt_count;
	private String cafeName;
	private String cafeUrl;
	private String description;
	private String link;

	public String getLink_bold() {
		return link_bold;
	}

	public String getPubDate() {
		return pubDate;
	}

	public String getTitle() {
		return title;
	}

	public String getCmt_count() {
		return cmt_count;
	}

	public String getCafeName() {
		return cafeName;
	}

	public String getCafeUrl() {
		return cafeUrl;
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
		builder.append("DaumCafeSearch [link_bold=");
		builder.append(link_bold);
		builder.append(", pubDate=");
		builder.append(pubDate);
		builder.append(", title=");
		builder.append(title);
		builder.append(", cmt_count=");
		builder.append(cmt_count);
		builder.append(", cafeName=");
		builder.append(cafeName);
		builder.append(", cafeUrl=");
		builder.append(cafeUrl);
		builder.append(", description=");
		builder.append(description);
		builder.append(", link=");
		builder.append(link);
		builder.append("]");
		return builder.toString();
	}

}
