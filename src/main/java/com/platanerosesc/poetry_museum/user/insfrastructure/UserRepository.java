package com.platanerosesc.poetry_museum.user.insfrastructure;

import com.platanerosesc.poetry_museum.user.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
