package com.platanerosesc.poetry_museum.application.user.index;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IndexUserImpl implements IndexUserService{

    private final UserPersistencePort userPersistencePort;
    @Autowired
    public IndexUserImpl(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public List<User> execute() {
        return userPersistencePort.index();
    }
}
