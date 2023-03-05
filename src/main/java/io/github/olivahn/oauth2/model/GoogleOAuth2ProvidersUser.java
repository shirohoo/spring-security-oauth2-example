package io.github.olivahn.oauth2.model;

import org.springframework.security.oauth2.core.user.OAuth2User;

final class GoogleOAuth2ProvidersUser extends AbstractOAuth2ProvidersUser {
    public GoogleOAuth2ProvidersUser(OAuth2User oAuth2User, String clientRegistrationId) {
        super(oAuth2User, clientRegistrationId, oAuth2User.getAttributes());
    }

    @Override
    public String id() {
        return (String) attributes().get("sub");
    }

    @Override
    public String username() {
        return (String) attributes().get("name");
    }
}
