package org.springframework.social.daum.api;

import java.util.List;

public class DaumSearchChannel<E> {

	private Integer result;
	private Integer pageCount;
	private String title;
	private Integer totalCount;
	private String description;
	private List<E> item;
	private String lastBuildDate;
	private String link;
	private String generator;

	public Integer getResult() {
		return result;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public String getTitle() {
		return title;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public String getDescription() {
		return description;
	}

	public List<E> getItem() {
		return item;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public String getLink() {
		return link;
	}

	public String getGenerator() {
		return generator;
	}

}
