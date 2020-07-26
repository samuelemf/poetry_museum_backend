package com.platanerosesc.poetry_museum.domain.poem.port;

import com.platanerosesc.poetry_museum.domain.poem.Poem;

import java.util.List;

public interface PoemPersistencePort {

    void add(Poem poem);

    List<Poem> index();

    void delete(Poem poem);

    Poem get(long userId);
}
