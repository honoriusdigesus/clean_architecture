package io.github.crud.core.gateway;

import io.github.crud.core.entity.Person;

public interface PersonGateway {
    Person create(Person person);
}
