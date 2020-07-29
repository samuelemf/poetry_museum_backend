package com.platanerosesc.poetry_museum.infrastructure.persistence.adapter;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.infrastructure.persistence.entity.PoemEntity;
import com.platanerosesc.poetry_museum.infrastructure.persistence.entity.UserEntity;
import com.platanerosesc.poetry_museum.infrastructure.persistence.repository.PoemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
    public void delete(long id) {
        poemRepository.deleteById(id);
    }

    @Override
    public Poem get(long id) {
        PoemEntity poemEntity = poemRepository.findById(id).orElseThrow();
        return convertEntityToPoem(poemEntity);
    }

    @Override
    public List<Poem> getAllPoems() {
        List<Poem> poemList = new ArrayList<>();
        poemRepository.findAll().forEach(poemEntity -> poemList.add(convertEntityToPoem(poemEntity)));
        return poemList;
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
