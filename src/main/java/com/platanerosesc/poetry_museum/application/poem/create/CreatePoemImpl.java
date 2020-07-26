package com.platanerosesc.poetry_museum.application.poem.create;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;

public class CreatePoemImpl implements CreatePoemService {

    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public CreatePoemImpl(PoemPersistencePort poemPersistencePort){
        this.poemPersistencePort = poemPersistencePort;
    }

    @Override
    public void execute(Poem poem) {
        poem.setCreatedDate(LocalTime.now());
        poem.setUpdatedDate(LocalTime.now());
        poemPersistencePort.add(poem);
    }
}
