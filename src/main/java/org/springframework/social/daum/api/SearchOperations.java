package org.springframework.social.daum.api;

public interface SearchOperations {

	DaumSearch<DaumBlogSearch> board(String q, Integer result, String advance, Integer pageno, String sort);
}
