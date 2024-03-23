package io.github.crud.core.gateway;

import io.github.crud.core.entity.Person;

import java.util.UUID;

public interface PersonGateway {
    Person create(Person person);
    Person find(UUID id);
    Person update(Person person);
    Person delete(UUID id);
}
