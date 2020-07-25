package com.platanerosesc.poetry_museum.application.user.config;

import com.platanerosesc.poetry_museum.application.user.create.CreateUserImpl;
import com.platanerosesc.poetry_museum.application.user.get.GetUserImpl;
import com.platanerosesc.poetry_museum.application.user.get.GetUserService;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public CreateUserImpl getCreateUserImpl(UserPersistencePort userPersistencePort){
        return new CreateUserImpl(userPersistencePort);
    }

    @Bean
    public GetUserService getUserServiceImpl(UserPersistencePort userPersistencePort){
        return new GetUserImpl(userPersistencePort);
    }
}
