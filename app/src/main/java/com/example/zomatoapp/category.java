package com.example.zomatoapp;

public class category {
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
