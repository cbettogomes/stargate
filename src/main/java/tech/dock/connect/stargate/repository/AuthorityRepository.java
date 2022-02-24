package tech.dock.connect.stargate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.dock.connect.stargate.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
