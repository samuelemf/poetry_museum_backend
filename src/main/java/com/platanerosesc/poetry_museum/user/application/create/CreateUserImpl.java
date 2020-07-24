package com.platanerosesc.poetry_museum.user.application.create;

import com.platanerosesc.poetry_museum.user.domain.User;
import com.platanerosesc.poetry_museum.user.insfrastructure.create.CreateUserService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreateUserImpl implements CreateUserService {

    @Override
    public User execute(User user) {
        user.setCreatedDate(LocalDate.now());
        return user;
    }
}