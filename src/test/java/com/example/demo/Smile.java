package com.example.demo;

public class Smile {

    private String id;
    private String textSmile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTextSmile() {
        return textSmile;
    }

    public void setTextSmile(String textSmile) {
        this.textSmile = textSmile;
    }

    @Override
    public String toString() {
        return "Smile{" +
                "id='" + id + '\'' +
                ", textSmile='" + textSmile + '\'' +
                '}';
    }
}
