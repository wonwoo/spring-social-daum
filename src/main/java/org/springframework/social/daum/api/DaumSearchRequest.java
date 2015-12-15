package org.springframework.social.daum.api;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;

public class DaumSearchRequest {

	private String q;
	private Integer result;
	private String advance;
	private Integer pageno;
	private String sort;

	public DaumSearchRequest q(String q) {
		this.q = q;
		return this;
	}

	public DaumSearchRequest result(Integer result) {
		this.result = result;
		return this;
	}

	public DaumSearchRequest advance(String advance) {
		this.advance = advance;
		return this;
	}

	public DaumSearchRequest pageno(Integer pageno) {
		this.pageno = pageno;
		return this;
	}

	public DaumSearchRequest sort(String sort) {
		this.sort = sort;
		return this;
	}

	public String getQ() {
		return q;
	}

	public Integer getResult() {
		return result;
	}

	public String getAdvance() {
		return advance;
	}

	public Integer getPageno() {
		return pageno;
	}

	public String getSort() {
		return sort;
	}

	public MultiValueMap<String, Object> toRequestParameters() {
		MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<String, Object>();
		if (q != null) {
			parameters.add("q", q);
		}
		if (result != null) {
			parameters.add("result", result);
		}
		if (advance != null) {
			parameters.add("advance", advance);
		}
		if (pageno != null) {
			parameters.add("pageno", pageno);
		}
		if (sort != null) {
			parameters.add("sort", sort);
		}
		return parameters;
	}
}
