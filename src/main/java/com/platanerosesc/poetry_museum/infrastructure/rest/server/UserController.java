package com.platanerosesc.poetry_museum.infrastructure.rest.server;

import com.platanerosesc.poetry_museum.domain.user.User;
import com.platanerosesc.poetry_museum.application.user.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final CreateUserService createUserService;

    @Autowired
    public UserController(CreateUserService createUserService){
        this.createUserService = createUserService;
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody User user){
        createUserService.execute(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
