package io.github.crud.core.usecases;

import io.github.crud.core.entity.Person;
import io.github.crud.core.gateway.PersonGateway;

import java.util.UUID;

public class DeletePersonUseCaseImpl implements DeletePersonUseCase{
    private final PersonGateway personGateway;

    public DeletePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(UUID id) {
        return personGateway.delete(id);
    }
}
