package org.springframework.social.daum.api.impl;

import org.springframework.social.daum.api.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Object> params = new HashMap<>();
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
        String url = "/blog/v1/{blogName}/categories.json";
        return daumRestApi.fetchObject(url, DaumBlogCategories.class, blogName);
    }

    @Override
    public DaumBlogComments comments(String blogName, String postId) {
        String url = "/blog/v1/{blogName}/comments.json?postId={postId}";
        return daumRestApi.fetchObject(url, DaumBlogComments.class, blogName, postId);
    }

    @Override
    public DaumBlogInfos info(String blogName) {
        String url = "/blog/v1/{blogName}/info.json";
        return daumRestApi.fetchObject(url, DaumBlogInfos.class, blogName);
    }
}
