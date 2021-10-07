package com.kelompoksatu.kasku.service;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface APIInterface {
    @GET("/data")
    Call<List<String>> getData();
}
