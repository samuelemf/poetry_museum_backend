package com.platanerosesc.poetry_museum.infrastructure.rest.server;

import com.platanerosesc.poetry_museum.application.poem.CreatePoemService;
import com.platanerosesc.poetry_museum.application.poem.DeletePoemService;
import com.platanerosesc.poetry_museum.application.poem.GetPoemService;
import com.platanerosesc.poetry_museum.application.poem.GetAllPoemsService;
import com.platanerosesc.poetry_museum.domain.poem.Poem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poem")
public class PoemController {

    @Autowired private CreatePoemService createPoemService;
    @Autowired private DeletePoemService deletePoemService;
    @Autowired private GetPoemService getPoemService;
    @Autowired private GetAllPoemsService getAllPoemsService;

    @PostMapping
    public void create(@RequestBody Poem poem){
        createPoemService.execute(poem);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable long id){
        deletePoemService.execute(id);
    }

    @GetMapping(path = "/{id}")
    public Poem get(@PathVariable long id){
        return getPoemService.execute(id);
    }

    @GetMapping
    public List<Poem> getAllPoems(){
        return getAllPoemsService.execute();
    }
}
