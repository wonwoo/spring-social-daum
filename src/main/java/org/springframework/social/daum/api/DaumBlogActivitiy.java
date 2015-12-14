package org.springframework.social.daum.api;

import java.util.List;

public class DaumBlogActivitiy {

	private List<DaumBlogActivitiyItem> items;
	private Integer status;

	public List<DaumBlogActivitiyItem> getItems() {
		return items;
	}

	public Integer getStatus() {
		return status;
	}

}
