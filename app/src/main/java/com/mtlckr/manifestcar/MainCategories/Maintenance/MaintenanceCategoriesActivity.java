package com.mtlckr.manifestcar.MainCategories.Maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mtlckr.manifestcar.R;

public class MaintenanceCategoriesActivity extends AppCompatActivity {

    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance_categories);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MaintenanceCategoriesActivity.this,"FAB", Toast.LENGTH_SHORT).show();
            }
        });
    }
}