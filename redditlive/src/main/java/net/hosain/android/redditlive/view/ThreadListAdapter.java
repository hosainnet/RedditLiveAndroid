package net.hosain.android.redditlive.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.hosain.android.redditlive.R;
import net.hosain.android.redditlive.model.Thread;

import java.util.List;

public class ThreadListAdapter
        extends RecyclerView.Adapter<ThreadListAdapter.ViewHolder> {

    private final List<Thread> threads;

    public ThreadListAdapter(List<Thread> items) {
        threads = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.thread_list_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = threads.get(position);
        holder.mContentView.setText(threads.get(position).getThreadData().getTitle());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, ThreadDetailActivity.class);
                intent.putExtra(ThreadDetailFragment.ARG_ITEM_ID, holder.mItem.getId());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return threads.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mContentView;
        public Thread mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}