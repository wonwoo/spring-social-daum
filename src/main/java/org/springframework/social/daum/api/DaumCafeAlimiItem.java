package org.springframework.social.daum.api;

public class DaumCafeAlimiItem {

	private String cafeName;
	private String cafeCode;
	private String alimType;
	private String alimDesc;
	private String boardId;
	private Integer articleId;
	private String articleTitle;

	public String getCafeName() {
		return cafeName;
	}

	public String getCafeCode() {
		return cafeCode;
	}

	public String getAlimType() {
		return alimType;
	}

	public String getAlimDesc() {
		return alimDesc;
	}

	public String getBoardId() {
		return boardId;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumCafeAlimiItem [cafeName=");
		builder.append(cafeName);
		builder.append(", cafeCode=");
		builder.append(cafeCode);
		builder.append(", alimType=");
		builder.append(alimType);
		builder.append(", alimDesc=");
		builder.append(alimDesc);
		builder.append(", boardId=");
		builder.append(boardId);
		builder.append(", articleId=");
		builder.append(articleId);
		builder.append(", articleTitle=");
		builder.append(articleTitle);
		builder.append("]");
		return builder.toString();
	}

}
