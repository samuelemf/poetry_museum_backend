package com.platanerosesc.poetry_museum.application.poem.index;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IndexPoemImpl implements IndexPoemService {
    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public IndexPoemImpl(PoemPersistencePort poemPersistencePort){
        this.poemPersistencePort = poemPersistencePort;
    }

    @Override
    public List<Poem> execute() {
        return poemPersistencePort.index();
    }
}
