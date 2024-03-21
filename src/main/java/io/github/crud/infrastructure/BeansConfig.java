package io.github.crud.infrastructure;

import io.github.crud.core.gateway.PersonGateway;
import io.github.crud.core.usecases.CreatePersonUseCase;
import io.github.crud.core.usecases.CreatePersonUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public CreatePersonUseCase createPersonUseCase(PersonGateway personGateway){
        return new CreatePersonUseCaseImpl(personGateway);
    }

}
