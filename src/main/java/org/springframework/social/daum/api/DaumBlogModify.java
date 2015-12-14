package org.springframework.social.daum.api;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class DaumBlogModify {

	private String postId;

	private String title;

	private String content;

	private String tag;

	private String viewCategoryId;

	private String categoryId;

	private String open;

	public DaumBlogModify postId(String postId) {
		this.postId = postId;
		return this;
	}

	public DaumBlogModify title(String title) {
		this.title = title;
		return this;
	}

	public DaumBlogModify content(String content) {
		this.content = content;
		return this;
	}

	public DaumBlogModify tag(String tag) {
		this.tag = tag;
		return this;
	}

	public DaumBlogModify viewCategoryId(String viewCategoryId) {
		this.viewCategoryId = viewCategoryId;
		return this;
	}

	public DaumBlogModify categoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public DaumBlogModify open(String open) {
		this.open = open;
		return this;
	}

	public MultiValueMap<String, Object> toRequestParameters() {
		MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<String, Object>();
		if (postId != null) {
			parameters.add("postId", postId);
		}
		if (title != null) {
			parameters.add("title", title);
		}
		if (content != null) {
			parameters.add("content", content);
		}
		if (tag != null) {
			parameters.add("tag", tag);
		}
		if (viewCategoryId != null) {
			parameters.add("viewCategoryId", viewCategoryId);
		}
		if (categoryId != null) {
			parameters.add("categoryId", categoryId);
		}
		if (open != null) {
			parameters.add("open", open);
		}

		return parameters;
	}
}
