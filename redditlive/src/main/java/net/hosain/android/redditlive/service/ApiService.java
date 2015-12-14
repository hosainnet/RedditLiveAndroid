package net.hosain.android.redditlive.service;

import net.hosain.android.redditlive.model.ThreadList;

import retrofit.Call;
import retrofit.http.GET;

public interface ApiService {

    @GET("/api/live-threads.json")
    Call<ThreadList> listThreads();

}
