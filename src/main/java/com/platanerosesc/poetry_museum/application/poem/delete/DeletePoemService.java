package com.platanerosesc.poetry_museum.application.poem.delete;

import com.platanerosesc.poetry_museum.domain.poem.Poem;

public interface DeletePoemService {
    void execute(Poem poem);
}
