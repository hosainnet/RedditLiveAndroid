package net.hosain.android.redditlive.service;

import net.hosain.android.redditlive.model.ThreadList;
import net.hosain.android.redditlive.model.ThreadPostList;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

public interface RedditApiService {

    @GET("/live/{thread}/.json")
    Call<ThreadPostList> listThreadPosts(@Path("thread") String thread);

    @GET("/live/{thread}/about.json")
    Call<ThreadList> getThreadAbout(@Path("thread") String thread);
}
