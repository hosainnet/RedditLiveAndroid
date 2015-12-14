package net.hosain.android.redditlive.model;

import com.google.gson.annotations.SerializedName;

public class ThreadList {

    @SerializedName("kind")
    private String kind;
    @SerializedName("data")
    private ThreadListData threadListData;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setThreadListData(ThreadListData threadListData) {
        this.threadListData = threadListData;
    }

    public String getKind() {
        return kind;
    }

    public ThreadListData getThreadListData() {
        return threadListData;
    }
}
