package org.springframework.social.daum.api.impl;

public abstract class AbstractApiRestTemplate {

	private String uri = "https://apis.daum.net/";

	public String getUrl() {
		StringBuilder builder = new StringBuilder();
		setUrl(builder);
		return uri + "/" + builder.toString();
	}

	abstract public void setUrl(StringBuilder builder);
}
