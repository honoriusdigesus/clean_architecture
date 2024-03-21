package io.github.crud.core.usecases;

import io.github.crud.core.entity.Person;
import io.github.crud.core.gateway.PersonGateway;

public class CreatePersonUseCaseImpl implements CreatePersonUseCase{

    private final PersonGateway personGateway;

    public CreatePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(Person person) {
        return personGateway.create(person);
    }
}
