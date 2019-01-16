package ru.nsu.mobile.ban.universum.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ru.nsu.mobile.ban.universum.MainActivity;
import ru.nsu.mobile.ban.universum.R;

public class NetworksListAdapter extends RecyclerView.Adapter<NetworksListAdapter.NetworkHolder> {

    private MainActivity activity;
    //TODO replace String to network class
    private String[] networks;

    public NetworksListAdapter(MainActivity activity, String[] networks) {
        this.activity = activity;
        this.networks = networks;
    }

    @NonNull
    @Override
    public NetworkHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout layout = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.chat_view, viewGroup, false);
        return new NetworkHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NetworkHolder networkHolder, int i) {
        //TODO replace all null to something ;)
        networkHolder.networkImage.setImageBitmap(null);
        networkHolder.errorImage.setImageBitmap(null);
        networkHolder.networkName.setText(null);
        networkHolder.removeButton.setOnClickListener(l -> {
            //TODO realize remove
        });

        networkHolder.itemView.setClickable(false);
    }

    @Override
    public int getItemCount() {
        return networks.length;
    }

    public static class NetworkHolder extends RecyclerView.ViewHolder {
        public ImageView networkImage;
        public ImageView errorImage;
        public TextView networkName;
        public ImageButton removeButton;

        public NetworkHolder(@NonNull View itemView) {
            super(itemView);
            networkImage = itemView.findViewById(R.id.network_image);
            errorImage = itemView.findViewById(R.id.error_image);
            networkName = itemView.findViewById(R.id.network_name);
            removeButton = itemView.findViewById(R.id.remove_button);
        }
    }
}
