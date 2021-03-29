package com.example.idleyogurttycoon;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_universal_store extends AppCompatActivity {

    int strawberry = 0;
    int blueberry = 0;
    int banana = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universal_store);

        final Fruit fruit = (Fruit)getApplicationContext();
        final TextView text_universal_store_amount1 = (TextView)findViewById(R.id.text_universal_store_amount1);
        final TextView text_universal_store_amount2 = (TextView)findViewById(R.id.text_universal_store_amount2);
        final TextView text_universal_store_amount3 = (TextView)findViewById(R.id.text_universal_store_amount3);

        final Handler handler = new Handler();
        final int delay = 10;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text_universal_store_amount1.setText("Strawberry Yogurt:\n" + fruit.getStrawberry());
                text_universal_store_amount2.setText("Blueberry Yogurt:\n" + fruit.getBlueberry());
                text_universal_store_amount3.setText("Banana Yogurt:\n" + fruit.getBanana());
                handler.postDelayed(this, delay);
            }
        }, delay);

        final TextView text_universal_store_10 = (TextView)findViewById(R.id.text_universal_store_10);
        final TextView text_universal_store_11 = (TextView)findViewById(R.id.text_universal_store_11);
        final TextView text_universal_store_20 = (TextView)findViewById(R.id.text_universal_store_20);
        final TextView text_universal_store_21 = (TextView)findViewById(R.id.text_universal_store_21);
        final TextView text_universal_store_30 = (TextView)findViewById(R.id.text_universal_store_30);
        final TextView text_universal_store_31 = (TextView)findViewById(R.id.text_universal_store_31);

        text_universal_store_10.setText("Increase per click of all yogurts by 1");
        text_universal_store_11.setText("Currently:\n+" + fruit.getUniversal_iterate());
        text_universal_store_20.setText("Increase idle gain of all yogurts by 1");
        text_universal_store_21.setText("Currently:\n+" + fruit.getUniversal_idle());
        text_universal_store_30.setText("Increase progress bar increase chance by 1%");
        text_universal_store_31.setText("Currently:\n" + fruit.getProgbar_iterate_chance() * 100 + "%");

        final Button btn_universal_store_1 = (Button)findViewById(R.id.btn_universal_store_1);
        btn_universal_store_1.setText("Costs: " + fruit.getUniversal_cost_1());
        btn_universal_store_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fruit.getStrawberry() >= fruit.getUniversal_cost_1() && fruit.getBlueberry() >= fruit.getUniversal_cost_1() && fruit.getBanana() >= fruit.getUniversal_cost_1()){
                    fruit.setStrawberry(fruit.getStrawberry() - fruit.getUniversal_cost_1());
                    fruit.setBlueberry(fruit.getBlueberry() - fruit.getUniversal_cost_1());
                    fruit.setBanana(fruit.getBanana() - fruit.getUniversal_cost_1());
                    fruit.setUniversal_cost_1(fruit.getUniversal_cost_1() * fruit.getUniversal_factor_1());
                    fruit.setUniversal_iterate(fruit.getUniversal_iterate() + 1);
                    btn_universal_store_1.setText("Costs: " + fruit.getUniversal_cost_1());
                    text_universal_store_11.setText("Currently: +" + fruit.getUniversal_iterate());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });

        final Button btn_universal_store_2 = (Button)findViewById(R.id.btn_universal_store_2);
        btn_universal_store_2.setText("Costs: " + fruit.getUniversal_cost_2());
        btn_universal_store_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fruit.getStrawberry() >= fruit.getUniversal_cost_2() && fruit.getBlueberry() >= fruit.getUniversal_cost_2() && fruit.getBanana() >= fruit.getUniversal_cost_2()){
                    fruit.setStrawberry(fruit.getStrawberry() - fruit.getUniversal_cost_2());
                    fruit.setBlueberry(fruit.getBlueberry() - fruit.getUniversal_cost_2());
                    fruit.setBanana(fruit.getBanana() - fruit.getUniversal_cost_2());
                    fruit.setUniversal_cost_2(fruit.getUniversal_cost_2() * fruit.getUniversal_factor_2());
                    fruit.setUniversal_idle(fruit.getUniversal_idle() + 1);
                    btn_universal_store_2.setText("Costs: " + fruit.getUniversal_cost_2());
                    text_universal_store_21.setText("Currently: +" + fruit.getUniversal_idle());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });

        final Button btn_universal_store_3 = (Button)findViewById(R.id.btn_universal_store_3);
        btn_universal_store_3.setText("Costs: " + fruit.getUniversal_cost_3());
        btn_universal_store_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fruit.getStrawberry() >= fruit.getUniversal_cost_3() && fruit.getBlueberry() >= fruit.getUniversal_cost_3() && fruit.getBanana() >= fruit.getUniversal_cost_3()){
                    fruit.setStrawberry(fruit.getStrawberry() - fruit.getUniversal_cost_3());
                    fruit.setBlueberry(fruit.getBlueberry() - fruit.getUniversal_cost_3());
                    fruit.setBanana(fruit.getBanana() - fruit.getUniversal_cost_3());
                    fruit.setUniversal_cost_3(fruit.getUniversal_cost_3() * fruit.getUniversal_factor_3());
                    fruit.setProgbar_iterate_chance(fruit.getProgbar_iterate_chance() + 0.005);
                    btn_universal_store_3.setText("Costs: " + fruit.getUniversal_cost_3());
                    text_universal_store_31.setText("Currently: +" + fruit.getProgbar_iterate_chance());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });
    }

    public void showToast(View v, String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
