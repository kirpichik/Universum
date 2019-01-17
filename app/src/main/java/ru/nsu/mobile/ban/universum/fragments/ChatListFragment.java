package ru.nsu.mobile.ban.universum.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import ru.nsu.mobile.ban.universum.MainActivity;
import ru.nsu.mobile.ban.universum.R;
import ru.nsu.mobile.ban.universum.adapters.ChatListAdapter;

public class ChatListFragment extends Fragment {

    private MainActivity activity;

    private TextView selectAll;
    private TextView selectVK;
    private TextView selectTelegram;

    private RecyclerView chatsRecycleView;

    private FloatingActionButton addButton;

    private enum Select {ALL, VK, TELEGRAM};
    private Select selected = Select.ALL;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat_list, container, false);

        selectAll = view.findViewById(R.id.select_all);
        selectAll.setOnClickListener(l -> selectChats(Select.ALL));
        selectVK = view.findViewById(R.id.select_vk);
        selectVK.setOnClickListener(l -> selectChats(Select.VK));
        selectTelegram = view.findViewById(R.id.select_telegram);
        selectTelegram.setOnClickListener(l -> selectChats(Select.TELEGRAM));

        chatsRecycleView = view.findViewById(R.id.chats_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(activity);
        chatsRecycleView.setLayoutManager(manager);
        DividerItemDecoration decoration = new DividerItemDecoration(chatsRecycleView.getContext(), manager.getOrientation());
        chatsRecycleView.addItemDecoration(decoration);
        //TODO replace new String[0] to chats list
        updateChatsList(new String[0]);

        addButton = view.findViewById(R.id.addChatFloatingActionButton);
        addButton.setOnClickListener(l -> addChat());

        return  view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MainActivity) context;
    }

    private void selectChats(Select select) {
        switch (select) {
            case ALL:
                selectAll.setBackgroundColor(getResources().getColor(R.color.select_color, null));
                selectVK.setBackgroundColor(Color.TRANSPARENT);
                selectTelegram.setBackgroundColor(Color.TRANSPARENT);
                //TODO select all chats and replace new String[0]
                updateChatsList(new String[0]);
                break;
            case VK:
                selectAll.setBackgroundColor(Color.TRANSPARENT);
                selectVK.setBackgroundColor(getResources().getColor(R.color.select_color, null));
                selectTelegram.setBackgroundColor(Color.TRANSPARENT);
                //TODO select vk chats and replace new String[0]
                updateChatsList(new String[0]);
                break;
            case TELEGRAM:
                selectAll.setBackgroundColor(Color.TRANSPARENT);
                selectVK.setBackgroundColor(Color.TRANSPARENT);
                selectTelegram.setBackgroundColor(getResources().getColor(R.color.select_color, null));
                //TODO select telegram chats and replace new String[0]
                updateChatsList(new String[0]);
                break;
        }
    }

    //TODO replace String to chat class
    private void updateChatsList(String[] chats) {
        chatsRecycleView.setAdapter(new ChatListAdapter(activity, chats));
    }

    private void addChat() {
        //TODO replace null to add chats fragment
        //activity.changeFragment(null);
        Toast.makeText(activity, "Not realized :)", Toast.LENGTH_SHORT).show();
    }
}
