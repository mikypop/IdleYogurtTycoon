package com.example.idleyogurttycoon;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class Perk extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.perk);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8), (int)(height*0.6));

        final Fruit fruit = (Fruit)getApplicationContext();
        final Button btn = fruit.getBtn_perk();
        final ProgressBar progbar = fruit.getProgbar();

        Button btn_perk_1 = (Button)findViewById(R.id.btn_perk_1);
        btn_perk_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_double_idle_gain(fruit.getPerk_double_idle_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });

        Button btn_perk_2 = (Button)findViewById(R.id.btn_perk_2);
        btn_perk_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_double_click_gain(fruit.getPerk_double_click_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });

        Button btn_perk_30 = (Button)findViewById(R.id.btn_perk_30);
        btn_perk_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_strawberry_idle_gain(fruit.getPerk_strawberry_idle_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });

        Button btn_perk_31 = (Button)findViewById(R.id.btn_perk_31);
        btn_perk_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_strawberry_click_gain(fruit.getPerk_strawberry_click_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });

        Button btn_perk_40 = (Button)findViewById(R.id.btn_perk_40);
        btn_perk_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_blueberry_idle_gain(fruit.getPerk_blueberry_idle_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });

        Button btn_perk_41 = (Button)findViewById(R.id.btn_perk_41);
        btn_perk_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_blueberry_click_gain(fruit.getPerk_blueberry_click_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });

        Button btn_perk_50 = (Button)findViewById(R.id.btn_perk_50);
        btn_perk_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_banana_idle_gain(fruit.getPerk_banana_idle_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });

        Button btn_perk_51 = (Button)findViewById(R.id.btn_perk_51);
        btn_perk_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setPerk_banana_click_gain(fruit.getPerk_banana_click_gain() + 1);
                btn.setVisibility(View.INVISIBLE);
                progbar.setProgress(0);
                finish();
            }
        });
    }
}
