package org.springframework.social.daum.api;

import java.util.List;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogCategory {
    private String status;
    private List<DaumBlogCategoryItem> items;

    public String getStatus() {
        return status;
    }

    public List<DaumBlogCategoryItem> getItems() {
        return items;
    }
}
