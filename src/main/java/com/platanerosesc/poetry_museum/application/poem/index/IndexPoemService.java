package com.platanerosesc.poetry_museum.application.poem.index;

import com.platanerosesc.poetry_museum.domain.poem.Poem;

import java.util.List;

public interface IndexPoemService {
    List<Poem> execute();
}
