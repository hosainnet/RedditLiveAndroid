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
import net.hosain.android.redditlive.di.InjectHelper;
import net.hosain.android.redditlive.dummy.DummyContent;
import net.hosain.android.redditlive.model.ThreadList;
import net.hosain.android.redditlive.service.ApiService;

import javax.inject.Inject;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class ThreadListActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;

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

        apiService.listThreads().enqueue(new Callback<ThreadList>() {
            @Override
            public void onResponse(Response<ThreadList> response, Retrofit retrofit) {
                Log.i("test", "onResponse: " + response.body().getThreadList().getChildren().size());
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new ThreadListAdapter(DummyContent.ITEMS));
    }

}
