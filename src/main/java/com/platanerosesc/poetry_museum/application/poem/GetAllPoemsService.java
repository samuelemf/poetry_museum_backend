package com.platanerosesc.poetry_museum.application.poem;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllPoemsService {
    private final PoemPersistencePort poemPersistencePort;

    @Autowired
    public GetAllPoemsService(PoemPersistencePort poemPersistencePort){
        this.poemPersistencePort = poemPersistencePort;
    }

    public List<Poem> execute() {
        return poemPersistencePort.getAllPoems();
    }
}
