package net.hosain.android.redditlive.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.hosain.android.redditlive.R;

import java.util.List;

import static net.hosain.android.redditlive.model.ThreadPostList.TheadPostData.LiveUpdate;

public class LiveUpdateListAdapter extends RecyclerView.Adapter<LiveUpdateListAdapter.ViewHolder> {

    private final List<LiveUpdate> posts;

    public LiveUpdateListAdapter(List<LiveUpdate> posts) {
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.live_update_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = posts.get(position);
        holder.mContentView.setText(posts.get(position).getData().getBody());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mContentView;
        public LiveUpdate mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mContentView = (TextView) view.findViewById(R.id.live_update_content_text);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}