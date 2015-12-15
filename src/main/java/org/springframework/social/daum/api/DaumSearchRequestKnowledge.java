package org.springframework.social.daum.api;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class DaumSearchRequestKnowledge extends DaumSearchRequest {

	private String range;

	public String getRange() {
		return range;
	}

	public DaumSearchRequestKnowledge range(String range) {
		this.range = range;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumSearchRequestKnowledge [range=");
		builder.append(range);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public MultiValueMap<String, Object> toRequestParameters() {
		MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<String, Object>();
		if (getQ() != null) {
			parameters.add("q", getQ());
		}
		if (getResult() != null) {
			parameters.add("result", getResult());
		}
		if (getAdvance() != null) {
			parameters.add("advance", getAdvance());
		}
		if (getPageno() != null) {
			parameters.add("pageno", getPageno());
		}
		if (getSort() != null) {
			parameters.add("sort", getSort());
		}
		if (range != null) {
			parameters.add("range", range);
		}
		return parameters;
	}
}
