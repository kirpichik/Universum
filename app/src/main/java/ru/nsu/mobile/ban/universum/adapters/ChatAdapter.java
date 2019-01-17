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

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MessageHolder>{

    private MainActivity activity;
    //TODO replace String to message class
    private String[] chats;

    public ChatAdapter(MainActivity activity, String[] chats) {
        this.activity = activity;
        this.chats = chats;
    }

    @NonNull
    @Override
    public MessageHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout layout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.message_view, viewGroup, false);
        return new MessageHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageHolder messageHolder, int i) {
        //TODO replace all null to something ;)
        messageHolder.memberImage.setImageBitmap(null);
        messageHolder.username.setText(null);
        messageHolder.message.setText(null);

        messageHolder.itemView.setClickable(false);
    }

    @Override
    public int getItemCount() {
        return chats.length;
    }

    public static class MessageHolder extends RecyclerView.ViewHolder {
        public ImageView memberImage;
        public TextView username;
        public TextView message;

        public MessageHolder(@NonNull View itemView) {
            super(itemView);
            memberImage = itemView.findViewById(R.id.member_image);
            username = itemView.findViewById(R.id.username);
            message = itemView.findViewById(R.id.view_message_field);
        }
    }
}
