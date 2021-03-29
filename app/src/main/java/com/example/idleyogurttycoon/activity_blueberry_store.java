package com.example.idleyogurttycoon;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_blueberry_store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blueberry_store);

        final Fruit blueberry = (Fruit)getApplicationContext();
        final TextView text_blueberry_store_amount = (TextView)findViewById(R.id.text_blueberry_store_amount);
        final TextView text_blueberry_store_10 = (TextView)findViewById(R.id.text_blueberry_store_10);
        final TextView text_blueberry_store_11 = (TextView)findViewById(R.id.text_blueberry_store_11);
        final TextView text_blueberry_store_20 = (TextView)findViewById(R.id.text_blueberry_store_20);
        final TextView text_blueberry_store_21 = (TextView)findViewById(R.id.text_blueberry_store_21);
        final Button btn_blueberry_store_1 = (Button)findViewById(R.id.btn_blueberry_store_1);
        final Button btn_blueberry_store_2 = (Button)findViewById(R.id.btn_blueberry_store_2);

        final Handler handler = new Handler();
        final int delay = 10;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text_blueberry_store_amount.setText("Blueberry Yogurts:\n" + blueberry.getBlueberry());
                handler.postDelayed(this, delay);
            }
        }, delay);

        // Row 1
        text_blueberry_store_11.setText("currently:\n" + blueberry.getBlueberry_iterate() + "+" + blueberry.getUniversal_iterate());
        text_blueberry_store_10.setText("Increase per click by 1");
        btn_blueberry_store_1.setText("Costs: "+ blueberry.getBlueberry_cost_1());

        // Row 2
        text_blueberry_store_21.setText("currently:\n" + blueberry.getBlueberry_idle() + "+" + blueberry.getUniversal_idle());
        text_blueberry_store_20.setText("Increase idle gain by 1");
        btn_blueberry_store_2.setText("Costs: "+ blueberry.getBlueberry_cost_2());

        btn_blueberry_store_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blueberry.getBlueberry() >= blueberry.getBlueberry_cost_1()){
                    blueberry.setBlueberry(blueberry.getBlueberry() - blueberry.getBlueberry_cost_1());
                    blueberry.setBlueberry_iterate(blueberry.getBlueberry_iterate() + 1);
                    blueberry.setBlueberry_cost_1(blueberry.getBlueberry_cost_1() * blueberry.getBlueberry_factor_1());
                    btn_blueberry_store_1.setText("Costs: "+ blueberry.getBlueberry_cost_1());
                    text_blueberry_store_11.setText("currently:\n" + blueberry.getBlueberry_iterate() + "+" + blueberry.getUniversal_iterate());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });

        btn_blueberry_store_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blueberry.getBlueberry() >= blueberry.getBlueberry_cost_2()){
                    blueberry.setBlueberry(blueberry.getBlueberry() - blueberry.getBlueberry_cost_2());
                    blueberry.setBlueberry_cost_2(blueberry.getBlueberry_cost_2() * blueberry.getBlueberry_factor_1());
                    blueberry.setBlueberry_idle(blueberry.getBlueberry_idle() + 1);
                    btn_blueberry_store_2.setText("Costs: "+ blueberry.getBlueberry_cost_2());
                    text_blueberry_store_21.setText("currently:\n" + blueberry.getBlueberry_idle() + "+" + blueberry.getUniversal_idle());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });
    }

    @Override
    public void onBackPressed(){
        Fruit blueberry = (Fruit)getApplicationContext();
        TextView text_blueberry = blueberry.getBlueberry_tv();
        text_blueberry.setText(blueberry.getBlueberry() + "");
        super.onBackPressed();
    }

    public void showToast(View v, String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
