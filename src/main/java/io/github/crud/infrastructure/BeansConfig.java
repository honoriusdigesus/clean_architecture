package io.github.crud.infrastructure;

import io.github.crud.core.gateway.PersonGateway;
import io.github.crud.core.usecases.CreatePersonUseCase;
import io.github.crud.core.usecases.CreatePersonUseCaseImpl;
import io.github.crud.core.usecases.FindPersonByIdUseCase;
import io.github.crud.core.usecases.findPersonByIdUseCaseImpl;
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

}
