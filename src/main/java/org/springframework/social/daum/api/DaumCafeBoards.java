package org.springframework.social.daum.api;

import java.io.Serializable;
import java.util.List;

public class DaumCafeBoards extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<DaumCafeBoard> board;
	private int totalSize;

	public List<DaumCafeBoard> getBoard() {
		return board;
	}

	public int getTotalSize() {
		return totalSize;
	}

}