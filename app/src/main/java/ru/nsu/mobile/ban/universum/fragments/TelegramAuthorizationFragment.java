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

public class TelegramAuthorizationFragment extends Fragment {

    private MainActivity activity;

    private EditText phone;
    private EditText code;
    private TextView errorText;
    private Button addButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_telegram_authorization, container, false);

        phone = view.findViewById(R.id.telegram_phone);
        code = view.findViewById(R.id.telegram_code);
        errorText = view.findViewById(R.id.telegram_error);
        addButton = view.findViewById(R.id.telegram_add);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MainActivity) context;
    }
}
