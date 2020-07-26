package com.platanerosesc.poetry_museum.application.poem.get;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

public class GetPoemImpl implements GetPoemService {

    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public GetPoemImpl(PoemPersistencePort poemPersistencePort) {
        this.poemPersistencePort = poemPersistencePort;
    }


    @Override
    public Poem execute(long id) {
        return poemPersistencePort.get(id);
    }
}
