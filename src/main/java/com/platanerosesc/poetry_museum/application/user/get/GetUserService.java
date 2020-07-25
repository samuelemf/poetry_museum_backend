package com.platanerosesc.poetry_museum.application.user.get;

import com.platanerosesc.poetry_museum.domain.user.User;

public interface GetUserService {
    User execute(int userId);
}
