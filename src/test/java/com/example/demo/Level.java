package com.example.demo;

import java.util.List;

public class Level {

    private String id;
    private String name;
    private String description;
    private List<Option> nextLevel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Option> getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(List<Option> nextLevel) {
        this.nextLevel = nextLevel;
    }

    @Override
    public String toString() {
        return "Estas en el nivel " + name;
    }
}
