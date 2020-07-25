package com.platanerosesc.poetry_museum.infrastructure.persistence.spring.adapter;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;

import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.entity.UserEntity;
import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.repository.UserRepository;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserSpringPersistenceAdapter implements UserPersistencePort {

    private final UserRepository userRepository;

    public UserSpringPersistenceAdapter(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void add(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.save(userEntity);
    }

    @Override
    public List<User> index() {
        List<User> usersList = new ArrayList<>();
        userRepository.findAll().forEach(userEntity -> {
            User currentUser = new User();
            BeanUtils.copyProperties(userEntity, currentUser);
            usersList.add(currentUser);
        });
        return usersList;
    }

    @Override
    public void delete(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.delete(userEntity);
    }

    @Override
    public User get(int userId) {
        UserEntity userEntity = userRepository.findById(userId).orElse(null);
        if(userEntity == null)
            throw new NoSuchElementException("User not found.");

        User foundUser = new User();
        BeanUtils.copyProperties(userEntity, foundUser);
        return foundUser;
    }
}
