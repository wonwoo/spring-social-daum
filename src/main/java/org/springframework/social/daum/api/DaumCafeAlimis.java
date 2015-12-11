package org.springframework.social.daum.api;

import java.io.Serializable;

public class DaumCafeAlimis extends DaumObject implements Serializable {
	private static final long serialVersionUID = 1L;

	private DaumCafeAlimi alimiBbs;
	private DaumCafeAlimi alimiUser;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public DaumCafeAlimi getAlimiBbs() {
		return alimiBbs;
	}

	public DaumCafeAlimi getAlimiUser() {
		return alimiUser;
	}

}