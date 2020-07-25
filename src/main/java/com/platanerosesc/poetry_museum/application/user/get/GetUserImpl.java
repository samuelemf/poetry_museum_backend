package com.platanerosesc.poetry_museum.application.user.get;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

public class GetUserImpl implements GetUserService {

    private final UserPersistencePort userPersistencePort;

    @Autowired
    public GetUserImpl(UserPersistencePort userPersistencePort){
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public User execute(int userId) {
        return userPersistencePort.get(userId);
    }
}
