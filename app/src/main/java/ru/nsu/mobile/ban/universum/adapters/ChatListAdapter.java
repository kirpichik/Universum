package ru.nsu.mobile.ban.universum.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import ru.nsu.mobile.ban.universum.MainActivity;
import ru.nsu.mobile.ban.universum.R;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.ChatHolder> {

    private MainActivity activity;
    //TODO replace String to chat class
    private String[] chats;

    public ChatListAdapter(MainActivity activity, String[] chats) {
        this.activity = activity;
        this.chats = chats;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout layout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.chat_view, viewGroup, false);
        return new ChatHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder chatHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ChatHolder extends RecyclerView.ViewHolder {
        public ChatHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
