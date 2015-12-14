package org.springframework.social.daum.api.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.daum.api.BlogOperations;
import org.springframework.social.daum.api.DaumBlogActivities;
import org.springframework.social.daum.api.DaumBlogCategories;
import org.springframework.social.daum.api.DaumBlogCommentWrite;
import org.springframework.social.daum.api.DaumBlogComments;
import org.springframework.social.daum.api.DaumBlogInfos;
import org.springframework.social.daum.api.DaumBlogList;
import org.springframework.social.daum.api.DaumBlogModify;
import org.springframework.social.daum.api.DaumBlogReads;
import org.springframework.social.daum.api.DaumBlogResponses;
import org.springframework.social.daum.api.DaumBlogWrite;
import org.springframework.social.daum.api.DaumRestApi;
import org.springframework.social.daum.api.RequestPrarmetersException;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class BlogTemplate extends AbstractDaumOperations implements BlogOperations {

	private final RestTemplate restTemplate;
	private DaumRestApi daumRestApi;

	public BlogTemplate(DaumRestApi daumRestApi, RestTemplate restTemplate, boolean isAuthorized) {
		super(isAuthorized);
		this.restTemplate = restTemplate;
		this.daumRestApi = daumRestApi;
	}

	@Override
	public DaumBlogList list(String blogName, String categoryId, Integer pageNo, Integer result, String viewContent) {
		requireAuthorization();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("blogName", blogName);
		params.put("categoryId", categoryId);
		params.put("pageNo", pageNo);
		params.put("result", result);
		params.put("viewContent", viewContent);
		String url = "/blog/v1/{blogName}/list.json?categoryId={categoryId}&pageNo={pageNo}&result={result}&viewContent={viewContent}";
		return daumRestApi.fetchObject(url, DaumBlogList.class, params);
	}

	@Override
	public DaumBlogList list(String blogName, Integer pageNo, Integer result, String viewContent) {
		return this.list(blogName, "", pageNo, result, viewContent);
	}

	@Override
	public DaumBlogList list(String blogName, Integer pageNo, String viewContent) {
		return this.list(blogName, "", pageNo, 20, viewContent);
	}

	@Override
	public DaumBlogList list(String blogName, Integer pageNo) {
		return this.list(blogName, "", pageNo, 20, "N");
	}

	@Override
	public DaumBlogCategories categories(String blogName) {
		requireAuthorization();
		String url = "/blog/v1/{blogName}/categories.json";
		return daumRestApi.fetchObject(url, DaumBlogCategories.class, blogName);
	}

	@Override
	public DaumBlogComments comments(String blogName, String postId) {
		requireAuthorization();
		String url = "/blog/v1/{blogName}/comments.json?postId={postId}";
		return daumRestApi.fetchObject(url, DaumBlogComments.class, blogName, postId);
	}

	@Override
	public DaumBlogInfos info(String blogName) {
		requireAuthorization();
		String url = "/blog/v1/{blogName}/info.json";
		return daumRestApi.fetchObject(url, DaumBlogInfos.class, blogName);
	}

	@Override
	public DaumBlogResponses write(String blogName, DaumBlogWrite daumBlogWrite) {
		requireAuthorization();
		if (blogName == null) {
			throw new RequestPrarmetersException("is nonexistent parameter blogName");
		}
		if (daumBlogWrite == null) {
			throw new RequestPrarmetersException("is nonexistent parameter daumBlogWrite object");
		}
		String url = "/blog/v1/{blogName}/write.json";
		return daumRestApi.post(url, daumBlogWrite.toRequestParameters(), DaumBlogResponses.class, blogName);
	}

	@Override
	public DaumBlogResponses modify(String blogName, DaumBlogModify daumBlogModify) {
		requireAuthorization();
		if (blogName == null) {
			throw new RequestPrarmetersException("is nonexistent parameter blogName");
		}
		if (daumBlogModify == null) {
			throw new RequestPrarmetersException("is nonexistent parameter daumBlogModify object");
		}
		String url = "/blog/v1/{blogName}/modify.json";
		return daumRestApi.post(url, daumBlogModify.toRequestParameters(), DaumBlogResponses.class, blogName);
	}

	@Override
	public DaumBlogReads read(String blogName, String postId) {
		requireAuthorization();
		String url = "/blog/v1/{blogName}/read.json?postId={postId}";
		return daumRestApi.fetchObject(url, DaumBlogReads.class, blogName, postId);
	}

	@Override
	public DaumBlogResponses comment(String blogName, DaumBlogCommentWrite daumBlogCommentWrite) {
		requireAuthorization();
		if (blogName == null) {
			throw new RequestPrarmetersException("is nonexistent parameter blogName");
		}
		if (daumBlogCommentWrite == null) {
			throw new RequestPrarmetersException("is nonexistent parameter daumBlogCommentWrite object");
		}
		String url = "/blog/v1/{blogName}/comment/write.json";
		return daumRestApi.post(url, daumBlogCommentWrite.toRequestParameters(), DaumBlogResponses.class, blogName);
	}

	@Override
	public DaumBlogActivities activities(String blogName) {
		String url = "/blog/v1/{blogName}/activities.json";
		return daumRestApi.fetchObject(url, DaumBlogActivities.class, blogName);
	}

	@Override
	public DaumBlogResponses upload(String blogName, String file) {
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("file", new FileSystemResource(file));
		String url = "/blog/v1/{blogName}/upload-file.json";
		HttpHeaders imageHeaders = new HttpHeaders();
		imageHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
		HttpEntity<MultiValueMap<String, Object>> imageEntity = new HttpEntity<MultiValueMap<String, Object>>(map,
				imageHeaders);
		return daumRestApi.post(url, imageEntity, DaumBlogResponses.class, blogName);
	}
}
