package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogItem {

    private String postId;
    private String nickname;
    private String title;
    private String content;
    private String date;
    private String open;
    private String url;
    private String categoryId;
    private String viewId;
    private String isScrap;
    private String comments;
    private String trackbacks;
    private DaumBlogImage images;


    public String getPostId() {
        return postId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getOpen() {
        return open;
    }

    public String getUrl() {
        return url;
    }


    public String getCategoryId() {
        return categoryId;
    }


    public String getViewId() {
        return viewId;
    }

    public String getIsScrap() {
        return isScrap;
    }

    public String getComments() {
        return comments;
    }

    public String getTrackbacks() {
        return trackbacks;
    }

    public DaumBlogImage getImages() {
        return images;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumBlogItem{");
        sb.append("postId='").append(postId).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append(", open='").append(open).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", categoryId='").append(categoryId).append('\'');
        sb.append(", viewId='").append(viewId).append('\'');
        sb.append(", isScrap='").append(isScrap).append('\'');
        sb.append(", comments='").append(comments).append('\'');
        sb.append(", trackbacks='").append(trackbacks).append('\'');
        sb.append(", images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}