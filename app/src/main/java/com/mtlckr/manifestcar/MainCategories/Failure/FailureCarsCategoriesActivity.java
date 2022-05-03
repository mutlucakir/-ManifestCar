package com.mtlckr.manifestcar.MainCategories.Failure;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mtlckr.manifestcar.R;
import com.mtlckr.manifestcar.ViewPagerAdapter;

public class FailureCarsCategoriesActivity extends AppCompatActivity {

    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure_cars_categories);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);


    }

}