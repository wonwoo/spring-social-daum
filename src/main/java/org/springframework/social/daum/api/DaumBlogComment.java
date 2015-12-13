package org.springframework.social.daum.api;

import java.util.List;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogComment {

    private String status;
    private Integer totalCount;
    private List<DaumBlogCommentItem> item;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<DaumBlogCommentItem> getItem() {
        return item;
    }

    public void setItem(List<DaumBlogCommentItem> item) {
        this.item = item;
    }
}
