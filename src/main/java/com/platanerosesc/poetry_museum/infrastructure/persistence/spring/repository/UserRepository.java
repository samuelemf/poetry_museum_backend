package com.platanerosesc.poetry_museum.infrastructure.persistence.spring.repository;

import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
