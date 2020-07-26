package com.platanerosesc.poetry_museum.infrastructure.persistence.memory.adapter;

import com.platanerosesc.poetry_museum.domain.poem.Poem;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoemMemoryPersistenceAdapter implements PoemPersistencePort {

    private static final Map<Long, Poem> userMap = new HashMap<>();

    @Override
    public void add(Poem poem) {
        userMap.put(poem.getId(), poem);
    }

    @Override
    public List<Poem> index() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void delete(Poem poem) {
        userMap.remove(poem);
    }

    @Override
    public Poem get(long poemId) {
        return userMap.get(poemId);
    }
}
