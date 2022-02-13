package com.mtlckr.manifestcar.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.mtlckr.manifestcar.MainActivity;
import com.mtlckr.manifestcar.R;

import java.util.ArrayList;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder> {
    private ArrayList<MainItem> mainItems;

    public MainRecyclerAdapter(ArrayList<MainItem> mainItems) {
        this.mainItems = mainItems;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_menu_items,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
    holder.textMain.setText(mainItems.get(position).getText());
    holder.imageMain.setImageResource(mainItems.get(position).getImage());

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /*
            Intent intent = new Intent(holder.itemView.getContext(), MainActivity.class);
            intent.putExtra("textMainR",mainItems.get(position));
            holder.itemView.getContext().startActivity(intent);
            */

        }
    });
    }

    @Override
    public int getItemCount() {
        return mainItems.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView textMain;
        ShapeableImageView imageMain;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMain = itemView.findViewById(R.id.imageView_mainPicture);
            textMain = itemView.findViewById(R.id.recyclerViewTextImage);
        }
    }

}

