package org.springframework.social.daum.api;

public class DaumBlogResponse {

	private Integer status;
	private String postId;
	private String url;
	private String blogName;
	private String errorMessage;

	public Integer getStatus() {
		return status;
	}

	public String getPostId() {
		return postId;
	}

	public String getUrl() {
		return url;
	}

	public String getBlogName() {
		return blogName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumBlogWriteResponse [status=");
		builder.append(status);
		builder.append(", postId=");
		builder.append(postId);
		builder.append(", url=");
		builder.append(url);
		builder.append(", blogName=");
		builder.append(blogName);
		builder.append("]");
		return builder.toString();
	}

}
