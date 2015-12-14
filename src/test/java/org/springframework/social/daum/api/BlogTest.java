package org.springframework.social.daum.api;

//
import org.junit.Test;
//
import static java.util.stream.Collectors.joining;

///**
// * Created by wonwoo on 15. 12. 13..
// */
public class BlogTest extends DaumTest {
	//
	@Test
	public void list() {
		// String blogName, Integer pageNo, String callback
		DaumBlogList daumBlogList = daum.blogOperations().list("leeww1020", 1, "Y");

		System.out.println(daumBlogList.getChannel().getMaxDate());
		System.out.println(daumBlogList.getChannel().getStatus());
		System.out.println(daumBlogList.getChannel().getTotalCount());
		System.out.println(daumBlogList.getChannel().getItem().stream().map(t -> t.toString()).collect(joining("\n")));

		for (DaumBlogItem daumBlogItem : daumBlogList.getChannel().getItem()) {
			if (daumBlogItem.getImages() != null) {
				System.out.println(daumBlogItem.getPostId());
				System.out.println(
						daumBlogItem.getImages().getImage().stream().map(t -> t.toString()).collect(joining("\n")));
			}
		}
	}

	@Test
	public void categories() {
		DaumBlogCategories daumBlogCategories = daum.blogOperations().categories("ahahblog");
		System.out.println(daumBlogCategories.getChannel().getStatus());
		System.out.println(
				daumBlogCategories.getChannel().getItems().stream().map(f -> f.toString()).collect(joining("\n")));
	}

	@Test
	public void comments() {
		DaumBlogComments daumBlogComments = daum.blogOperations().comments("daum_cafe", "933");

		System.out.println(daumBlogComments.getChannel().getStatus());
		System.out.println(daumBlogComments.getChannel().getTotalCount());
		System.out.println(
				daumBlogComments.getChannel().getItem().stream().map(f -> f.toString()).collect(joining("\n")));
	}

	@Test
	public void info() {
		DaumBlogInfos daumBlogInfos = daum.blogOperations().info("daum_cafe");
		System.out.println(daumBlogInfos.getChannel());
	}

	@Test
	public void write() {
		DaumBlogWrite daumBlogWrite = new DaumBlogWrite();
		daumBlogWrite.title("테스트123").content("테스트내용123123").tag("테스트,하하,테스트내용");
		DaumBlogResponses blogWriteResponses = daum.blogOperations().write("leeww1020", daumBlogWrite);
		System.out.println(blogWriteResponses);
	}

	@Test
	public void modify() {
		DaumBlogModify daumBlogModify = new DaumBlogModify();
		daumBlogModify.postId("4").title("수정").content("수정123123").tag("테스트,하하,테스트내용111");
		DaumBlogResponses blogWriteResponses = daum.blogOperations().modify("leeww1020", daumBlogModify);
		System.out.println(blogWriteResponses);
	}

	@Test
	public void read() {
		DaumBlogReads blogWriteResponses = daum.blogOperations().read("leeww1020", "5");
		System.out.println(blogWriteResponses);
	}

	@Test
	public void commentwrite() {
		DaumBlogCommentWrite daumBlogCommentWrite = new DaumBlogCommentWrite();
		daumBlogCommentWrite.postId("5").content("수정123123").name("wonwoolee").email("leeww1020@hanmail.net")
				.password("dheh1020").secret("Y").homepage("http://aoruqjfu.fun25.co.kr");
		DaumBlogResponses blogWriteResponses = daum.blogOperations().comment("leeww1020", daumBlogCommentWrite);
		System.out.println(blogWriteResponses);
	}

	@Test
	public void activities() {
		DaumBlogActivities daumBlogActivities = daum.blogOperations().activities("leeww1020");
		System.out.println(daumBlogActivities);
	}
	@Test
	public void upload() {
		DaumBlogResponses daumBlogResponses = daum.blogOperations().upload("leeww1020", "C:\\Users\\Public\\Pictures\\Sample Pictures\\db225928-a4c5-462b-87aa-97a798257419.png");
		System.out.println(daumBlogResponses);
	}

}
