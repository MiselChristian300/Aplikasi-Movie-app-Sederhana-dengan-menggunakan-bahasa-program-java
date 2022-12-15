package com.example.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import com.example.login.MainActivity;
import com.example.login.R;

import interfacesDesign.MainActivity2s;

public class MainActivity2 extends AppCompatActivity {
    Button prevbtn,nextbtn,skipbtn;
    TextView[] dots;
    ViewPager viewPagerAdapterSlide;
    viewPagerAdapterSlide viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screenonbord);
        prevbtn = findViewById(R.id.btn_previous);
        nextbtn = findViewById(R.id.btn_next);
        skipbtn = findViewById(R.id.buttonskip);
        prevbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = viewPagerAdapterSlide.getCurrentItem();
                if (current > 0){
                    viewPagerAdapterSlide.setCurrentItem(current-1,true);
                }

            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = viewPagerAdapterSlide.getCurrentItem();
        if (current < 2) {
            viewPagerAdapterSlide.setCurrentItem(current +1,true);
        }else {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
            }
        });
        skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        viewPagerAdapterSlide = (ViewPager) findViewById(R.id.viewPagerscontentslide);
        viewPagerAdapterSlide.setAdapter(viewPagerAdapter);
        viewPagerAdapter = new viewPagerAdapterSlide(this);
         viewPagerAdapterSlide.setAdapter(viewPagerAdapter);
    }
    ViewPager.OnPageChangeListener viewList = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    private int getitem (int i){
    return viewPagerAdapterSlide.getCurrentItem();
    }

}



