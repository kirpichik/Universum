package ru.nsu.mobile.ban.universum.fragments;

import android.content.Context;
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
import android.widget.Toast;

import ru.nsu.mobile.ban.universum.MainActivity;
import ru.nsu.mobile.ban.universum.R;
import ru.nsu.mobile.ban.universum.adapters.NetworksListAdapter;

public class NetworkListFragment extends Fragment {

    private MainActivity activity;

    private RecyclerView networksRecyclerView;
    private FloatingActionButton addButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newtworks_list, container, false);

        networksRecyclerView = view.findViewById(R.id.networks_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(activity);
        networksRecyclerView.setLayoutManager(manager);
        DividerItemDecoration decoration = new DividerItemDecoration(networksRecyclerView.getContext(), manager.getOrientation());
        networksRecyclerView.addItemDecoration(decoration);
        //TODO replace null to networks list
        updateNetworksList(null);

        addButton = view.findViewById(R.id.addNetworkFloatingActionButton);
        addButton.setOnClickListener(l -> addNetwork());

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MainActivity) context;
    }

    //TODO replace String to network class
    private void updateNetworksList(String[] networks) {
        networksRecyclerView.setAdapter(new NetworksListAdapter(activity, networks));
    }

    private void addNetwork() {
        //TODO replace null to add network fragment
        //activity.changeFragment(null);
        Toast.makeText(activity, "Not realized :)", Toast.LENGTH_SHORT).show();
    }
}
