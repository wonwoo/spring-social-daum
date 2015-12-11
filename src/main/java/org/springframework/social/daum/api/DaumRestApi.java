package org.springframework.social.daum.api;

public interface DaumRestApi {

	<T> T fetchObject(String url, Class<T> type);

	// TODO restApi º¯°æ
}
