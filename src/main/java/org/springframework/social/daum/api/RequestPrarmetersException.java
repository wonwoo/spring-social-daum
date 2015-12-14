package org.springframework.social.daum.api;

import org.springframework.social.OperationNotPermittedException;

public class RequestPrarmetersException extends OperationNotPermittedException {

	private static final long serialVersionUID = 1L;

	public RequestPrarmetersException(String message) {
		super("daum", message);
	}

}
