package org.springframework.social.daum.api;

import java.io.Serializable;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class DaumBlogWrite extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private String title;

	private String content;

	private String tag;

	private String categoryId;

	private String open;

	private String fileName;

	private String fileUrl;

	private Integer fileSize;

	private String fileType;

	public DaumBlogWrite title(String title) {
		this.title = title;
		return this;
	}

	public DaumBlogWrite content(String content) {
		this.content = content;
		return this;
	}

	public DaumBlogWrite tag(String tag) {
		this.tag = tag;
		return this;
	}

	public DaumBlogWrite categoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public DaumBlogWrite open(String open) {
		this.open = open;
		return this;
	}

	public DaumBlogWrite fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public DaumBlogWrite fileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		return this;
	}

	public DaumBlogWrite fileSize(Integer fileSize) {
		this.fileSize = fileSize;
		return this;
	}

	public DaumBlogWrite fileType(String fileType) {
		this.fileType = fileType;
		return this;
	}

	public MultiValueMap<String, Object> toRequestParameters() {
		MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<String, Object>();
		if (title != null) {
			parameters.add("title", title);
		}
		if (content != null) {
			parameters.add("content", content);
		}
		if (tag != null) {
			parameters.add("tag", tag);
		}
		if (categoryId != null) {
			parameters.add("categoryId", categoryId);
		}
		if (open != null) {
			parameters.add("open", open);
		}
		if (fileName != null) {
			parameters.add("fileName", fileName);
		}

		if (fileUrl != null) {
			parameters.add("fileUrl", fileUrl);
		}

		if (fileSize != null) {
			parameters.add("fileSize", fileSize);
		}

		if (fileType != null) {
			parameters.add("fileType", fileType);
		}
		return parameters;
	}
}
