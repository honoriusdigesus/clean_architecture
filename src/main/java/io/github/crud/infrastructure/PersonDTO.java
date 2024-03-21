package io.github.crud.infrastructure;

import java.util.UUID;

public record PersonDTO(UUID id, String name, String email, String password) {
}

