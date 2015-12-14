package org.springframework.social.daum.api;

public class DaumBlogRead {

	private Integer status;
	private Integer postId;
	private String url;
	private String title;
	private String nickname;
	private String comments;// string 댓글 수
	private String trackbacks;// string 트랙백 수
	private String tag;// string 태그
	private String date;// string 작성날짜
	private String images;// string 첨부된 이미지
	private DaumBlogNode previousPost;// string 이전 글 노드
	private DaumBlogNode nextPost;// string 다음 글 노드

	public Integer getStatus() {
		return status;
	}

	public Integer getPostId() {
		return postId;
	}

	public String getUrl() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public String getNickname() {
		return nickname;
	}

	public String getComments() {
		return comments;
	}

	public String getTrackbacks() {
		return trackbacks;
	}

	public String getTag() {
		return tag;
	}

	public String getDate() {
		return date;
	}

	public String getImages() {
		return images;
	}

	public DaumBlogNode getPreviousPost() {
		return previousPost;
	}

	public DaumBlogNode getNextPost() {
		return nextPost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumBlogRead [status=");
		builder.append(status);
		builder.append(", postId=");
		builder.append(postId);
		builder.append(", url=");
		builder.append(url);
		builder.append(", title=");
		builder.append(title);
		builder.append(", nickname=");
		builder.append(nickname);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", trackbacks=");
		builder.append(trackbacks);
		builder.append(", tag=");
		builder.append(tag);
		builder.append(", date=");
		builder.append(date);
		builder.append(", images=");
		builder.append(images);
		builder.append(", previousPost=");
		builder.append(previousPost);
		builder.append(", nextPost=");
		builder.append(nextPost);
		builder.append("]");
		return builder.toString();
	}

}
