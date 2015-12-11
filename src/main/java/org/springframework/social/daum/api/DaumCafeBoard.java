package org.springframework.social.daum.api;

public class DaumCafeBoard {


	private String boardId;

	private String name;

	private boolean hasNew;

	private String boardType;

	private boolean display;

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
