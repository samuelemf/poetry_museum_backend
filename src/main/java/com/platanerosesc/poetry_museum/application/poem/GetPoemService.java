package com.platanerosesc.poetry_museum.application.poem;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetPoemService {

    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public GetPoemService(PoemPersistencePort poemPersistencePort) {
        this.poemPersistencePort = poemPersistencePort;
    }

    public Poem execute(long id) {
        return poemPersistencePort.get(id);
    }
}
