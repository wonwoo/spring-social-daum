package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public interface BlogOperations {

	DaumBlogList list(String blogName, String categoryId, Integer pageNo, Integer result, String viewContent);

	DaumBlogList list(String blogName, Integer pageNo, Integer result, String viewContent);

	DaumBlogList list(String blogName, Integer pageNo, String viewContent);

	DaumBlogList list(String blogName, Integer pageNo);

	DaumBlogCategories categories(String blogName);

	DaumBlogComments comments(String blogName, String postId);

	DaumBlogInfos info(String blogName);

	DaumBlogResponses write(String blogName, DaumBlogWrite daumBlogWrite);

	DaumBlogResponses modify(String blogName, DaumBlogModify daumBlogModify);

	DaumBlogReads read(String blogName, String postId);

	DaumBlogResponses comment(String blogName, DaumBlogCommentWrite daumBlogCommentWrite);

	DaumBlogActivities activities(String blogName);

	DaumBlogResponses upload(String blogName, String file);

}
