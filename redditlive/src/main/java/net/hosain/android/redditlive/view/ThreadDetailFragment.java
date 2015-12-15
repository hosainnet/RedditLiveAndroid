package net.hosain.android.redditlive.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.hosain.android.redditlive.R;
import net.hosain.android.redditlive.di.InjectHelper;
import net.hosain.android.redditlive.model.Thread;
import net.hosain.android.redditlive.service.DataService;

import javax.inject.Inject;

public class ThreadDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private Thread mItem;

    @Inject
    DataService dataService;

    public ThreadDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectHelper.getRootComponent().inject(this);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = dataService.getThreadWithId(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getThreadData().getTitle());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.thread_detail, container, false);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.thread_detail)).setText(mItem.getThreadData().getTitle());
        }

        return rootView;
    }
}
