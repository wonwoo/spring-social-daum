package org.springframework.social.daum.api;

import org.junit.Test;

public class UserProfileTest extends DaumTest {

	@Test
	public void getDaumProfile() {
		long id = daum.userOperation().getProfileId();
		System.out.println(String.format("getProfileId : %s", id));
		String nickname = daum.userOperation().getNickname();
		System.out.println(String.format("getNickname : %s", nickname));
		DaumProfile profile = daum.userOperation().getUserProfile();
		System.out.println(profile.getResult().getExtraData());
	}
}
