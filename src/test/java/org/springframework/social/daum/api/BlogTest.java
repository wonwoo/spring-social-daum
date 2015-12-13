package org.springframework.social.daum.api;

import org.junit.Test;

import static java.util.stream.Collectors.joining;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class BlogTest extends DaumTest{

    @Test
    public void list(){
        //String blogName, Integer pageNo, String callback
        DaumBlogList daumBlogList = daum.blogOperations().list("ahahblog",1,"Y");

        System.out.println(daumBlogList.getChannel().getMaxDate());
        System.out.println(daumBlogList.getChannel().getStatus());
        System.out.println(daumBlogList.getChannel().getTotalCount());
        System.out.println(daumBlogList.getChannel().getItem().stream().map(t -> t.toString()).collect(joining("\n")));

        for (DaumBlogItem daumBlogItem : daumBlogList.getChannel().getItem()){
            if(daumBlogItem.getImages() != null){
                System.out.println(daumBlogItem.getPostId());
                System.out.println(daumBlogItem.getImages().getImage().stream().map(t -> t.toString()).collect(joining("\n")));
            }
        }
    }

    @Test
    public void categories(){
        DaumBlogCategories daumBlogCategories = daum.blogOperations().categories("ahahblog");
        System.out.println(daumBlogCategories.getChannel().getStatus());
        System.out.println(daumBlogCategories.getChannel().getItems().stream().map(f -> f.toString()).collect(joining("\n")));
    }

    @Test
    public void comments(){
        DaumBlogComments daumBlogComments = daum.blogOperations().comments("daum_cafe", "933");

        System.out.println(daumBlogComments.getChannel().getStatus());
        System.out.println(daumBlogComments.getChannel().getTotalCount());
        System.out.println(daumBlogComments.getChannel().getItem().stream().map(f->f.toString()).collect(joining("\n")));
    }

    @Test
    public void info(){
        DaumBlogInfos daumBlogInfos = daum.blogOperations().info("daum_cafe");
        System.out.println(daumBlogInfos.getChannel());
    }
}
