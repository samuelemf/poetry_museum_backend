package com.platanerosesc.poetry_museum.application.user;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserService {

    private final UserPersistencePort userPersistencePort;

    @Autowired
    public GetUserService(UserPersistencePort userPersistencePort){
        this.userPersistencePort = userPersistencePort;
    }

    public User execute(int userId) {
        return userPersistencePort.get(userId);
    }
}
