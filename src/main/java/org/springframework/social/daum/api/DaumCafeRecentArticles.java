package org.springframework.social.daum.api;

import java.io.Serializable;
import java.util.List;

public class DaumCafeRecentArticles extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<DaumCafeRecentArticle> article;
	private int totalSize;

	public int getTotalSize() {
		return totalSize;
	}

	public List<DaumCafeRecentArticle> getArticle() {
		return article;
	}

}