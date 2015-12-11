package org.springframework.social.daum.api;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public abstract class DaumObject {
	private Map<String, Object> extraData;

	public DaumObject() {
		this.extraData = new HashMap<String, Object>();
	}

	@JsonAnyGetter
	public Map<String, Object> getExtraData() {
		return this.extraData;
	}

	@JsonAnySetter
	public void add(String key, Object value) {
		this.extraData.put(key, value);
	}
}
