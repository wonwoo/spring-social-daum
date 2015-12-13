package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogCategoryItem {
    private String open;
    private String categoryId;
    private String name;

    public String getOpen() {
        return open;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DaumCategoryItem{");
        sb.append("open='").append(open).append('\'');
        sb.append(", categoryId='").append(categoryId).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
