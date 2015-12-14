package net.hosain.android.redditlive.model;

import com.google.gson.annotations.SerializedName;

public class ThreadList {

    @SerializedName("kind")
    private String kind;
    @SerializedName("data")
    private Thread threadList;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setThreadList(Thread threadList) {
        this.threadList = threadList;
    }

    public String getKind() {
        return kind;
    }

    public Thread getThreadList() {
        return threadList;
    }
}
