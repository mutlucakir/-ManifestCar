package com.mtlckr.manifestcar;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServiceCategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_categories);
    }

    public void PrivateServices_Main(View view)
    {
        Intent intent = new Intent(getApplicationContext(), PrivateServicesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void TechnicalServices_Main(View view)
    {
        Intent intent = new Intent(getApplicationContext(), TechnicalServicesActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }
}