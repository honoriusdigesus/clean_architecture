package io.github.crud.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonEntityJpa extends JpaRepository<PersonEntity, UUID> {
}
