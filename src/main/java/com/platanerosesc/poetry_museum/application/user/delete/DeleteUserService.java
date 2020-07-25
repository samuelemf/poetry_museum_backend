package com.platanerosesc.poetry_museum.application.user.delete;

import com.platanerosesc.poetry_museum.domain.user.User;

public interface DeleteUserService {
    void execute(User user);
}
