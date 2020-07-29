package com.platanerosesc.poetry_museum.application.poem;

import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePoemService {

    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public DeletePoemService(PoemPersistencePort poemPersistencePort) {
        this.poemPersistencePort = poemPersistencePort;
    }

    public void execute(long id) {
        poemPersistencePort.delete(id);
    }
}
