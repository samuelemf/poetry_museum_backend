package com.platanerosesc.poetry_museum.infrastructure.rest.server;

import com.platanerosesc.poetry_museum.application.user.create.CreateUserService;
import com.platanerosesc.poetry_museum.application.user.delete.DeleteUserService;
import com.platanerosesc.poetry_museum.application.user.get.GetUserService;
import com.platanerosesc.poetry_museum.application.user.index.IndexUserService;
import com.platanerosesc.poetry_museum.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/user")
public class UserController {

    private @Autowired CreateUserService createUserService;
    private @Autowired GetUserService getUserService;
    private @Autowired DeleteUserService deleteUserService;
    private @Autowired IndexUserService indexUserService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody User user){
        createUserService.execute(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@RequestBody User user){
        deleteUserService.execute(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<User> get(@PathVariable int id){
        try {
            return new ResponseEntity<>(getUserService.execute(id), HttpStatus.FOUND);
        } catch (NoSuchElementException ex){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> index(){
        return new ResponseEntity<>(indexUserService.execute(), HttpStatus.OK);
    }
}
