package org.springframework.social.daum.api;

/**
 * Created by wonwoo on 15. 12. 11..
 */
public class DaumError {
    private String errorType;
    private String message;

    public DaumError(){}

    public DaumError(String errorType, String message) {
        this.errorType = errorType;
        this.message = message;

    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
