package ru.nsu.mobile.ban.universum.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        //TODO replace all null to something ;)
        chatHolder.chatImage.setImageBitmap(null);
        chatHolder.typeImage.setImageBitmap(null);
        chatHolder.chatName.setText(null);
        chatHolder.lastMessage.setText(null);

        //TODO replace null to chat fragment
        chatHolder.itemView.setOnClickListener(l -> activity.changeFragment(null));
    }

    @Override
    public int getItemCount() {
        return chats.length;
    }

    public static class ChatHolder extends RecyclerView.ViewHolder {
        public ImageView chatImage;
        public ImageView typeImage;
        public TextView chatName;
        public TextView lastMessage;

        public ChatHolder(@NonNull View itemView) {
            super(itemView);
            chatImage = itemView.findViewById(R.id.chat_image);
            typeImage = itemView.findViewById(R.id.type_image);
            chatName = itemView.findViewById(R.id.chat_name);
            lastMessage = itemView.findViewById(R.id.last_message);
        }
    }
}
