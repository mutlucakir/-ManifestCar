package com.mtlckr.manifestcar;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mtlckr.manifestcar.Adapter.MainItem;
import com.mtlckr.manifestcar.Adapter.MainRecyclerAdapter;
import com.mtlckr.manifestcar.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MainItem> mainItems = new ArrayList<>();
    private RecyclerView recyclerView;
    private MainRecyclerAdapter mainRecyclerAdapter;


    private ActivityMainBinding binding;
    private ViewPager imageViewFailure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        */
        setContentView(R.layout.activity_main);

        fillTheArray();
        viewSettings();
        mainRecyclerAdapter.notifyDataSetChanged();
        /*
        Intent intent = getIntent();
        MainItem selectedMainItem = (MainItem) intent.getSerializableExtra("textMainR");
        */


    }



    private void fillTheArray() {
        mainItems.add(new MainItem("ARIZA",R.drawable.main_ariza));
        mainItems.add(new MainItem("SERVİS",R.drawable.main_servis));
        mainItems.add(new MainItem("BAKIM",R.drawable.main_bakim));
        mainItems.add(new MainItem("UYARI",R.drawable.main_uyari_bul));
        mainItems.add(new MainItem("BİLGİ",R.drawable.main_bilgi));
        mainItems.add(new MainItem("YOL YARDIM",R.drawable.main_yol_yardim));
        mainItems.add(new MainItem("EĞİTİCİ",R.drawable.main_egitici));
        mainItems.add(new MainItem("PARK",R.drawable.main_park_et));
        mainItems.add(new MainItem("YAKIT",R.drawable.main_yakit));
        mainItems.add(new MainItem("MAĞAZA",R.drawable.main_magaza));
        mainItems.add(new MainItem("ARA",R.drawable.main_ara));
        mainItems.add(new MainItem("ÖNERİ İSTEK",R.drawable.main_istek_oneri));
    }

    private void viewSettings() {
        recyclerView = findViewById(R.id.recyclerViewMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mainRecyclerAdapter = new MainRecyclerAdapter(mainItems);
        recyclerView.setAdapter(mainRecyclerAdapter);

    }
/*
    public void failure_Main (View view){
        Intent intent = new Intent(getApplicationContext(), FailureCarsCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
        // Toast.makeText(this, "TEST", Toast.LENGTH_SHORT).show();
    }

    public void service_Main (View view){
        Intent intent = new Intent(getApplicationContext(), ServiceCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);

    }

    public void care_Main (View view){

    }

    public void warningFind_Main (View view){

    }

    public void information_Main (View view){

    }

    public void RoadAssistance_Main (View view){
        Intent intent = new Intent(getApplicationContext(), RoadAssistanceCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void training_Main (View view){

    }

    public void parking_Main (View view){
        Intent intent = new Intent(getApplicationContext(), ParkingCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void fuel_Main (View view){

    }

    public void shop_Main (View view){
        Intent intent = new Intent(getApplicationContext(), ShopCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void search_Main (View view){
        Intent intent = new Intent(getApplicationContext(), SearchCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void advice_Main (View view){

    }
    */
}