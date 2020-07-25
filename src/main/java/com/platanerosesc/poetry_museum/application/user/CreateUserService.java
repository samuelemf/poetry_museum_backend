package com.platanerosesc.poetry_museum.application.user;

import com.platanerosesc.poetry_museum.domain.user.User;

public interface CreateUserService {
    void execute(User user);
}
