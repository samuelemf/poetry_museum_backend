package com.platanerosesc.poetry_museum.application.poem.delete;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

public class DeletePoemImpl implements DeletePoemService {

    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public DeletePoemImpl(PoemPersistencePort poemPersistencePort) {
        this.poemPersistencePort = poemPersistencePort;
    }

    @Override
    public void execute(Poem poem) {
        poemPersistencePort.delete(poem);
    }
}
