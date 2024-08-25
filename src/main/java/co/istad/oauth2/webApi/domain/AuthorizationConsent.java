package co.istad.oauth2.webApi.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "authorizationConsents")
@IdClass(AuthorizationConsent.AuthorizationConsentId.class)
@Setter
@Getter
@NoArgsConstructor
public class AuthorizationConsent {
    @Id
    private String registeredClientId;
    @Id
    private String principalName;
    @Column(length = 1000)
    private String authorities;

    @Getter
    @Setter
    @NoArgsConstructor
    @EqualsAndHashCode
    public static class AuthorizationConsentId implements Serializable {
        private String registeredClientId;
        private String principalName;

    }
}
