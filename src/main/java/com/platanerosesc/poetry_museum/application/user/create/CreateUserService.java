package com.platanerosesc.poetry_museum.application.user.create;

import com.platanerosesc.poetry_museum.domain.user.User;

public interface CreateUserService {
    void execute(User user);
}
