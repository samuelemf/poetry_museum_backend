package com.platanerosesc.poetry_museum.infrastructure.persistence.memory.config;

import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import com.platanerosesc.poetry_museum.infrastructure.persistence.memory.adapter.UserMemoryPersistenceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InMemoryAdapterConfiguration {

    @Bean
    public UserPersistencePort getUserPersistencePort(){
        return new UserMemoryPersistenceAdapter();
    }
}
