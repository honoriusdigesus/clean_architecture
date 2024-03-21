package io.github.crud.core.usecases;

import io.github.crud.core.entity.Person;
import io.github.crud.core.gateway.PersonGateway;

import java.util.UUID;

public class findPersonByIdUseCaseImpl implements FindPersonByIdUseCase {
    private final PersonGateway personGateway;

    public findPersonByIdUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }


    @Override
    public Person execute(UUID id) {
        return personGateway.find(id);
    }
}
