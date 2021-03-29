package com.example.idleyogurttycoon;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActionBarDrawerToggle abdt;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Fruit fruit = (Fruit)getApplicationContext();
        final ProgressBar progbar1 = (ProgressBar)findViewById(R.id.progbar1);

        fruit.setPerk_double_idle_gain(0);
        fruit.setPerk_double_click_gain(0);
        fruit.setPerk_strawberry_idle_gain(0);
        fruit.setPerk_strawberry_click_gain(0);
        fruit.setPerk_blueberry_idle_gain(0);
        fruit.setPerk_blueberry_click_gain(0);
        fruit.setPerk_banana_idle_gain(0);
        fruit.setPerk_banana_click_gain(0);

        fruit.setProgbar(progbar1); //progbar1
        fruit.setProgbar_iterate_chance(1);  // Between 0 and 1

        fruit.setUniversal_idle(0);
        fruit.setUniversal_iterate(0);
        fruit.setUniversal_cost_1(100);
        fruit.setUniversal_cost_2(100);
        fruit.setUniversal_cost_3(100);
        fruit.setUniversal_factor_1(2);
        fruit.setUniversal_factor_2(2);
        fruit.setUniversal_factor_3(2);

        fruit.setStrawberry(0);
        fruit.setStrawberry_idle(0);
        fruit.setStrawberry_iterate(1);
        fruit.setStrawberry_cost_1(10);
        fruit.setStrawberry_cost_2(10);
        fruit.setStrawberry_factor_1(2);
        fruit.setStrawberry_factor_2(2);
        fruit.setStrawberry_tv((TextView)findViewById(R.id.text_strawberry));

        fruit.setBlueberry(0);
        fruit.setBlueberry_idle(0);
        fruit.setBlueberry_iterate(1);
        fruit.setBlueberry_cost_1(10);
        fruit.setBlueberry_cost_2(10);
        fruit.setBlueberry_factor_1(2);
        fruit.setBlueberry_factor_2(2);
        fruit.setBlueberry_tv((TextView)findViewById(R.id.text_blueberry));

        fruit.setBanana(0);
        fruit.setBanana_idle(0);
        fruit.setBanana_iterate(1);
        fruit.setBanana_cost_1(10);
        fruit.setBanana_cost_2(10);
        fruit.setBanana_factor_1(2);
        fruit.setBanana_factor_2(2);
        fruit.setBanana_tv((TextView)findViewById(R.id.text_banana));

        ///////////// ITERATOR BUTTONS /////////////

        Button btn_strawberry = (Button)findViewById(R.id.btn_strawberry);
        btn_strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setStrawberry((int) (fruit.getStrawberry() + (fruit.getStrawberry_iterate() + fruit.getUniversal_iterate()) * Math.pow(6,fruit.getPerk_strawberry_click_gain()) * Math.pow(2,fruit.getPerk_double_click_gain())));
                TextView text_strawberry = fruit.getStrawberry_tv();
                text_strawberry.setText(fruit.getStrawberry() + "");

                Random rand = new Random();
                double rand_double = rand.nextDouble();
                if(rand_double < fruit.getProgbar_iterate_chance()){
                    progbar1.incrementProgressBy(1);
                    checkProgBar(progbar1);
                }
            }
        });

        Button btn_blueberry = (Button)findViewById(R.id.btn_blueberry);
        btn_blueberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setBlueberry((int) (fruit.getBlueberry() + (fruit.getBlueberry_iterate() + fruit.getUniversal_iterate())*Math.pow(6,fruit.getPerk_blueberry_click_gain()) * Math.pow(2,fruit.getPerk_double_click_gain())));
                TextView text_blueberry = fruit.getBlueberry_tv();
                text_blueberry.setText(fruit.getBlueberry() + "");

                Random rand = new Random();
                double rand_double = rand.nextDouble();
                if(rand_double < fruit.getProgbar_iterate_chance()){
                    progbar1.incrementProgressBy(1);
                    checkProgBar(progbar1);
                }
            }
        });

        Button btn_banana = (Button)findViewById(R.id.btn_banana);
        btn_banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruit.setBanana((int) (fruit.getBanana() + (fruit.getBanana_iterate() + fruit.getUniversal_iterate())*Math.pow(6,fruit.getPerk_banana_click_gain()) * Math.pow(2,fruit.getPerk_double_click_gain())));
                TextView text_banana = fruit.getBanana_tv();
                text_banana.setText(fruit.getBanana() + "");

                Random rand = new Random();
                double rand_double = rand.nextDouble();
                if(rand_double < fruit.getProgbar_iterate_chance()){
                    progbar1.incrementProgressBy(1);
                    checkProgBar(progbar1);
                }
            }
        });

        ///////////// ITERATOR BUTTONS /////////////

        ////////////// STORE BUTTONS //////////////

        Button btn_strawberry_store = (Button)findViewById(R.id.btn_strawberry_store);
        btn_strawberry_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), activity_strawberry_store.class);
                startActivity(startIntent);
            }
        });

        Button btn_blueberry_store = (Button)findViewById(R.id.btn_blueberry_store);
        btn_blueberry_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), activity_blueberry_store.class);
                startActivity(startIntent);
            }
        });

        Button btn_banana_store = (Button)findViewById(R.id.btn_banana_store);
        btn_banana_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), activity_banana_store.class);
                startActivity(startIntent);
            }
        });

        Button btn_universal_store = (Button)findViewById(R.id.btn_universal_store);
        btn_universal_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), activity_universal_store.class);
                startActivity(startIntent);
            }
        });

        Button btn_perk = (Button)findViewById(R.id.btn_perk);
        fruit.setBtn_perk(btn_perk);
        btn_perk.setText("ADD PERK");
        btn_perk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Perk.class));
            }
        });

        ////////////// IDLE GAIN //////////////
        final double[] tempStrawberry = {0};
        final double[] tempBlueberry = {0};
        final double[] tempBanana = {0};

        final Handler idle_gain = new Handler();
        idle_gain.postDelayed(new Runnable() {
            @Override
            public void run() {
                tempStrawberry[0] = fruit.getStrawberry() + fruit.getStrawberry_fraction() + ((fruit.getStrawberry_idle() + fruit.getUniversal_idle()) * Math.pow(6,fruit.getPerk_strawberry_idle_gain()) * Math.pow(2,fruit.getPerk_double_idle_gain())) / 50;
                fruit.setStrawberry_fraction(tempStrawberry[0] - (int)tempStrawberry[0]);
                fruit.setStrawberry((int) tempStrawberry[0]);
                TextView text_strawberry = fruit.getStrawberry_tv();
                text_strawberry.setText(fruit.getStrawberry() + "");

                tempBlueberry[0] = fruit.getBlueberry() + fruit.getBlueberry_fraction() + ((fruit.getBlueberry_idle() + fruit.getUniversal_idle()) * Math.pow(6,fruit.getPerk_blueberry_idle_gain()) * Math.pow(2,fruit.getPerk_double_idle_gain())) / 50;
                fruit.setBlueberry_fraction((tempBlueberry[0] - (int)tempBlueberry[0]));
                fruit.setBlueberry((int) tempBlueberry[0]);
                TextView text_blueberry = fruit.getBlueberry_tv();
                text_blueberry.setText(fruit.getBlueberry() + "");

                tempBanana[0] = fruit.getBanana() + fruit.getBanana_fraction() + ((fruit.getBanana_idle() + fruit.getUniversal_idle()) * Math.pow(6,fruit.getPerk_banana_idle_gain()) * Math.pow(2,fruit.getPerk_double_idle_gain())) / 50;
                fruit.setBanana_fraction((tempBanana[0] - (int)tempBanana[0]));
                fruit.setBanana((int) tempBanana[0]);
                TextView text_banana = fruit.getBanana_tv();
                text_banana.setText(fruit.getBanana() + "");

                idle_gain.postDelayed(this, 10);
            }
        }, 10);

        ////////////// IDLE GAIN //////////////
        ////////////// NAVIGATION BAR //////////////

        DrawerLayout dl = (DrawerLayout)findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.menu_settings){
                    Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.menu_achievements){
                    Toast.makeText(MainActivity.this, "achievements", Toast.LENGTH_SHORT).show();
                }
                else if(id == R.id.menu_specialization){
                    Toast.makeText(MainActivity.this, "specialization", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        ////////////// NAVIGATION BAR //////////////

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    public void showToast(View v, String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    public void checkProgBar(ProgressBar progbar){
        int prog = progbar.getProgress();
        if(prog == 100){
            Button btn = (Button)findViewById(R.id.btn_perk);
            btn.setVisibility(View.VISIBLE);
        }
    }

}
