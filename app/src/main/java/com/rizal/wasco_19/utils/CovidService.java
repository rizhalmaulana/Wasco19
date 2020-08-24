package com.rizal.wasco_19.utils;

import com.rizal.wasco_19.model.DataIndonesia;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidService {
    @GET("indonesia")
    Call<List<DataIndonesia>> getKasus();
}
