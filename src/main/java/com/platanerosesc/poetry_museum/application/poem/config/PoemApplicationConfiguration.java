package com.platanerosesc.poetry_museum.application.poem.config;

import com.platanerosesc.poetry_museum.application.poem.create.CreatePoemImpl;
import com.platanerosesc.poetry_museum.application.poem.delete.DeletePoemImpl;
import com.platanerosesc.poetry_museum.application.poem.get.GetPoemImpl;
import com.platanerosesc.poetry_museum.application.poem.index.IndexPoemImpl;
import com.platanerosesc.poetry_museum.domain.poem.port.PoemPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoemApplicationConfiguration {

    @Bean
    public CreatePoemImpl createPoemService(PoemPersistencePort poemPersistencePort){
        return new CreatePoemImpl(poemPersistencePort);
    }

    @Bean
    public DeletePoemImpl deletePoemService(PoemPersistencePort poemPersistencePort){
        return new DeletePoemImpl(poemPersistencePort);
    }

    @Bean
    public GetPoemImpl getPoemService(PoemPersistencePort poemPersistencePort){
        return new GetPoemImpl(poemPersistencePort);
    }

    @Bean
    public IndexPoemImpl indexPoemService(PoemPersistencePort poemPersistencePort){
        return new IndexPoemImpl(poemPersistencePort);
    }

}
