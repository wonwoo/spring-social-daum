package org.springframework.social.daum.api.impl;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.social.daum.api.*;
import org.springframework.web.client.RestTemplate;

public class SearchTemplate implements SearchOperations {

    private RestTemplate restTemplate = null;
    private DaumRestApi daumRestApi = null;

    public SearchTemplate(DaumRestApi daumRestApi, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.daumRestApi = daumRestApi;
    }

    @Override
    public DaumSearch<DaumBoardSearch> board(String q, Integer result, String advance, Integer pageno, String sort) {
        ResponseEntity<DaumSearch<DaumBoardSearch>> responseEntity = restTemplate.exchange(
                "https://apis.daum.net/search/board?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
                HttpMethod.GET, null, new ParameterizedTypeReference<DaumSearch<DaumBoardSearch>>() {
                }, q, result, advance, pageno, sort);
        return responseEntity.getBody();
    }

    @Override
    public DaumSearch<DaumBoardSearch> board(String q, Integer result, String advance, Integer pageno) {
        return this.board(q, result, advance, pageno, "accu");
    }

    @Override
    public DaumSearch<DaumBoardSearch> board(String q, Integer result, String advance) {
        return this.board(q, result, advance, 1);
    }

    @Override
    public DaumSearch<DaumBoardSearch> board(String q, Integer result) {
        return this.board(q, result, "n");
    }

    @Override
    public DaumSearch<DaumBoardSearch> board(String q) {
        return this.board(q, 20);
    }

    @Override
    public DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String advance, Integer pageno, String sort) {
        ResponseEntity<DaumSearch<DaumVclipSearch>> responseEntity = restTemplate.exchange(
                "https://apis.daum.net/search/vclip?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
                HttpMethod.GET, null, new ParameterizedTypeReference<DaumSearch<DaumVclipSearch>>() {
                }, q, result, advance, pageno, sort);
        return responseEntity.getBody();
    }

    @Override
    public DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String advance, Integer pageno) {
        return this.vclip(q, result, advance, pageno, "accuracy");
    }

    @Override
    public DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String advance) {
        return this.vclip(q, result, advance, 1);
    }

    @Override
    public DaumSearch<DaumVclipSearch> vclip(String q, Integer result) {
        return this.vclip(q, result, "n");
    }

    @Override
    public DaumSearch<DaumVclipSearch> vclip(String q) {
        return this.vclip(q, 10);
    }

    @Override
    public DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance, Integer pageno, String sort) {
        ResponseEntity<DaumSearch<DaumBlogSearch>> responseEntity = restTemplate.exchange(
                "https://apis.daum.net/search/blog?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
                HttpMethod.GET, null, new ParameterizedTypeReference<DaumSearch<DaumBlogSearch>>() {
                }, q, result, advance, pageno, sort);
        return responseEntity.getBody();
    }

    @Override
    public DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance, Integer pageno) {
        return this.blog(q, result, advance, pageno, "date");
    }

    @Override
    public DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance) {
        return this.blog(q, result, advance, 1);
    }

    @Override
    public DaumSearch<DaumBlogSearch> blog(String q, Integer result) {
        return this.blog(q, result, "n");
    }

    @Override
    public DaumSearch<DaumBlogSearch> blog(String q) {
        return this.blog(q, 10);
    }

    @Override
    public DaumSearch<DaumWebSearch> web(String q, Integer result, String advance, Integer pageno) {
        ResponseEntity<DaumSearch<DaumWebSearch>> responseEntity = restTemplate.exchange(
                "https://apis.daum.net/search/web?q={q}&result={result}&advance={advance}&pageno={pageno}",
                HttpMethod.GET, null, new ParameterizedTypeReference<DaumSearch<DaumWebSearch>>() {
                }, q, result, advance, pageno);
        return responseEntity.getBody();
    }

    @Override
    public DaumSearch<DaumWebSearch> web(String q, Integer result, String advance) {
        return this.web(q, result, advance, 1);
    }

    @Override
    public DaumSearch<DaumWebSearch> web(String q, Integer result) {
        return this.web(q, result, "n");
    }

    @Override
    public DaumSearch<DaumWebSearch> web(String q) {
        return this.web(q, 10);
    }

    @Override
    public DaumSearch<DaumImageSearch> image(String q, Integer result, String advance, Integer pageno, String sort) {
        ResponseEntity<DaumSearch<DaumImageSearch>> responseEntity = restTemplate.exchange(
                "https://apis.daum.net/search/image?q={q}&result={result}&advance={advance}&pageno={pageno}&sort={sort}",
                HttpMethod.GET, null, new ParameterizedTypeReference<DaumSearch<DaumImageSearch>>() {
                }, q, result, advance, pageno, sort);
        return responseEntity.getBody();
    }

    @Override
    public DaumSearch<DaumImageSearch> image(String q, Integer result, String advance, Integer pageno) {
        return this.image(q, result, advance, pageno, "accu");
    }

    @Override
    public DaumSearch<DaumImageSearch> image(String q, Integer result, String advance) {
        return this.image(q, result, advance, 1);
    }

    @Override
    public DaumSearch<DaumImageSearch> image(String q, Integer result) {
        return this.image(q, result, "n");
    }

    @Override
    public DaumSearch<DaumImageSearch> image(String q) {
        return this.image(q, 20);
    }

}