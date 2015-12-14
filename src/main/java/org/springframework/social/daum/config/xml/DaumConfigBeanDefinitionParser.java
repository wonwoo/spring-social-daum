package org.springframework.social.daum.config.xml;

import java.util.Map;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.daum.config.support.DaumApiHelper;
import org.springframework.social.daum.connect.DaumConnectionFactory;
import org.springframework.social.daum.security.DaumAuthenticationService;
import org.springframework.social.security.provider.SocialAuthenticationService;

public class DaumConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {
	public DaumConfigBeanDefinitionParser() {
		super(DaumConnectionFactory.class, DaumApiHelper.class);
	}

	@Override
	protected Class<? extends SocialAuthenticationService<?>> getAuthenticationServiceClass() {
		return DaumAuthenticationService.class;
	}

	@Override
	protected BeanDefinition getConnectionFactoryBeanDefinition(String appId, String appSecret,
			Map<String, Object> allAttributes) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(DaumConnectionFactory.class)
				.addConstructorArgValue(appId).addConstructorArgValue(appSecret);
		if (allAttributes.containsKey("app-namespace")) {
			builder.addConstructorArgValue(allAttributes.get("app-namespace"));
		}
		return builder.getBeanDefinition();
	}
}