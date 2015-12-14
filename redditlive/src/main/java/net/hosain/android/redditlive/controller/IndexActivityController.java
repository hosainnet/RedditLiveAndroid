package net.hosain.android.redditlive.controller;

import net.hosain.android.redditlive.model.ThreadList;
import net.hosain.android.redditlive.service.ApiService;
import net.hosain.android.redditlive.view.ThreadListActivity;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class IndexActivityController {

    private ApiService apiService;

    public IndexActivityController(ApiService apiService) {
        this.apiService = apiService;
    }

    public void requestThreads(final ThreadListActivity threadListActivity) {
        apiService.listThreads().enqueue(new Callback<ThreadList>() {
            @Override
            public void onResponse(Response<ThreadList> response, Retrofit retrofit) {
                threadListActivity.onThreadsReceived(response.body().getThreadListData().getThreads());
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
