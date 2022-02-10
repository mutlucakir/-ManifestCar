package com.mtlckr.manifestcar;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private RecyclerView rcycler_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        rcycler_main = findViewById(R.id.rcycler_main);
        rcycler_main.setHasFixedSize(true);
        rcycler_main.setLayoutManager(new LinearLayoutManager(this));

        List<MainItems> mainItemsList = new ArrayList<>();

        mainItemsList.add(new MainItems(R.drawable.ariza,"ARIZA"));
        mainItemsList.add(new MainItems(R.drawable.servis,"SERVİS"));
        mainItemsList.add(new MainItems(R.drawable.bakim,"BAKIR"));
        mainItemsList.add(new MainItems(R.drawable.uyari_bul,"UYARI BUL"));
        mainItemsList.add(new MainItems(R.drawable.servis,"SERVİS"));
        mainItemsList.add(new MainItems(R.drawable.bilgi,"BİLGİ"));
        mainItemsList.add(new MainItems(R.drawable.yol_yardim,"YOL YARDIM"));
        mainItemsList.add(new MainItems(R.drawable.servis,"SERVİS"));
        mainItemsList.add(new MainItems(R.drawable.egitici,"EĞİTİCİ"));
        mainItemsList.add(new MainItems(R.drawable.park_et,"PARK ET"));
        mainItemsList.add(new MainItems(R.drawable.servis,"SERVİS"));
        mainItemsList.add(new MainItems(R.drawable.yakit,"YAKIT"));
        mainItemsList.add(new MainItems(R.drawable.magaza,"MAĞAZA"));
        mainItemsList.add(new MainItems(R.drawable.servis,"SERVİS"));
        mainItemsList.add(new MainItems(R.drawable.ara,"ARA"));
        mainItemsList.add(new MainItems(R.drawable.istek_oneri,"ÖNERİ İSTEK"));

        rcycler_main.setAdapter(new MainAdapter(mainItemsList));
        */
    }

    public void failure_Main (View view){
        Intent intent = new Intent(getApplicationContext(), FaliureCarsCategoriesActivity.class);
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
}