package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 15..
 */
public class DaumImageSearch {

    private String pubDate;
    private String title;
    private String thumbnail;
    private String cp;
    private String height;
    private String link;
    private String width;
    private String image;

    public String getCp() {
        return cp;
    }

    public String getHeight() {
        return height;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getWidth() {
        return width;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumImageSearch{");
        sb.append("cp='").append(cp).append('\'');
        sb.append(", pubDate='").append(pubDate).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", thumbnail='").append(thumbnail).append('\'');
        sb.append(", height='").append(height).append('\'');
        sb.append(", link='").append(link).append('\'');
        sb.append(", width='").append(width).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
