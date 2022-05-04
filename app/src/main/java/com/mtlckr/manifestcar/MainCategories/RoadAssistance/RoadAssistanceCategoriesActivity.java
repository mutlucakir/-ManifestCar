package com.mtlckr.manifestcar.MainCategories.RoadAssistance;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mtlckr.manifestcar.MainCategories.RoadAssistance.SubRoadAssistance.TowTrackCategoriesActivity;
import com.mtlckr.manifestcar.MainCategories.RoadAssistance.SubRoadAssistance.WheelerCategoriesActivity;
import com.mtlckr.manifestcar.MainCategories.RoadAssistance.SubRoadAssistance.BatteryCategoriesActivity;
import com.mtlckr.manifestcar.MainCategories.Service.SubService.PrivateServicesActivity;
import com.mtlckr.manifestcar.R;

public class RoadAssistanceCategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_assistance_categories);
    }

    public void TowTrack_Main(View view)
    {
        Intent intent = new Intent(getApplicationContext(), TowTrackCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void Wheeler_Main(View view)
    {
        Intent intent = new Intent(getApplicationContext(), WheelerCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void Battery_Main(View view)
    {
        Intent intent = new Intent(getApplicationContext(), BatteryCategoriesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }
}