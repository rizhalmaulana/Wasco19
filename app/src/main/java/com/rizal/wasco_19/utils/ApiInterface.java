package com.rizal.wasco_19.utils;

import com.rizal.wasco_19.model.NewsResponses;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("v2/top-headlines?country=id")
    Call<NewsResponses> getNewsNow(@Query("apiKey")String apiKey);
}
