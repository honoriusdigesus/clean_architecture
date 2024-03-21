package io.github.crud.core.usecases;

import io.github.crud.core.entity.Person;

import java.util.UUID;

public interface FindPersonByIdUseCase {
    Person execute(UUID id);
}

