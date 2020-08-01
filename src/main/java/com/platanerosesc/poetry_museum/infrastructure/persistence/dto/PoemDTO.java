package com.platanerosesc.poetry_museum.infrastructure.persistence.dto;

import com.platanerosesc.poetry_museum.domain.poem.Poem;

public class PoemDTO {

    public PoemDTO(Poem poem){
        setId(poem.getId());
        setPoet(new UserDTO(poem.getPoet()));
        setTitle(poem.getTitle());
        setContent(poem.getContent());
    }

    private long id;
    private UserDTO poet;
    private String title;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDTO getPoet() {
        return poet;
    }

    public void setPoet(UserDTO poet) {
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
}
