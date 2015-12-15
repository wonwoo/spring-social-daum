package org.springframework.social.daum.api;

public interface SearchOperations {

	DaumSearch<DaumBoardSearch> board(DaumSearchRequest daumSearchRequest);

	DaumSearch<DaumVclipSearch> vclip(DaumSearchRequest daumSearchRequest);

	DaumSearch<DaumBlogSearch> blog(DaumSearchRequest daumSearchRequest);

	DaumSearch<DaumWebSearch> web(DaumSearchRequest daumSearchRequest);

	DaumSearch<DaumImageSearch> image(DaumSearchRequest daumSearchRequest);

	DaumSearch<DaumKnowledgeSearch> knowledge(DaumSearchRequest daumSearchRequest);

	DaumSearch<DaumBookSearch> book(DaumSearchRequest daumSearchRequest);

	DaumSearch<DaumCafeSearch> cafe(DaumSearchRequest daumSearchRequest);

	// DaumSearch<DaumBoardSearch> board(String q, Integer result, String
	// advance, Integer pageno, String sort);
	//
	// DaumSearch<DaumBoardSearch> board(String q, Integer result, String
	// advance, Integer pageno);
	//
	// DaumSearch<DaumBoardSearch> board(String q, Integer result, String
	// advance);
	//
	// DaumSearch<DaumBoardSearch> board(String q, Integer result);
	//
	// DaumSearch<DaumBoardSearch> board(String q);
	//
	// DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String
	// advance, Integer pageno, String sort);
	//
	// DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String
	// advance, Integer pageno);
	//
	// DaumSearch<DaumVclipSearch> vclip(String q, Integer result, String
	// advance);
	//
	// DaumSearch<DaumVclipSearch> vclip(String q, Integer result);
	//
	// DaumSearch<DaumVclipSearch> vclip(String q);
	//
	// DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance,
	// Integer pageno, String sort);
	//
	// DaumSearch<DaumBlogSearch> blog(String q, Integer result, String advance,
	// Integer pageno);
	//
	// DaumSearch<DaumBlogSearch> blog(String q, Integer result, String
	// advance);
	//
	// DaumSearch<DaumBlogSearch> blog(String q, Integer result);
	//
	// DaumSearch<DaumBlogSearch> blog(String q);
	//
	// DaumSearch<DaumWebSearch> web(String q, Integer result, String advance,
	// Integer pageno);
	//
	// DaumSearch<DaumWebSearch> web(String q, Integer result, String advance);
	//
	// DaumSearch<DaumWebSearch> web(String q, Integer result);
	//
	// DaumSearch<DaumWebSearch> web(String q);
	//
	// DaumSearch<DaumImageSearch> image(String q, Integer result, String
	// advance, Integer pageno, String sort);
	//
	// DaumSearch<DaumImageSearch> image(String q, Integer result, String
	// advance, Integer pageno);
	//
	// DaumSearch<DaumImageSearch> image(String q, Integer result, String
	// advance);
	//
	// DaumSearch<DaumImageSearch> image(String q, Integer result);
	//
	// DaumSearch<DaumImageSearch> image(String q);
	//
	// // TODO 팁 검색
	//
	// DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer result,
	// String advance, Integer pageno, String sort,
	// String range);
	//
	// DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer result,
	// String advance, Integer pageno, String sort);
	//
	// DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer result,
	// String advance, Integer pageno);
	//
	// DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer result,
	// String advance);
	//
	// DaumSearch<DaumKnowledgeSearch> knowledge(String q, Integer result);
	//
	// DaumSearch<DaumKnowledgeSearch> knowledge(String q);
	//
	// DaumSearch<DaumBookSearch> book(String q, Integer result, String advance,
	// Integer pageno, String sort,
	// String searchType, String cate_id);
	//
	// DaumSearch<DaumBookSearch> book(String q, Integer result, String advance,
	// Integer pageno, String sort,
	// String searchType);
	//
	// DaumSearch<DaumBookSearch> book(String q, Integer result, String advance,
	// Integer pageno, String sort);
	//
	// DaumSearch<DaumBookSearch> book(String q, Integer result, String advance,
	// Integer pageno);
	//
	// DaumSearch<DaumBookSearch> book(String q, Integer result, String
	// advance);
	//
	// DaumSearch<DaumBookSearch> book(String q, Integer result);
	//
	// DaumSearch<DaumBookSearch> book(String q);

}
