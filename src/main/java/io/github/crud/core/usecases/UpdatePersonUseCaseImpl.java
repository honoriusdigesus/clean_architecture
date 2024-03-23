package io.github.crud.core.usecases;

import io.github.crud.core.entity.Person;
import io.github.crud.core.gateway.PersonGateway;

public class UpdatePersonUseCaseImpl implements UpdatePersonUseCase {

    private final PersonGateway personGateway;

    public UpdatePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(Person person) {
        return personGateway.update(person);
    }
}
