package io.github.crud.infrastructure.controller;

import io.github.crud.core.entity.Person;
import io.github.crud.core.usecases.CreatePersonUseCase;
import io.github.crud.core.usecases.DeletePersonUseCase;
import io.github.crud.core.usecases.FindPersonByIdUseCase;
import io.github.crud.core.usecases.UpdatePersonUseCase;
import io.github.crud.infrastructure.PersonDTO;
import io.github.crud.infrastructure.mappers.PersonMapper;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("person")
public class PersonController {
    private final CreatePersonUseCase createPersonUseCase;
    private final FindPersonByIdUseCase findPersonByIdUseCase;
    private final UpdatePersonUseCase updatePersonUseCase;

    private final DeletePersonUseCase deletePersonUseCase;
    private final PersonMapper personMapper;


    public PersonController(CreatePersonUseCase createPersonUseCase, PersonMapper personMapper, FindPersonByIdUseCase findPersonByIdUseCase, UpdatePersonUseCase updatePersonUseCase, DeletePersonUseCase deletePersonUseCase) {
        this.createPersonUseCase = createPersonUseCase;
        this.personMapper = personMapper;
        this.findPersonByIdUseCase = findPersonByIdUseCase;
        this.updatePersonUseCase = updatePersonUseCase;
        this.deletePersonUseCase = deletePersonUseCase;
    }

    @PostMapping
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO){
        Person person = personMapper.toPerson(personDTO);
        return personMapper.toDTO(createPersonUseCase.execute(person));
    }

    @GetMapping("/{uuid}")
    public PersonDTO findPersonById(@PathVariable UUID uuid){
        return personMapper.toDTO(findPersonByIdUseCase.execute(uuid));
    }

    @PutMapping
    public PersonDTO updatePerson(@RequestBody PersonDTO personDTO){
        Person person = personMapper.toPerson(personDTO);
        return personMapper.toDTO(updatePersonUseCase.execute(person));
    }

    @DeleteMapping("/{uuid}")
    public PersonDTO deletePersonById(@PathVariable UUID uuid){
        return personMapper.toDTO(deletePersonUseCase.execute(uuid));
    }
}
