package com.platanerosesc.poetry_museum.domain.poem;

import com.platanerosesc.poetry_museum.domain.user.User;

import java.time.LocalTime;
import java.util.Objects;

public class Poem {
    private long id;
    private User poet;
    private String title;
    private String content;
    private LocalTime createdDate;
    private LocalTime updatedDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getPoet() {
        return poet;
    }

    public void setPoet(User poet) {
        this.poet = poet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poem poem = (Poem) o;
        return getId() == poem.getId() &&
                Objects.equals(getPoet(), poem.getPoet()) &&
                Objects.equals(getTitle(), poem.getTitle()) &&
                Objects.equals(getContent(), poem.getContent()) &&
                Objects.equals(getCreatedDate(), poem.getCreatedDate()) &&
                Objects.equals(getUpdatedDate(), poem.getUpdatedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPoet(), getTitle(), getContent(), getCreatedDate(), getUpdatedDate());
    }
}
