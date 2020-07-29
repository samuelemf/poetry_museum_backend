package com.platanerosesc.poetry_museum.infrastructure.persistence.repository;

import com.platanerosesc.poetry_museum.infrastructure.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
