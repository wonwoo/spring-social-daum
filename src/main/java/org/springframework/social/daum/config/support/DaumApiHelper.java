package org.springframework.social.daum.config.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.xml.ApiHelper;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.daum.api.Daum;
import org.springframework.social.daum.api.impl.DaumTemplate;

public class DaumApiHelper implements ApiHelper<Daum> {

	private final static Log logger = LogFactory.getLog(DaumApiHelper.class);
	private final UsersConnectionRepository usersConnectionRepository;

	private final UserIdSource userIdSource;

	private DaumApiHelper(UsersConnectionRepository usersConnectionRepository, UserIdSource userIdSource) {
		this.usersConnectionRepository = usersConnectionRepository;
		this.userIdSource = userIdSource;
	}

	public Daum getApi() {
		if (logger.isDebugEnabled()) {
			logger.debug("Getting API bingding instance for daum");
		}
		Connection<Daum> connection = usersConnectionRepository.createConnectionRepository(userIdSource.getUserId())
				.findPrimaryConnection(Daum.class);
		if (logger.isDebugEnabled() && connection == null) {
			logger.debug("No current connection; Returning default DaumTemplate instance.");
		}
		return connection != null ? connection.getApi() : new DaumTemplate();
	}

}