package org.springframework.social.daum.api;

public class DaumCafe {

	/**
	 * ī�� �ڵ�
	 */
	private String cafeCode;

	/**
	 * ī�� �̸�
	 */
	private String name;

	/**
	 * ���� ���� ����
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
