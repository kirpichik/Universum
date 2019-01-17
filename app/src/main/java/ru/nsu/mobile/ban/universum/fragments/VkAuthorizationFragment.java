package ru.nsu.mobile.ban.universum.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.nsu.mobile.ban.universum.MainActivity;
import ru.nsu.mobile.ban.universum.R;

public class VkAuthorizationFragment extends Fragment {

    private MainActivity activity;

    private EditText login;
    private EditText password;
    private TextView errorText;
    private Button addButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vk_authorization, container, false);

        login = view.findViewById(R.id.vk_login);
        password = view.findViewById(R.id.vk_password);
        errorText = view.findViewById(R.id.vk_error);
        addButton = view.findViewById(R.id.vk_add);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MainActivity) context;
    }
}
