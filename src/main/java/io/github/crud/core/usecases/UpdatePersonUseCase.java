package io.github.crud.core.usecases;

import io.github.crud.core.entity.Person;

public interface UpdatePersonUseCase {
    Person execute(Person person);
}
