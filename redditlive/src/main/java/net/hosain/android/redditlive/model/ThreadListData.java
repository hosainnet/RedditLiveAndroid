package net.hosain.android.redditlive.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThreadListData {

    @SerializedName("children")
    private List<Thread> threads;

    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }

    public List<Thread> getThreads() {
        return threads;
    }
}