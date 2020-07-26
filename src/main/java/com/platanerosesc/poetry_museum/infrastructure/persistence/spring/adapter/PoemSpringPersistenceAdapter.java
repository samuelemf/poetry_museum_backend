package com.platanerosesc.poetry_museum.infrastructure.persistence.spring.adapter;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.entity.PoemEntity;
import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.entity.UserEntity;
import com.platanerosesc.poetry_museum.infrastructure.persistence.spring.repository.PoemRepository;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PoemSpringPersistenceAdapter implements PoemPersistencePort {

    private final PoemRepository poemRepository;

    public PoemSpringPersistenceAdapter(PoemRepository poemRepository){
        this.poemRepository = poemRepository;
    }

    @Override
    public void add(Poem poem) {
        poemRepository.save(convertPoemToEntity(poem));
    }

    @Override
    public List<Poem> index() {
        List<Poem> poemList = new ArrayList<>();
        poemRepository.findAll().forEach(poemEntity -> {
            poemList.add(convertEntityToPoem(poemEntity));
        });
        return poemList;
    }

    @Override
    public void delete(Poem poem) {
        poemRepository.delete(convertPoemToEntity(poem));
    }

    @Override
    public Poem get(long id) {
        PoemEntity poemEntity = poemRepository.findById(id).orElse(null);
        if(poemEntity == null)
            throw new NoSuchElementException("User not found.");

        return convertEntityToPoem(poemEntity);
    }

    private PoemEntity convertPoemToEntity(Poem poem){
        PoemEntity poemEntity = new PoemEntity();
        BeanUtils.copyProperties(poem, poemEntity);

        if(poem.getPoet() != null) {
            UserEntity userEntity = new UserEntity();
            BeanUtils.copyProperties(poem.getPoet(), userEntity);
            poemEntity.setPoet(userEntity);
        }

        return poemEntity;
    }

    private Poem convertEntityToPoem(PoemEntity poemEntity){
        Poem poem = new Poem();
        BeanUtils.copyProperties(poemEntity, poem);

        User poet = new User();
        BeanUtils.copyProperties(poemEntity.getPoet(), poet);
        poem.setPoet(poet);

        return poem;
    }
}
