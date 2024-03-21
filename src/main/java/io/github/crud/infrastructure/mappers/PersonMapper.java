package io.github.crud.infrastructure.mappers;

import io.github.crud.core.entity.Person;
import io.github.crud.infrastructure.PersonDTO;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public Person toPerson(PersonDTO personDto){
        return new Person(personDto.id(), personDto.name(), personDto.email(), personDto.password());
    }

    public PersonDTO toDTO(Person person){
        return new PersonDTO(person.id(), person.name(), person.email(), person.password());
    }
}
