package com.platanerosesc.poetry_museum.infrastructure.persistence.dto;

import com.platanerosesc.poetry_museum.domain.user.User;

public class UserDTO {

    public UserDTO(User user){
        setId(user.getId());
        setUsername(user.getUsername());
    }

    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
