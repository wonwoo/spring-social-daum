package org.springframework.social.daum.api;

public class DaumCafeBoard {

	/**
	 * 게시판 아이디
	 */
	private String boardId;

	/**
	 * 게시판 이름
	 */
	private String name;

	/**
	 * 새글 존재 여부
	 */
	private boolean hasNew;

	/**
	 * 게시판 타입
	 */
	private String boardType;
	/**
	 * 게시판 감추기 여부(관리자 기능)
	 */
	private boolean display;
	/**
	 * 익명 게시판 여부
	 */
	private boolean anonymous;

	public String getName() {
		return name;
	}

	public boolean isHasNew() {
		return hasNew;
	}

	public String getBoardType() {
		return boardType;
	}

	public boolean isDisplay() {
		return display;
	}

	public boolean isAnonymous() {
		return anonymous;
	}

	public String getBoardId() {
		return boardId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumCafeBoard [boardId=");
		builder.append(boardId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", hasNew=");
		builder.append(hasNew);
		builder.append(", boardType=");
		builder.append(boardType);
		builder.append(", display=");
		builder.append(display);
		builder.append(", anonymous=");
		builder.append(anonymous);
		builder.append("]");
		return builder.toString();
	}
}
