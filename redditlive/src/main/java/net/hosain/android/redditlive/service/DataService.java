package net.hosain.android.redditlive.service;

import net.hosain.android.redditlive.model.Thread;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataService {

    private Map<String, Thread> THREADS_MAP = new HashMap<>();

    public void updateThreadsList(List<Thread> threads) {
        clearThreads();
        for (Thread thread : threads) {
            addItem(thread);
        }
    }

    private void clearThreads() {
        THREADS_MAP.clear();
    }

    private void addItem(Thread thread) {
        THREADS_MAP.put(thread.getId(), thread);
    }

    public Thread getThreadtWithId(int id) {
        return THREADS_MAP.get(id);
    }
}
