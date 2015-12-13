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


    //TODO 새글 쓰기, 글 수정하기 , 글 내용 가져오기(글한개), 파일 업로드, 댓글 작성 하기, 나에 대한 반응 목록 가져오기


}
