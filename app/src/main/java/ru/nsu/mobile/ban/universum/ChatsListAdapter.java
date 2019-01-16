package ru.nsu.mobile.ban.universum;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ChatsListAdapter extends RecyclerView.Adapter<ChatsListAdapter.ChatsListViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ChatsListViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ChatsListViewHolder(LinearLayout v) {
            super(v);
            mTextView = v.findViewById(R.id.chat_title_item);
        }
    }

    public ChatsListAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @NonNull
    @Override
    public ChatsListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.chat_view, viewGroup, false);

        return new ChatsListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsListViewHolder holder, int pos) {
        holder.itemView.setOnClickListener(view -> Toast.makeText(view.getContext(), "Test", Toast.LENGTH_LONG).show());
        holder.mTextView.setText(mDataset[pos]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
