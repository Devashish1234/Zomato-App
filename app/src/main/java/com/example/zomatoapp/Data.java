package com.example.zomatoapp;

import java.util.Arrays;

public class Data {
    Categories []categories;
    public Categories[] getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "Data{" +
                "categories=" + Arrays.toString(categories) +
                '}';
    }
}
