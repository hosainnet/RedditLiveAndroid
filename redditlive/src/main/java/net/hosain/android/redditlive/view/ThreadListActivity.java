package net.hosain.android.redditlive.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import net.hosain.android.redditlive.R;
import net.hosain.android.redditlive.controller.IndexActivityController;
import net.hosain.android.redditlive.di.InjectHelper;
import net.hosain.android.redditlive.model.Thread;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ThreadListActivity extends AppCompatActivity {

    @Inject
    IndexActivityController indexActivityController;

    @Bind(R.id.thread_list)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_list);
        InjectHelper.getRootComponent().inject(this);
        ButterKnife.bind(this);

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

        indexActivityController.requestThreads(this);

    }

    public void onThreadsReceived(List<Thread> threads) {
        recyclerView.setAdapter(new ThreadListAdapter(threads));
    }
}
