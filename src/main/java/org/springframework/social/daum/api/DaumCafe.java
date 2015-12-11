package org.springframework.social.daum.api;

public class DaumCafe {

	/**
	 * 카페 코드
	 */
	private String cafeCode;

	/**
	 * 카페 이름
	 */
	private String name;

	/**
	 * 새글 존재 여부
	 */
	private boolean updated;

	public String getCafeCode() {
		return cafeCode;
	}

	public String getName() {
		return name;
	}

	public boolean isUpdated() {
		return updated;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumCafe [cafeCode=");
		builder.append(cafeCode);
		builder.append(", name=");
		builder.append(name);
		builder.append(", updated=");
		builder.append(updated);
		builder.append("]");
		return builder.toString();
	}

}
