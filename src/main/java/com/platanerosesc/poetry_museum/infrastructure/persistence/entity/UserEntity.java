package com.platanerosesc.poetry_museum.infrastructure.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="POET")
public class UserEntity {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int id;
    private String username;
    private String role;
    private String email;
    private LocalDate createdDate;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}