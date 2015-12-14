package org.springframework.social.daum.api;

import java.io.Serializable;

public class DaumSearch<E> extends DaumObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private DaumSearchChannel<E> channel;

	public DaumSearchChannel<E> getChannel() {
		return channel;
	}

}
