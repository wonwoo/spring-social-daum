package org.springframework.social.daum.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.daum.api.Daum;
import org.springframework.social.daum.api.DaumProfile;

public class DaumAdapter implements ApiAdapter<Daum> {

	@Override
	public boolean test(Daum api) {
		return false;
	}

	@Override
	public void setConnectionValues(Daum daum, ConnectionValues values) {
		DaumProfile daumProfile = daum.userOperation().getUserProfile();
		values.setProviderUserId(Long.toString(daumProfile.getResult().getId()));
		values.setDisplayName(daumProfile.getResult().getNickname());
		values.setProfileUrl(daumProfile.getResult().getImagePath());
		values.setImageUrl(daumProfile.getResult().getBigImagePath());
	}

	@Override
	public UserProfile fetchUserProfile(Daum daum) {
		DaumProfile profile = daum.userOperation().getUserProfile();
		return new UserProfileBuilder().setName(profile.getResult().getNickname())
				.setUsername(profile.getResult().getNickname()).build();
	}

	@Override
	public void updateStatus(Daum daum, String message) {
	}
}