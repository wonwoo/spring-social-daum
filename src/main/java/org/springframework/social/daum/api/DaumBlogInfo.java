package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogInfo {
    private String isNewGuestbookExists;
    private String nickname;
    private String status;
    private String profileThumbnailImageUrl;
    private String profileImageUrl;
    private String rssUrl;
    private String url;
    private String id;
    private String visitorCount;
    private String title;
    private String description;
    private String name;
    private String myconImageUrl;

    public String getIsNewGuestbookExists() {
        return isNewGuestbookExists;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getMyconImageUrl() {
        return myconImageUrl;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getProfileThumbnailImageUrl() {
        return profileThumbnailImageUrl;
    }

    public String getRssUrl() {
        return rssUrl;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getVisitorCount() {
        return visitorCount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumBlogInfo{");
        sb.append("description='").append(description).append('\'');
        sb.append(", isNewGuestbookExists='").append(isNewGuestbookExists).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", profileThumbnailImageUrl='").append(profileThumbnailImageUrl).append('\'');
        sb.append(", profileImageUrl='").append(profileImageUrl).append('\'');
        sb.append(", rssUrl='").append(rssUrl).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", visitorCount='").append(visitorCount).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", myconImageUrl='").append(myconImageUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
