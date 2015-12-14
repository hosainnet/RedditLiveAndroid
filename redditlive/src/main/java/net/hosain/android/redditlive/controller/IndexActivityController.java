package net.hosain.android.redditlive.controller;

import net.hosain.android.redditlive.model.Thread;
import net.hosain.android.redditlive.model.ThreadList;
import net.hosain.android.redditlive.service.ApiService;
import net.hosain.android.redditlive.service.DataService;
import net.hosain.android.redditlive.view.ThreadListActivity;

import java.util.List;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class IndexActivityController {

    private ApiService apiService;
    private DataService dataService;

    public IndexActivityController(ApiService apiService, DataService dataService) {
        this.apiService = apiService;
        this.dataService = dataService;
    }

    public void requestThreads(final ThreadListActivity threadListActivity) {
        apiService.listThreads().enqueue(new Callback<ThreadList>() {
            @Override
            public void onResponse(Response<ThreadList> response, Retrofit retrofit) {
                final List<Thread> threads = response.body().getThreadListData().getThreads();
                dataService.updateThreadsList(threads);
                threadListActivity.onThreadsReceived(threads);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
