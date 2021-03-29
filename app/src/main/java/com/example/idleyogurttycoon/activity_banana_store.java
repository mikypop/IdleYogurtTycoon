package com.example.idleyogurttycoon;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_banana_store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana_store);

        final Fruit banana = (Fruit)getApplicationContext();
        final TextView text_banana_store_amount = (TextView)findViewById(R.id.text_banana_store_amount);
        final TextView text_banana_store_10 = (TextView)findViewById(R.id.text_banana_store_10);
        final TextView text_banana_store_11 = (TextView)findViewById(R.id.text_banana_store_11);
        final TextView text_banana_store_20 = (TextView)findViewById(R.id.text_banana_store_20);
        final TextView text_banana_store_21 = (TextView)findViewById(R.id.text_banana_store_21);
        final Button btn_banana_store_1 = (Button)findViewById(R.id.btn_banana_store_1);
        final Button btn_banana_store_2 = (Button)findViewById(R.id.btn_banana_store_2);

        final Handler handler = new Handler();
        final int delay = 10;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text_banana_store_amount.setText("Banana Yogurts:\n" + banana.getBanana());
                handler.postDelayed(this, delay);
            }
        }, delay);


        // Row 1
        text_banana_store_11.setText("currently:\n" + banana.getBanana_iterate() + "+" + banana.getUniversal_iterate());
        text_banana_store_10.setText("Increase per click by 1");
        btn_banana_store_1.setText("Costs: "+ banana.getBanana_cost_1());

        // Row 2
        text_banana_store_21.setText("currently:\n" + banana.getBanana_idle() + "+" + banana.getUniversal_idle());
        text_banana_store_20.setText("Increase idle gain by 1");
        btn_banana_store_2.setText("Costs: "+ banana.getBanana_cost_2());

        btn_banana_store_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(banana.getBanana() >= banana.getBanana_cost_1()){
                    banana.setBanana(banana.getBanana() - banana.getBanana_cost_1());
                    banana.setBanana_cost_1(banana.getBanana_cost_1() * banana.getBanana_factor_1());
                    banana.setBanana_iterate(banana.getBanana_iterate() + 1);
                    btn_banana_store_1.setText("Costs: "+ banana.getBanana_cost_1());
                    text_banana_store_11.setText("currently:\n" + banana.getBanana_iterate() + "+" + banana.getUniversal_iterate());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });

        btn_banana_store_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(banana.getBanana() >= banana.getBanana_cost_2()){
                    banana.setBanana(banana.getBanana() - banana.getBanana_cost_2());
                    banana.setBanana_cost_2(banana.getBanana_cost_2() * banana.getBanana_factor_1());
                    banana.setBanana_idle(banana.getBanana_idle() + 1);
                    btn_banana_store_2.setText("Costs: "+ banana.getBanana_cost_2());
                    text_banana_store_21.setText("currently:\n" + banana.getBanana_idle() + "+" + banana.getUniversal_idle());
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
