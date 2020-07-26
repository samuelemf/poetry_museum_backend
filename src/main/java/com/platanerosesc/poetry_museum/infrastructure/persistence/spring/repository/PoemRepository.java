package com.platanerosesc.poetry_museum.infrastructure.persistence.spring.repository;

import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.entity.PoemEntity;
import org.springframework.data.repository.CrudRepository;

public interface PoemRepository extends CrudRepository<PoemEntity, Long> {
}
