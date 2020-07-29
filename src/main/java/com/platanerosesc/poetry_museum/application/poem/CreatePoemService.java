package com.platanerosesc.poetry_museum.application.poem;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class CreatePoemService {

    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public CreatePoemService(PoemPersistencePort poemPersistencePort){
        this.poemPersistencePort = poemPersistencePort;
    }

    public void execute(Poem poem) {
        poem.setCreatedDate(LocalTime.now());
        poem.setUpdatedDate(LocalTime.now());
        poemPersistencePort.add(poem);
    }
}
