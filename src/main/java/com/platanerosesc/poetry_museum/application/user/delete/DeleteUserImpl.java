package com.platanerosesc.poetry_museum.application.user.delete;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteUserImpl implements DeleteUserService{

    private final UserPersistencePort userPersistencePort;
    @Autowired
    public DeleteUserImpl(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void execute(User user) {
        userPersistencePort.delete(user);
    }
}
