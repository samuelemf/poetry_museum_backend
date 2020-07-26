package com.platanerosesc.poetry_museum.application.user.config;

import com.platanerosesc.poetry_museum.application.user.create.CreateUserImpl;
import com.platanerosesc.poetry_museum.application.user.delete.DeleteUserImpl;
import com.platanerosesc.poetry_museum.application.user.get.GetUserImpl;
import com.platanerosesc.poetry_museum.application.user.index.IndexUserImpl;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserApplicationConfiguration {

    @Bean
    public CreateUserImpl createUserService(UserPersistencePort userPersistencePort){
        return new CreateUserImpl(userPersistencePort);
    }

    @Bean
    public DeleteUserImpl deleteUserService(UserPersistencePort userPersistencePort){
        return new DeleteUserImpl(userPersistencePort);
    }

    @Bean
    public GetUserImpl getUserService(UserPersistencePort userPersistencePort){
        return new GetUserImpl(userPersistencePort);
    }

    @Bean
    public IndexUserImpl indexUserService(UserPersistencePort userPersistencePort){
        return new IndexUserImpl(userPersistencePort);
    }
}
