package com.mtlckr.manifestcar.MainCategories.Warning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mtlckr.manifestcar.MainCategories.Service.SubService.PrivateServicesActivity;
import com.mtlckr.manifestcar.MainCategories.Service.SubService.TechnicalServicesActivity;
import com.mtlckr.manifestcar.R;

import com.mtlckr.manifestcar.MainCategories.Warning.SubWarning.CameraDetectionActivity;
import com.mtlckr.manifestcar.MainCategories.Warning.SubWarning.UserGuideActivity;

public class WarningCategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning_categories);
    }

    public void CameraDetection_Main(View view)
    {
        Intent intent = new Intent(getApplicationContext(), CameraDetectionActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    public void UserGuide_Main(View view)
    {
        Intent intent = new Intent(getApplicationContext(), UserGuideActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }
}