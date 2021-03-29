package com.example.idleyogurttycoon;

import android.app.Application;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Fruit extends Application {

    private int perk_double_idle_gain;
    private int perk_double_click_gain;
    private int perk_strawberry_idle_gain;
    private int perk_strawberry_click_gain;
    private int perk_blueberry_idle_gain;
    private int perk_blueberry_click_gain;
    private int perk_banana_idle_gain;
    private int perk_banana_click_gain;

    private ProgressBar progbar;
    private double progbar_iterate_chance;
    private Button btn_perk;

    private int universal_idle;
    private int universal_iterate;
    private int universal_cost_1;
    private int universal_cost_2;
    private int universal_cost_3;
    private int universal_factor_1;
    private int universal_factor_2;
    private int universal_factor_3;

    private int strawberry_cost_1;
    private int strawberry_cost_2;
    private int strawberry_factor_1;
    private int strawberry_factor_2;
    private int strawberry;
    private double strawberry_fraction;
    private int strawberry_iterate;
    private int strawberry_idle;
    private TextView strawberry_tv;
    private TextView strawberry_tv_store;

    private int blueberry_cost_1;
    private int blueberry_cost_2;
    private int blueberry_factor_1;
    private int blueberry_factor_2;
    private int blueberry;
    private double blueberry_fraction;
    private int blueberry_iterate;
    private int blueberry_idle;
    private TextView blueberry_tv;
    private TextView blueberry_tv_store;

    private int banana_cost_1;
    private int banana_cost_2;
    private int banana_factor_1;
    private int banana_factor_2;
    private int banana;
    private double banana_fraction;
    private int banana_iterate;
    private int banana_idle;
    private TextView banana_tv;
    private TextView banana_tv_store;

    public ProgressBar getProgbar() {
        return progbar;
    }

    public void setProgbar(ProgressBar progbar) {
        this.progbar = progbar;
    }

    public Button getBtn_perk() {
        return btn_perk;
    }

    public void setBtn_perk(Button btn_perk) {
        this.btn_perk = btn_perk;
    }

    public double getStrawberry_fraction() {
        return strawberry_fraction;
    }

    public void setStrawberry_fraction(double strawberry_fraction) {
        this.strawberry_fraction = strawberry_fraction;
    }

    public double getBlueberry_fraction() {
        return blueberry_fraction;
    }

    public void setBlueberry_fraction(double blueberry_fraction) {
        this.blueberry_fraction = blueberry_fraction;
    }

    public double getBanana_fraction() {
        return banana_fraction;
    }

    public void setBanana_fraction(double banana_fraction) {
        this.banana_fraction = banana_fraction;
    }

    public int getPerk_double_idle_gain() {
        return perk_double_idle_gain;
    }

    public void setPerk_double_idle_gain(int perk_double_idle_gain) {
        this.perk_double_idle_gain = perk_double_idle_gain;
    }

    public int getPerk_double_click_gain() {
        return perk_double_click_gain;
    }

    public void setPerk_double_click_gain(int perk_double_click_gain) {
        this.perk_double_click_gain = perk_double_click_gain;
    }

    public int getPerk_strawberry_idle_gain() {
        return perk_strawberry_idle_gain;
    }

    public void setPerk_strawberry_idle_gain(int perk_strawberry_idle_gain) {
        this.perk_strawberry_idle_gain = perk_strawberry_idle_gain;
    }

    public int getPerk_strawberry_click_gain() {
        return perk_strawberry_click_gain;
    }

    public void setPerk_strawberry_click_gain(int perk_strawberry_click_gain) {
        this.perk_strawberry_click_gain = perk_strawberry_click_gain;
    }

    public int getPerk_blueberry_idle_gain() {
        return perk_blueberry_idle_gain;
    }

    public void setPerk_blueberry_idle_gain(int perk_blueberry_idle_gain) {
        this.perk_blueberry_idle_gain = perk_blueberry_idle_gain;
    }

    public int getPerk_blueberry_click_gain() {
        return perk_blueberry_click_gain;
    }

    public void setPerk_blueberry_click_gain(int perk_blueberry_click_gain) {
        this.perk_blueberry_click_gain = perk_blueberry_click_gain;
    }

    public int getPerk_banana_idle_gain() {
        return perk_banana_idle_gain;
    }

    public void setPerk_banana_idle_gain(int perk_banana_idle_gain) {
        this.perk_banana_idle_gain = perk_banana_idle_gain;
    }

    public int getPerk_banana_click_gain() {
        return perk_banana_click_gain;
    }

    public void setPerk_banana_click_gain(int perk_banana_click_gain) {
        this.perk_banana_click_gain = perk_banana_click_gain;
    }

    public int getUniversal_cost_3() {
        return universal_cost_3;
    }

    public void setUniversal_cost_3(int universal_cost_3) {
        this.universal_cost_3 = universal_cost_3;
    }

    public int getUniversal_factor_3() {
        return universal_factor_3;
    }

    public void setUniversal_factor_3(int universal_factor_3) {
        this.universal_factor_3 = universal_factor_3;
    }

    public double getProgbar_iterate_chance() {
        return progbar_iterate_chance;
    }

    public void setProgbar_iterate_chance(double progbar_iterate_chance) {
        this.progbar_iterate_chance = progbar_iterate_chance;
    }

    public int getUniversal_cost_1() {
        return universal_cost_1;
    }

    public void setUniversal_cost_1(int universal_cost_1) {
        this.universal_cost_1 = universal_cost_1;
    }

    public int getUniversal_cost_2() {
        return universal_cost_2;
    }

    public void setUniversal_cost_2(int universal_cost_2) {
        this.universal_cost_2 = universal_cost_2;
    }

    public int getUniversal_factor_1() {
        return universal_factor_1;
    }

    public void setUniversal_factor_1(int universal_factor_1) {
        this.universal_factor_1 = universal_factor_1;
    }

    public int getUniversal_factor_2() {
        return universal_factor_2;
    }

    public void setUniversal_factor_2(int universal_factor_2) {
        this.universal_factor_2 = universal_factor_2;
    }

    public int getUniversal_idle() {
        return universal_idle;
    }

    public void setUniversal_idle(int universal_idle) {
        this.universal_idle = universal_idle;
    }

    public int getUniversal_iterate() {
        return universal_iterate;
    }

    public void setUniversal_iterate(int universal_iterate) {
        this.universal_iterate = universal_iterate;
    }

    public int getStrawberry_factor_2() {
        return strawberry_factor_2;
    }

    public void setStrawberry_factor_2(int strawberry_factor_2) {
        this.strawberry_factor_2 = strawberry_factor_2;
    }

    public int getBlueberry_factor_2() {
        return blueberry_factor_2;
    }

    public void setBlueberry_factor_2(int blueberry_factor_2) {
        this.blueberry_factor_2 = blueberry_factor_2;
    }

    public int getBanana_factor_2() {
        return banana_factor_2;
    }

    public void setBanana_factor_2(int banana_factor_2) {
        this.banana_factor_2 = banana_factor_2;
    }

    public TextView getStrawberry_tv_store() {
        return strawberry_tv_store;
    }

    public void setStrawberry_tv_store(TextView strawberry_tv_store) {
        this.strawberry_tv_store = strawberry_tv_store;
    }

    public TextView getBlueberry_tv_store() {
        return blueberry_tv_store;
    }

    public void setBlueberry_tv_store(TextView blueberry_tv_store) {
        this.blueberry_tv_store = blueberry_tv_store;
    }

    public TextView getBanana_tv_store() {
        return banana_tv_store;
    }

    public void setBanana_tv_store(TextView banana_tv_store) {
        this.banana_tv_store = banana_tv_store;
    }

    public int getStrawberry_cost_2() {
        return strawberry_cost_2;
    }

    public void setStrawberry_cost_2(int strawberry_cost_2) {
        this.strawberry_cost_2 = strawberry_cost_2;
    }

    public int getBlueberry_cost_2() {
        return blueberry_cost_2;
    }

    public void setBlueberry_cost_2(int blueberry_cost_2) {
        this.blueberry_cost_2 = blueberry_cost_2;
    }

    public int getBanana_cost_2() {
        return banana_cost_2;
    }

    public void setBanana_cost_2(int banana_cost_2) {
        this.banana_cost_2 = banana_cost_2;
    }

    public int getStrawberry_idle() {
        return strawberry_idle;
    }

    public void setStrawberry_idle(int strawberry_idle) {
        this.strawberry_idle = strawberry_idle;
    }

    public int getBlueberry_idle() {
        return blueberry_idle;
    }

    public void setBlueberry_idle(int blueberry_idle) {
        this.blueberry_idle = blueberry_idle;
    }

    public int getBanana_idle() {
        return banana_idle;
    }

    public void setBanana_idle(int banana_idle) {
        this.banana_idle = banana_idle;
    }

    public TextView getStrawberry_tv() {
        return strawberry_tv;
    }

    public void setStrawberry_tv(TextView strawberry_tv) {
        this.strawberry_tv = strawberry_tv;
    }

    public TextView getBlueberry_tv() {
        return blueberry_tv;
    }

    public void setBlueberry_tv(TextView blueberry_tv) {
        this.blueberry_tv = blueberry_tv;
    }

    public TextView getBanana_tv() {
        return banana_tv;
    }

    public void setBanana_tv(TextView banana_tv) {
        this.banana_tv = banana_tv;
    }

    public int getBlueberry_cost_1() {
        return blueberry_cost_1;
    }

    public void setBlueberry_cost_1(int blueberry_cost_1) {
        this.blueberry_cost_1 = blueberry_cost_1;
    }

    public int getBlueberry_factor_1() {
        return blueberry_factor_1;
    }

    public void setBlueberry_factor_1(int blueberry_factor_1) {
        this.blueberry_factor_1 = blueberry_factor_1;
    }

    public int getBlueberry() {
        return blueberry;
    }

    public void setBlueberry(int blueberry) {
        this.blueberry = blueberry;
    }

    public int getBlueberry_iterate() {
        return blueberry_iterate;
    }

    public void setBlueberry_iterate(int blueberry_iterate) {
        this.blueberry_iterate = blueberry_iterate;
    }

    public int getBanana_cost_1() {
        return banana_cost_1;
    }

    public void setBanana_cost_1(int banana_cost_1) {
        this.banana_cost_1 = banana_cost_1;
    }

    public int getBanana_factor_1() {
        return banana_factor_1;
    }

    public void setBanana_factor_1(int banana_factor_1) {
        this.banana_factor_1 = banana_factor_1;
    }

    public int getBanana() {
        return banana;
    }

    public void setBanana(int banana) {
        this.banana = banana;
    }

    public int getBanana_iterate() {
        return banana_iterate;
    }

    public void setBanana_iterate(int banana_iterate) {
        this.banana_iterate = banana_iterate;
    }

    public int getStrawberry_cost_1() {
        return strawberry_cost_1;
    }

    public void setStrawberry_cost_1(int strawberry_cost_1) {
        this.strawberry_cost_1 = strawberry_cost_1;
    }

    public int getStrawberry_factor_1() {
        return strawberry_factor_1;
    }

    public void setStrawberry_factor_1(int strawberry_factor_1) {
        this.strawberry_factor_1 = strawberry_factor_1;
    }

    public int getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(int strawberry) {
        this.strawberry = strawberry;
    }

    public int getStrawberry_iterate() {
        return strawberry_iterate;
    }

    public void setStrawberry_iterate(int strawberry_iterate) {
        this.strawberry_iterate = strawberry_iterate;
    }
}
