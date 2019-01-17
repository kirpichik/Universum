package ru.nsu.mobile.ban.universum.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import ru.nsu.mobile.ban.universum.MainActivity;
import ru.nsu.mobile.ban.universum.R;

public class ChatFragment extends Fragment {

    private MainActivity activity;

    private RecyclerView chatRecyclerView;
    private EditText messageField;
    private ImageButton sendButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_telegram_authorization, container, false);

        chatRecyclerView = view.findViewById(R.id.chat_recycler_view);

        messageField = view.findViewById(R.id.message_field);
        sendButton = view.findViewById(R.id.send_button);
        sendButton.setOnClickListener(l -> sendMessage());

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MainActivity) context;
    }

    //TODO realize send message
    private void sendMessage() {

    }
}
