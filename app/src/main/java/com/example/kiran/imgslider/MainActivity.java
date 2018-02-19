package com.example.kiran.imgslider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewpager;
    customswipeadapter swipeadapter;//objecy of customswipeadapter class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager=(ViewPager)findViewById(R.id.viewpager);
        swipeadapter = new customswipeadapter(this);//calls constructor in customswipeadaper class
        viewpager.setAdapter(swipeadapter);
    }
}
