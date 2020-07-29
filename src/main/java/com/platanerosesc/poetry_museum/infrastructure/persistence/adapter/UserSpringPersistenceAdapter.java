package com.platanerosesc.poetry_museum.infrastructure.persistence.adapter;

import com.platanerosesc.poetry_museum.application.user.exception.UserNotFoundException;
import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;

import com.platanerosesc.poetry_museum.infrastructure.persistence.entity.UserEntity;
import com.platanerosesc.poetry_museum.infrastructure.persistence.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        userRepository.findAll().forEach(userEntity -> {
            User currentUser = new User();
            BeanUtils.copyProperties(userEntity, currentUser);
            usersList.add(currentUser);
        });
        return usersList;
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User get(int userId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));

        User foundUser = new User();
        BeanUtils.copyProperties(userEntity, foundUser);
        return foundUser;
    }
}
