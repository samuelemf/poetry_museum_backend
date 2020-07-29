package com.platanerosesc.poetry_museum.application.user.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(final int id){
        super("User with id:(" + id +") was not found.");
    }
}
