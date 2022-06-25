package com.mtlckr.manifestcar.MainCategories.Parking;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mtlckr.manifestcar.MainCategories.Fuel.FuelCategoriesActivity;
import com.mtlckr.manifestcar.MainCategories.Service.SubService.PrivateServicesActivity;
import com.mtlckr.manifestcar.R;

public class ParkingCategoriesActivity extends AppCompatActivity {

    FloatingActionButton fab_p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_categories);

        fab_p = findViewById(R.id.fab_parking);
        fab_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(ParkingCategoriesActivity.this,"PARKING", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), AddParkingActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
            }
        });
    }
}