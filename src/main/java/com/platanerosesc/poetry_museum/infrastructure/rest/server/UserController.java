package com.platanerosesc.poetry_museum.infrastructure.rest.server;

import com.platanerosesc.poetry_museum.application.user.create.CreateUserService;
import com.platanerosesc.poetry_museum.application.user.get.GetUserService;
import com.platanerosesc.poetry_museum.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CreateUserService createUserService;
    @Autowired
    private GetUserService getUserService;

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody User user){
        createUserService.execute(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> get(@PathVariable int id){
        return new ResponseEntity<User>(getUserService.execute(id), HttpStatus.FOUND);
    }
}
