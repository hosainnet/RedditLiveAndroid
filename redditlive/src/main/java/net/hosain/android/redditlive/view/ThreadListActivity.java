package net.hosain.android.redditlive.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import net.hosain.android.redditlive.R;
import net.hosain.android.redditlive.controller.IndexActivityController;
import net.hosain.android.redditlive.di.InjectHelper;
import net.hosain.android.redditlive.dummy.DummyContent;
import net.hosain.android.redditlive.model.Thread;

import java.util.List;

import javax.inject.Inject;

public class ThreadListActivity extends AppCompatActivity {

    @Inject
    IndexActivityController indexActivityController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_list);
        InjectHelper.getRootComponent().inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        View recyclerView = findViewById(R.id.thread_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

        indexActivityController.requestThreads(this);

    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new ThreadListAdapter(DummyContent.ITEMS));
    }

    public void onThreadsReceived(List<Thread> threads) {
        Log.i("ThreadListActivity", "onThreadsReceived: " + threads.size());
    }
}
