package com.mtlckr.manifestcar.MainCategories.Fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mtlckr.manifestcar.R;

public class FuelCategoriesActivity extends AppCompatActivity {

    FloatingActionButton fab_f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel_categories);

        fab_f = findViewById(R.id.fab_fuel);
        fab_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FuelCategoriesActivity.this,"FUEL", Toast.LENGTH_SHORT).show();
            }
        });
    }
}