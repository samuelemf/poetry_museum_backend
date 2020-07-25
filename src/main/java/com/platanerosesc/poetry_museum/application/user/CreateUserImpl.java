package com.platanerosesc.poetry_museum.application.user;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class CreateUserImpl implements CreateUserService {

    private final UserPersistencePort userPersistencePort;

    @Autowired
    public CreateUserImpl(UserPersistencePort userPersistencePort){
        this.userPersistencePort = userPersistencePort;
    }

    public void execute(User user) {
        user.setCreatedDate(LocalDate.now());
        userPersistencePort.add(user);
    }
}
