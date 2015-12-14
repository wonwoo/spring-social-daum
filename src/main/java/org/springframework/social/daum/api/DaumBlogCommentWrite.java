package org.springframework.social.daum.api;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class DaumBlogCommentWrite {

	private String postId; // 글 ID

	private String content; // 댓글 내용

	private String name; // 이름(로그인시 무시)

	private String email; // 이메일(로그인시 무시)

	private String homepage; // 홈페이지(로그인시 무시)

	private String password; // 비밀번호(로그인시 무시)

	private String secret; // 비밀글 여부(Y) (비로그인시 무시)

	public DaumBlogCommentWrite postId(String postId) {
		this.postId = postId;
		return this;
	}

	public DaumBlogCommentWrite content(String content) {
		this.content = content;
		return this;
	}

	public DaumBlogCommentWrite name(String name) {
		this.name = name;
		return this;
	}

	public DaumBlogCommentWrite email(String email) {
		this.email = email;
		return this;
	}

	public DaumBlogCommentWrite homepage(String homepage) {
		this.homepage = homepage;
		return this;
	}

	public DaumBlogCommentWrite password(String password) {
		this.password = password;
		return this;
	}

	public DaumBlogCommentWrite secret(String secret) {
		this.secret = secret;
		return this;
	}

	public MultiValueMap<String, Object> toRequestParameters() {
		MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<String, Object>();
		if (postId != null) {
			parameters.add("postId", postId);
		}
		if (content != null) {
			parameters.add("content", content);
		}
		if (name != null) {
			parameters.add("name", name);
		}
		if (email != null) {
			parameters.add("email", email);
		}
		if (homepage != null) {
			parameters.add("homepage", homepage);
		}
		if (password != null) {
			parameters.add("password", password);
		}

		if (secret != null) {
			parameters.add("secret", secret);
		}
		return parameters;
	}
}
