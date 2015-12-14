package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 14..
 */
public class DaumVclipSearch {

    private String  thumb_2;
    private String  thumb_1;
    private String  pubDate;
    private String  thumb_4;
    private String  time_1;
    private String  thumb_3;
    private String  time_0;
    private String  thumb_5;
    private String  tag;
    private String  link;
    private String  thumb_0;
    private String  player_url;
    private String  author;
    private String  title;
    private String  thumbnail;
    private String  description;
    private String  time_4;
    private String  time_5;
    private String  bitrate;
    private String  time_2;
    private String  time_3;
    private String  cpname;
    private String  playtime;

    public String getAuthor() {
        return author;
    }

    public String getBitrate() {
        return bitrate;
    }

    public String getCpname() {
        return cpname;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getPlayer_url() {
        return player_url;
    }

    public String getPlaytime() {
        return playtime;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getTag() {
        return tag;
    }

    public String getThumb_0() {
        return thumb_0;
    }

    public String getThumb_1() {
        return thumb_1;
    }

    public String getThumb_2() {
        return thumb_2;
    }

    public String getThumb_3() {
        return thumb_3;
    }

    public String getThumb_4() {
        return thumb_4;
    }

    public String getThumb_5() {
        return thumb_5;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTime_0() {
        return time_0;
    }

    public String getTime_1() {
        return time_1;
    }

    public String getTime_2() {
        return time_2;
    }

    public String getTime_3() {
        return time_3;
    }

    public String getTime_4() {
        return time_4;
    }

    public String getTime_5() {
        return time_5;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumVclipSearch{");
        sb.append("author='").append(author).append('\'');
        sb.append(", thumb_2='").append(thumb_2).append('\'');
        sb.append(", thumb_1='").append(thumb_1).append('\'');
        sb.append(", pubDate='").append(pubDate).append('\'');
        sb.append(", thumb_4='").append(thumb_4).append('\'');
        sb.append(", time_1='").append(time_1).append('\'');
        sb.append(", thumb_3='").append(thumb_3).append('\'');
        sb.append(", time_0='").append(time_0).append('\'');
        sb.append(", thumb_5='").append(thumb_5).append('\'');
        sb.append(", tag='").append(tag).append('\'');
        sb.append(", link='").append(link).append('\'');
        sb.append(", thumb_0='").append(thumb_0).append('\'');
        sb.append(", player_url='").append(player_url).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", thumbnail='").append(thumbnail).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", time_4='").append(time_4).append('\'');
        sb.append(", time_5='").append(time_5).append('\'');
        sb.append(", bitrate='").append(bitrate).append('\'');
        sb.append(", time_2='").append(time_2).append('\'');
        sb.append(", time_3='").append(time_3).append('\'');
        sb.append(", cpname='").append(cpname).append('\'');
        sb.append(", playtime='").append(playtime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
