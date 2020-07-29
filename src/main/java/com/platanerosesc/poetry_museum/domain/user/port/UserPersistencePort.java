package com.platanerosesc.poetry_museum.domain.user.port;

import com.platanerosesc.poetry_museum.domain.user.User;

import java.util.List;

public interface UserPersistencePort {

    void add(User user);

    List<User> getAllUsers();

    void delete(int id);

    User get(int id);

}
