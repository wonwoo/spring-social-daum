package org.springframework.social.daum.api;

import java.util.List;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogChannel {

    private String status;
    private Integer totalCount;
    private String maxDate;
    private List<DaumBlogItem> item;


    public String getStatus() {
        return status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public List<DaumBlogItem> getItem() {
        return item;
    }
}
