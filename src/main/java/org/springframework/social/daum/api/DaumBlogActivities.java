package org.springframework.social.daum.api;

import java.io.Serializable;

public class DaumBlogActivities extends DaumObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private DaumBlogActivitiy channel;

	public DaumBlogActivitiy getChannel() {
		return channel;
	}
}
