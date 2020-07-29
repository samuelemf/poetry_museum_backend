package com.platanerosesc.poetry_museum.application.user;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllUsersService {

    private final UserPersistencePort userPersistencePort;

    @Autowired
    public GetAllUsersService(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    public List<User> execute() {
        return userPersistencePort.index();
    }
}
