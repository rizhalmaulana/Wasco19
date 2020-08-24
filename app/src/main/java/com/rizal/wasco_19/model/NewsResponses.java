package com.rizal.wasco_19.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NewsResponses {
    @SerializedName("articles")
    private ArrayList<News> results;

    public NewsResponses(ArrayList<News> results) {
        this.results = results;
    }

    @SerializedName("totalResults")
    public ArrayList<News> getResults() {
        return results;
    }
}
