package org.springframework.social.daum.api;

import java.io.Serializable;

public class DaumProfile extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;
	private String message;
	private DaumProfileResult result;

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public DaumProfileResult getResult() {
		return result;
	}

}