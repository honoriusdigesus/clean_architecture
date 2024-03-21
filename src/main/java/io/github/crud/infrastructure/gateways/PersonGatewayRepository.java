package io.github.crud.infrastructure.gateways;

import io.github.crud.core.entity.Person;
import io.github.crud.core.gateway.PersonGateway;
import io.github.crud.infrastructure.mappers.PersonEntityMapper;
import io.github.crud.infrastructure.persistence.PersonEntity;
import io.github.crud.infrastructure.persistence.PersonEntityJpa;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PersonGatewayRepository implements PersonGateway {
    private final PersonEntityJpa personEntityJpa;
    private final PersonEntityMapper personEntityMapper;

    public PersonGatewayRepository(PersonEntityJpa personEntityJpa, PersonEntityMapper personEntityMapper) {
        this.personEntityJpa = personEntityJpa;
        this.personEntityMapper = personEntityMapper;
    }

    @Override
    public Person create(Person person) {
        PersonEntity personEntity = personEntityMapper.toEntity(person);
        PersonEntity personSaved = personEntityJpa.save(personEntity);
        return personEntityMapper.toPerson(personSaved);
    }

    @Override
    public Person find(UUID id) {
        return personEntityMapper.toPerson(personEntityJpa.findById(id).orElseThrow(()->new RuntimeException("Person can not found")));
    }

}
