package org.springframework.social.daum.api;

import java.io.Serializable;

public class DaumBlogResponses extends DaumObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private DaumBlogResponse channel;

	public DaumBlogResponse getChannel() {
		return channel;
	}
}
