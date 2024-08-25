package co.istad.oauth2.webApi.repository;

import co.istad.oauth2.webApi.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
