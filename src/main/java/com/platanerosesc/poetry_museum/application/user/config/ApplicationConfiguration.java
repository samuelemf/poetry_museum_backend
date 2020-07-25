package com.platanerosesc.poetry_museum.application.user.config;

import com.platanerosesc.poetry_museum.application.user.CreateUserImpl;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public CreateUserImpl getUserService(UserPersistencePort userPersistencePort){
        return new CreateUserImpl(userPersistencePort);
    }
}
