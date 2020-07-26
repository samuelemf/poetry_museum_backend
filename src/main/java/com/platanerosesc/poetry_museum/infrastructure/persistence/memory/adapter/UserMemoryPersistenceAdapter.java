package com.platanerosesc.poetry_museum.infrastructure.persistence.memory.adapter;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryPersistenceAdapter implements UserPersistencePort {

    private static final Map<Integer, User> userMap = new HashMap<>();

    @Override
    public void add(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public List<User> index() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void delete(User user) {
        userMap.remove(user);
    }

    @Override
    public User get(int userId) {
        return userMap.get(userId);
    }
}
