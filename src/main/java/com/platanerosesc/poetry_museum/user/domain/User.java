package com.platanerosesc.poetry_museum.user.domain;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="Poet")
public class User {
    private @Id @GeneratedValue int id;
    private String username;
    private String role;
    private String email;
    private LocalDate createdDate;

    protected User(){}

    public User(String username, String role, String email){
        setUsername(username);
        setRole(role);
        setEmail(email);
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getRole(), user.getRole()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getCreatedDate(), user.getCreatedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getRole(), getEmail(), getCreatedDate());
    }
}