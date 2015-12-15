package net.hosain.android.redditlive.controller;

import net.hosain.android.redditlive.model.Thread;
import net.hosain.android.redditlive.model.ThreadPostList;
import net.hosain.android.redditlive.service.DataService;
import net.hosain.android.redditlive.service.RedditApiService;
import net.hosain.android.redditlive.view.ThreadDetailFragment;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class ThreadDetailFragmentController {

    private RedditApiService redditApiService;
    private DataService dataService;

    public ThreadDetailFragmentController(RedditApiService redditApiService, DataService dataService) {

        this.redditApiService = redditApiService;
        this.dataService = dataService;
    }

    public void requestThreadPosts(Thread thread, final ThreadDetailFragment threadDetailFragment) {

        redditApiService.listThreadPosts(thread.getThreadData().getSecureMedia().getEventId()).enqueue(new Callback<ThreadPostList>() {
            @Override
            public void onResponse(Response<ThreadPostList> response, Retrofit retrofit) {
                threadDetailFragment.onThreadPostsReceived(response.body());
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }

    public Thread getThreadWithId(String string) {
        return dataService.getThreadWithId(string);
    }
}
