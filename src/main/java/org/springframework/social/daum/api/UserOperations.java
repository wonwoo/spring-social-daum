package org.springframework.social.daum.api;

public interface UserOperations {
	
	long getProfileId();

	String getNickname();

	DaumProfile getUserProfile();

}
