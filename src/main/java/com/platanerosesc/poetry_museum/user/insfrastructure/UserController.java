package com.platanerosesc.poetry_museum.user.insfrastructure;

import com.platanerosesc.poetry_museum.user.domain.User;
import com.platanerosesc.poetry_museum.user.insfrastructure.create.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CreateUserService createUserService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    User get(@PathVariable Integer id){
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    User create(@RequestBody User user){
        return userRepository.save(createUserService.execute(user));
    }

}
