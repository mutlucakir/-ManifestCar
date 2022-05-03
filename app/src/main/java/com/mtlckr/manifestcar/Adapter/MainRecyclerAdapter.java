package com.mtlckr.manifestcar.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.mtlckr.manifestcar.MainCategories.Failure.FailureCarsCategoriesActivity;
import com.mtlckr.manifestcar.MainCategories.Parking.ParkingCategoriesActivity;
import com.mtlckr.manifestcar.R;
import com.mtlckr.manifestcar.MainCategories.Search.SearchCategoriesActivity;
import com.mtlckr.manifestcar.MainCategories.Service.ServiceCategoriesActivity;
import com.mtlckr.manifestcar.MainCategories.Shop.ShopCategoriesActivity;

import java.util.ArrayList;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder> {
    private ArrayList<MainItem> mainItems;
    Context context;
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
    public void onBindViewHolder(@NonNull MainViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.textMain.setText(mainItems.get(position).getText());
    holder.imageMain.setImageResource(mainItems.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
/*
            Intent intent = new Intent(holder.itemView.getContext(), MainActivity.class);
            intent.putExtra("textMainR",mainItems.get(position));
            //Toast.makeText(holder.itemView.getContext(), "pos#"+position, Toast.LENGTH_SHORT).show();
            holder.itemView.getContext().startActivity(intent);
*/
                if(position == 0){  //Arıza
                    Intent intent = new Intent(holder.itemView.getContext(), FailureCarsCategoriesActivity.class);
                    holder.itemView.getContext().startActivity(intent);
                }
                else if (position == 1) {   //Servis
                    Intent intent = new Intent(holder.itemView.getContext(), ServiceCategoriesActivity.class);
                    holder.itemView.getContext().startActivity(intent);
                }
                /*else if (position == 2) {
                    Intent intent = new Intent(holder.itemView.getContext(),);
                    holder.itemView.getContext().startActivity(intent);
                }*/
                else if (position == 7) {   //Park
                    Intent intent = new Intent(holder.itemView.getContext(), ParkingCategoriesActivity.class);
                    holder.itemView.getContext().startActivity(intent);
                }
                else if (position == 9) {   //Mağaza
                    Intent intent = new Intent(holder.itemView.getContext(), ShopCategoriesActivity.class);
                    holder.itemView.getContext().startActivity(intent);
                }
                else if (position == 10) {   //Ara
                    Intent intent = new Intent(holder.itemView.getContext(), SearchCategoriesActivity.class);
                    holder.itemView.getContext().startActivity(intent);
                }
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

