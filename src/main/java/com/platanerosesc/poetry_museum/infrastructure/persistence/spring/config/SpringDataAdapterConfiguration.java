package com.platanerosesc.poetry_museum.infrastructure.persistence.spring.config;

import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.adapter.UserSpringPersistenceAdapter;
import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDataAdapterConfiguration {

    @Bean
    public UserPersistencePort getUserPersistencePort(UserRepository userRepository){
        return new UserSpringPersistenceAdapter(userRepository);
    }

}
