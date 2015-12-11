package org.springframework.social.daum.api;

public class DaumCafeArticleUsername {

	private String value;

	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumCafeArticleUsername [value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

}
