package com.platanerosesc.poetry_museum.application.poem.get;

import com.platanerosesc.poetry_museum.domain.poem.Poem;

public interface GetPoemService {
    Poem execute(long id);
}
