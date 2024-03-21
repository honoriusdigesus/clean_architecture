package io.github.crud.infrastructure.mappers;

import io.github.crud.core.entity.Person;
import io.github.crud.infrastructure.persistence.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonEntityMapper {
    public PersonEntity toEntity(Person person){
        return new PersonEntity(person.id(),person.name(),person.email(),person.password());
    }

    public Person toPerson(PersonEntity personEntity){
        return new Person(personEntity.getId(), personEntity.getName(), personEntity.getEmail(), personEntity.getPassword());
    }
}
