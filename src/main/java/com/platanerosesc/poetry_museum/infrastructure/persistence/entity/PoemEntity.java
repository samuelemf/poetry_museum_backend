package com.platanerosesc.poetry_museum.infrastructure.persistence.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "POEM")
public class PoemEntity {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
    private @ManyToOne(fetch = FetchType.LAZY) UserEntity poet;
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

    public UserEntity getPoet() {
        return poet;
    }

    public void setPoet(UserEntity poet) {
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
}
