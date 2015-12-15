package net.hosain.android.redditlive.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.hosain.android.redditlive.R;
import net.hosain.android.redditlive.controller.ThreadDetailFragmentController;
import net.hosain.android.redditlive.di.InjectHelper;
import net.hosain.android.redditlive.model.Thread;
import net.hosain.android.redditlive.model.ThreadPostList;
import net.hosain.android.redditlive.service.DataService;

import javax.inject.Inject;

import butterknife.Bind;

public class ThreadDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private Thread thread;

    @Inject
    ThreadDetailFragmentController threadDetailFragmentController;

    @Bind(R.id.thread_posts_list)
    RecyclerView threadPostsList;

    public ThreadDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectHelper.getRootComponent().inject(this);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            thread = threadDetailFragmentController.getThreadWithId(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(thread.getThreadData().getTitle());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.thread_detail, container, false);

        threadDetailFragmentController.requestThreadPosts(thread, this);

        return rootView;
    }

    public void onThreadPostsReceived(ThreadPostList posts) {
        for (ThreadPostList.TheadPostData.ThreadPost post : posts.getThreadPostData().getChildren()) {
            Log.i("ThreadDetailFragment", "onThreadPostsReceived: " + post.getData().getBody());
        }
    }
}
