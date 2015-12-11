package org.springframework.social.daum.api;

import java.io.Serializable;
import java.util.List;

public class DaumFavoriteCafe extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<DaumCafe> cafe;

	public List<DaumCafe> getCafe() {
		return cafe;
	}

}
