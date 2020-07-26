package com.platanerosesc.poetry_museum.infrastructure.rest.server;

import com.platanerosesc.poetry_museum.application.poem.create.CreatePoemService;
import com.platanerosesc.poetry_museum.application.poem.delete.DeletePoemService;
import com.platanerosesc.poetry_museum.application.poem.get.GetPoemService;
import com.platanerosesc.poetry_museum.application.poem.index.IndexPoemService;
import com.platanerosesc.poetry_museum.domain.poem.Poem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poem")
public class PoemController {

    private @Autowired CreatePoemService createPoemService;
    private @Autowired DeletePoemService deletePoemService;
    private @Autowired GetPoemService getPoemService;
    private @Autowired IndexPoemService indexPoemService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Poem poem){
        createPoemService.execute(poem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Poem poem){
        deletePoemService.execute(poem);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Poem> get(@PathVariable long id){
        return new ResponseEntity<>(getPoemService.execute(id), HttpStatus.FOUND);
    }


    @GetMapping
    public ResponseEntity<List<Poem>> index(){
        return new ResponseEntity<>(indexPoemService.execute(), HttpStatus.OK);
    }
}
