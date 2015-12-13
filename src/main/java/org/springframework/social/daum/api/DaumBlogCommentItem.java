package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogCommentItem {

    private String content;
    private String name;
    private String date;
    private String url;
    private String commentId;

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public String getCommentId() {
        return commentId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumBlogCommentItem{");
        sb.append("content='").append(content).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", commentId='").append(commentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
