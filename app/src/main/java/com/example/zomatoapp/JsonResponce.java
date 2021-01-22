package com.example.zomatoapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface JsonResponce {

    @Headers("user-key:e9b9f345c2eee611f3bad906b178bb41")
    @GET("/api/v2.1/categories")
    Call<Data> getData();
}
