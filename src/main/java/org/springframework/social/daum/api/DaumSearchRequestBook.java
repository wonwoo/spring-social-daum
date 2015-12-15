package org.springframework.social.daum.api;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class DaumSearchRequestBook extends DaumSearchRequest {

	private String searchType;
	private String cate_id;

	public String getSearchType() {
		return searchType;
	}

	public DaumSearchRequestBook searchType(String searchType) {
		this.searchType = searchType;
		return this;
	}

	public String getCate_id() {
		return cate_id;
	}

	public DaumSearchRequestBook cate_id(String cate_id) {
		this.cate_id = cate_id;
		return this;
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
		if (searchType != null) {
			parameters.add("searchType", searchType);
		}
		if (cate_id != null) {
			parameters.add("cate_id", cate_id);
		}
		return parameters;
	}

}
