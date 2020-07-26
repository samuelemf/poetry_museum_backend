package com.platanerosesc.poetry_museum.application.poem.create;

import com.platanerosesc.poetry_museum.domain.poem.Poem;

public interface CreatePoemService {
    void execute(Poem poem);
}
