package io.github.crud.core.entity;

import java.util.UUID;

public record Person(UUID id, String name, String email, String password) {
}
