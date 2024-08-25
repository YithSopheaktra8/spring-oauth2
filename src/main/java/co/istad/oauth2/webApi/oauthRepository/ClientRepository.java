package co.istad.oauth2.webApi.oauthRepository;

import java.util.Optional;


import co.istad.oauth2.webApi.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    Optional<Client> findByClientId(String clientId);
}
