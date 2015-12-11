package org.springframework.social.daum.api;

import java.io.Serializable;

public class DaumProfileResult extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaumProfileResult() {
	}

	private String userid;
	private Long id;
	private String nickname;
	private String imagePath;
	private String bigImagePath;
	private String openProfile;

	public String getUserid() {
		return userid;
	}

	public Long getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	public String getImagePath() {
		return imagePath;
	}

	public String getBigImagePath() {
		return bigImagePath;
	}

	public String getOpenProfile() {
		return openProfile;
	}

}