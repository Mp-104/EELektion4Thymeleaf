package com.example.EELektion4Thymeleaf.model;

public class Book {

    String name;

    public Book (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

}
