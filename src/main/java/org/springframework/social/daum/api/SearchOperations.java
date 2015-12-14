package org.springframework.social.daum.api;

import com.sun.xml.internal.bind.v2.TODO;

public interface SearchOperations {

	DaumSearch<DaumBoardSearch> board(String q, Integer result, String advance, Integer pageno, String sort);

	DaumSearch<DaumBoardSearch> board(String q, Integer result, String advance, Integer pageno);

	DaumSearch<DaumBoardSearch> board(String q, Integer result, String advance);

	DaumSearch<DaumBoardSearch> board(String q, Integer result);

	DaumSearch<DaumBoardSearch> board(String q);

	DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String advance, Integer pageno, String sort);

	DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String advance, Integer pageno);

	DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String advance);

	DaumSearch<DaumVclipSearch> vclip(String q, Integer result);

	DaumSearch<DaumVclipSearch> vclip(String q);

	DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance, Integer pageno, String sort);

	DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance, Integer pageno);

	DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance);

	DaumSearch<DaumBlogSearch> blog(String q, Integer result);

	DaumSearch<DaumBlogSearch> blog(String q);

	DaumSearch<DaumWebSearch> web(String q, Integer result, String advance, Integer pageno);

	DaumSearch<DaumWebSearch> web(String q, Integer result, String advance);

	DaumSearch<DaumWebSearch> web(String q, Integer result);

	DaumSearch<DaumWebSearch> web(String q);

	DaumSearch<DaumImageSearch> image(String q, Integer result, String advance, Integer pageno, String sort);

	DaumSearch<DaumImageSearch> image(String q, Integer result, String advance, Integer pageno);

	DaumSearch<DaumImageSearch> image(String q, Integer result, String advance);

	DaumSearch<DaumImageSearch> image(String q, Integer result);

	DaumSearch<DaumImageSearch> image(String q);

	//TODO 팁 검색


}
