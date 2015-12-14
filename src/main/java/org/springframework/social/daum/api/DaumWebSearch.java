package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 15..
 */
public class DaumWebSearch {

    private String pubDate;
    private String title;
    private String description;
    private String link;
    private String url;

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

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumWebSearch{");
        sb.append("description='").append(description).append('\'');
        sb.append(", pubDate='").append(pubDate).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", link='").append(link).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
