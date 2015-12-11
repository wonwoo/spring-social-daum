package org.springframework.social.daum.api;

import java.io.Serializable;
import java.util.List;

public class DaumCafeArticles extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<DaumCafeArticle> article;
	private int totalSize;
	private int totalNewSize;

	public int getTotalSize() {
		return totalSize;
	}

	public List<DaumCafeArticle> getArticle() {
		return article;
	}

	public int getTotalNewSize() {
		return totalNewSize;
	}

}
