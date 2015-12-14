package org.springframework.social.daum.api;

import java.io.Serializable;

public class DaumBlogReads extends DaumObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private DaumBlogRead channel;

	public DaumBlogRead getChannel() {
		return channel;
	}
}
