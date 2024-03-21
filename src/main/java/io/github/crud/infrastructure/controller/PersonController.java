package io.github.crud.infrastructure.controller;

import io.github.crud.core.entity.Person;
import io.github.crud.core.usecases.CreatePersonUseCase;
import io.github.crud.infrastructure.PersonDTO;
import io.github.crud.infrastructure.mappers.PersonMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {
    private final CreatePersonUseCase createPersonUseCase;
    private final PersonMapper personMapper;

    public PersonController(CreatePersonUseCase createPersonUseCase, PersonMapper personMapper) {
        this.createPersonUseCase = createPersonUseCase;
        this.personMapper = personMapper;
    }

    @PostMapping
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO){
        Person person = personMapper.toPerson(personDTO);
        return personMapper.toDTO(createPersonUseCase.execute(person));
    }
}