package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 11..
 */
public class DaumErrors {

    /**
     * jsonp를 지원하지 않는 API를 jsonp로 호출한 경우
     */
    public static final Integer ACCESS_DENIED_ERROR = 401;

    /**
     * appkey를 사용가능한 whitelist가 아닌곳에서 호출한 경우
     */
    public static final Integer UNAUTHORIZED = 402;

    /**
     * 등록되지 않은 appkey사용
     */
    public static final Integer NOT_AUTHORIZED_ERROR = 403;

    public static final Integer RESOURCE_NOT_FOUND = 404;

    public static final Integer MISSING_PARAMETER = 409;

    public static final Integer REQUEST_THROTTLED = 429;

    public static final Integer ETC = 500;

    public static final Integer REQUEST_TIMEOUT = 504;
}
