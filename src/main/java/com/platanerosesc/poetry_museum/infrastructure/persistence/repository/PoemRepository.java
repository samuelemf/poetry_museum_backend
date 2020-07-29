package com.platanerosesc.poetry_museum.infrastructure.persistence.repository;

import com.platanerosesc.poetry_museum.infrastructure.persistence.entity.PoemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoemRepository extends CrudRepository<PoemEntity, Long> {
}
