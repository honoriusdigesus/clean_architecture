package io.github.crud.infrastructure;

import io.github.crud.core.gateway.PersonGateway;
import io.github.crud.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public CreatePersonUseCase createPersonUseCase(PersonGateway personGateway){
        return new CreatePersonUseCaseImpl(personGateway);
    }
    @Bean
    public FindPersonByIdUseCase findPersonByIdUseCase(PersonGateway personGateway){
        return new findPersonByIdUseCaseImpl(personGateway);
    }
    @Bean
    public UpdatePersonUseCase updatePersonUseCase(PersonGateway personGateway){
        return new UpdatePersonUseCaseImpl(personGateway);
    }
    @Bean
    public DeletePersonUseCase deletePersonUseCase(PersonGateway personGateway){
        return new DeletePersonUseCaseImpl(personGateway);
    }

}
