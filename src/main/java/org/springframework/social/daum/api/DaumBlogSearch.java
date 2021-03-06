package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 15..
 */
public class DaumBlogSearch {

    private String pubDate;
    private String author;
    private String title;
    private String description;
    private String link;
    private String comment;

    public String getAuthor() {
        return author;
    }

    public String getComment() {
        return comment;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumBlogSearch{");
        sb.append("author='").append(author).append('\'');
        sb.append(", pubDate='").append(pubDate).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", link='").append(link).append('\'');
        sb.append(", comment='").append(comment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
