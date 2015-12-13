package org.springframework.social.daum.api;

import java.net.URI;
import java.util.Map;

public interface DaumRestApi {

	<T> T fetchObject(String url, Class<T> type);

	<T> T fetchObject(URI uri , Class<T> type, Object... urlVariables);

	<T> T fetchObject(String url, Class<T> type, Object... urlVariables);

	<T> T fetchObject(String url, Class<T> type, Map<String, ?> urlVariables);

	<T> T fetchPostObject(String url, Object request, Class<T> responseType, Object... urlVariables);
}
