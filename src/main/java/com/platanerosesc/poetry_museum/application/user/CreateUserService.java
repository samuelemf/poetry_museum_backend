package com.platanerosesc.poetry_museum.application.user;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreateUserService {

    private final UserPersistencePort userPersistencePort;

    @Autowired
    public CreateUserService(UserPersistencePort userPersistencePort){
        this.userPersistencePort = userPersistencePort;
    }

    public void execute(User user) {
        user.setCreatedDate(LocalDate.now());
        userPersistencePort.add(user);
    }
}
