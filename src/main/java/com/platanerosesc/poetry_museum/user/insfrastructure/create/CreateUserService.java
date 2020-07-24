package com.platanerosesc.poetry_museum.user.insfrastructure.create;

import com.platanerosesc.poetry_museum.user.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface CreateUserService {
    User execute(User user);
}
