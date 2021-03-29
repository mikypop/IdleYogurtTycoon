package com.example.idleyogurttycoon;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_strawberry_store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strawberry_store);

        final Fruit strawberry = (Fruit)getApplicationContext();
        final TextView text_strawberry_store_amount = (TextView)findViewById(R.id.text_strawberry_store_amount);
        final TextView text_strawberry_store_10 = (TextView)findViewById(R.id.text_strawberry_store_10);
        final TextView text_strawberry_store_11 = (TextView)findViewById(R.id.text_strawberry_store_11);
        final TextView text_strawberry_store_20 = (TextView)findViewById(R.id.text_strawberry_store_20);
        final TextView text_strawberry_store_21 = (TextView)findViewById(R.id.text_strawberry_store_21);
        final Button btn_strawberry_store_1 = (Button)findViewById(R.id.btn_strawberry_store_1);
        final Button btn_strawberry_store_2 = (Button)findViewById(R.id.btn_strawberry_store_2);

        final Handler handler = new Handler();
        final int delay = 10;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text_strawberry_store_amount.setText("Strawberry Yogurts:\n" + strawberry.getStrawberry());
                handler.postDelayed(this, delay);
            }
        }, delay);

        // Row 1
        text_strawberry_store_11.setText("currently:\n" + strawberry.getStrawberry_iterate() + "+" + strawberry.getUniversal_iterate());
        text_strawberry_store_10.setText("Increase per click by 1");
        btn_strawberry_store_1.setText("Costs: "+ strawberry.getStrawberry_cost_1());

        // Row 2
        text_strawberry_store_21.setText("currently:\n" + strawberry.getStrawberry_idle() + "+" + strawberry.getUniversal_idle());
        text_strawberry_store_20.setText("Increase idle gain by 1");
        btn_strawberry_store_2.setText("Costs: "+ strawberry.getStrawberry_cost_2());

        btn_strawberry_store_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strawberry.getStrawberry() >= strawberry.getStrawberry_cost_1()){
                    strawberry.setStrawberry(strawberry.getStrawberry() - strawberry.getStrawberry_cost_1());
                    strawberry.setStrawberry_cost_1(strawberry.getStrawberry_cost_1() * strawberry.getStrawberry_factor_1());
                    strawberry.setStrawberry_iterate(strawberry.getStrawberry_iterate() + 1);
                    btn_strawberry_store_1.setText("Costs: "+ strawberry.getStrawberry_cost_1());
                    text_strawberry_store_11.setText("currently:\n" + strawberry.getStrawberry_iterate() + "+" + strawberry.getUniversal_iterate());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });

        btn_strawberry_store_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strawberry.getStrawberry() >= strawberry.getStrawberry_cost_2()){
                    strawberry.setStrawberry(strawberry.getStrawberry() - strawberry.getStrawberry_cost_2());
                    strawberry.setStrawberry_cost_2(strawberry.getStrawberry_cost_2() * strawberry.getStrawberry_factor_1());
                    strawberry.setStrawberry_idle(strawberry.getStrawberry_idle() + 1);
                    btn_strawberry_store_2.setText("Costs: "+ strawberry.getStrawberry_cost_2());
                    text_strawberry_store_21.setText("currently:\n" + strawberry.getStrawberry_idle() + "+" + strawberry.getUniversal_idle());
                }
                else{
                    showToast(v, "Insufficient Yogurts");
                }
            }
        });

    }

    @Override
    public void onBackPressed(){
        Fruit strawberry = (Fruit)getApplicationContext();
        TextView text_strawberry = strawberry.getStrawberry_tv();
        text_strawberry.setText(strawberry.getStrawberry() + "");
        super.onBackPressed();
    }

    public void showToast(View v, String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
