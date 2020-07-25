package com.platanerosesc.poetry_museum.infrastructure.persistence.spring.adapter;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.domain.user.port.UserPersistencePort;

import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.entity.UserEntity;
import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.repository.UserRepository;
import org.springframework.beans.BeanUtils;

import java.util.List;

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
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int userId) {
        UserEntity userEntity = userRepository.findById(userId).orElse(null);
        if(userEntity == null)
            System.out.println("not found"); //TODO add error validation
        assert userEntity != null;

        User foundUser = new User();
        BeanUtils.copyProperties(userEntity, foundUser);
        return foundUser;
    }
}
