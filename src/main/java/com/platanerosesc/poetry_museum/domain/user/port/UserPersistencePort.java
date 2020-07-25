package com.platanerosesc.poetry_museum.domain.user.port;

import com.platanerosesc.poetry_museum.domain.user.User;

import java.util.List;

public interface UserPersistencePort {

    void add(User user);

    List<User> index();

    void delete(User user);

    User get(int userId);

}
