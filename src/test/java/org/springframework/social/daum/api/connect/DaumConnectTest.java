package org.springframework.social.daum.api.connect;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.daum.connect.DaumConnectionFactory;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Parameters;

import java.io.IOException;
import java.util.List;

/**
 * Created by wonwoo on 15. 12. 12..
 */
public class DaumConnectTest {

    DaumConnectionFactory daumConnectionFactory = null;
    ConnectionFactoryRegistry connectionFactoryRegistry = null;
    OAuth2Parameters oAuth2Parameters = null;
    //insert your client_id;
    static final String CLIENT_ID = "590959147147625002";
    //insert your secret_key;
    static final String SECRET_KEY = "6bd7c95b77fe4d8a4733e5a01419bb54";

    @Before
    public void befofe(){
        daumConnectionFactory = new DaumConnectionFactory(CLIENT_ID,SECRET_KEY);
        connectionFactoryRegistry = new ConnectionFactoryRegistry();
        connectionFactoryRegistry.addConnectionFactory(daumConnectionFactory);
        oAuth2Parameters = new OAuth2Parameters();
        oAuth2Parameters.setRedirectUri("http://127.0.0.1:8080/daum/callback");
    }

    @Test
    public void connectTest(){
        OAuth2Operations oAuth2Operations = daumConnectionFactory.getOAuthOperations();
        String authurl = oAuth2Operations.buildAuthenticateUrl(GrantType.AUTHORIZATION_CODE, oAuth2Parameters);
        System.out.println(String.format("authurl : %s", authurl));
    }

    @Test
    public void accessTokenTest() throws IOException {
        String code = "94876";
        OAuth2Operations oAuth2Operations = daumConnectionFactory.getOAuthOperations();
        AccessGrant accessGrant = oAuth2Operations.exchangeForAccess(code, "http://127.0.0.1:8080/daum/callback", null);
        printAcess(accessGrant);
    }


    @Test
    public void refreshAcesssTokenTest() throws IOException {
        String refreshToken = "1a85e5cdb84e0f6da58b410256ddd922483b3308e43d68bf1081796d1990b885dca10a768f12ee3e8fdb0cb5395f42860a05ca9f31a84d099488aa59f49ebbfd";
        OAuth2Operations oAuth2Operations = daumConnectionFactory.getOAuthOperations();
        AccessGrant accessGrant = oAuth2Operations.refreshAccess(refreshToken, null);
        printAcess(accessGrant);
    }

    private void printAcess(AccessGrant accessGrant) throws IOException {
        System.out.println(String.format("accessToken : %s", accessGrant.getAccessToken()));
        System.out.println(String.format("expireTime : %s", accessGrant.getExpireTime()));
        System.out.println(String.format("refreshToken : %s", accessGrant.getRefreshToken()));
        System.out.println(String.format("scope : %s", accessGrant.getScope()));

        ObjectMapper objectMapper = new ObjectMapper();
        List<String> scopes = objectMapper.readValue(accessGrant.getScope(), List.class);
        System.out.println(scopes);
    }

}
