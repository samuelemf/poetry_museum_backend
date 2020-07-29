package com.platanerosesc.poetry_museum.infrastructure.rest.server;

import com.platanerosesc.poetry_museum.application.user.*;
import com.platanerosesc.poetry_museum.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired private CreateUserService createUserService;
    @Autowired private GetUserService getUserService;
    @Autowired private DeleteUserService deleteUserService;
    @Autowired private GetAllUsersService getAllUsersService;

    @PostMapping
    public void create(@RequestBody User user){
        createUserService.execute(user);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable int id){
        deleteUserService.execute(id);
    }

    @GetMapping(path = "/{id}")
    public User get(@PathVariable int id){
        return getUserService.execute(id);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return getAllUsersService.execute();
    }
}
