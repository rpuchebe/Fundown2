package com.example.raimundoj.fundownv2;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Random;

public class Maniqui extends AppCompatActivity implements View.OnTouchListener {

    private static final String msg = "LogsAndroid";
    ImageView text2;
    ImageView item1;
    ImageView item2;
    ImageView item3;
    ImageView item4;
    ImageView item5;
    ImageView item6;
    ImageView item7;
    ImageView item8;
    ImageView item9;
    ImageView item10;
    ImageView item11;
    ImageView item12;
    ImageView item13;
    ImageView item14;
    ImageView maniqui;
    int prevX, prevY, firtsX, firtsY, temp1=0;

    private android.widget.RelativeLayout.LayoutParams layoutParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maniqui);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        item1=(ImageView)findViewById(R.id.item1);
        item2=(ImageView)findViewById(R.id.item2);
        item3=(ImageView)findViewById(R.id.item3);
        item4=(ImageView)findViewById(R.id.item4);
        item5=(ImageView)findViewById(R.id.item5);
        item6=(ImageView)findViewById(R.id.item6);
        item7=(ImageView)findViewById(R.id.item7);
        item8=(ImageView)findViewById(R.id.item8);
        item9=(ImageView)findViewById(R.id.item9);
        item10=(ImageView)findViewById(R.id.item10);
        item11=(ImageView)findViewById(R.id.item11);
        item12=(ImageView)findViewById(R.id.item12);
        item13=(ImageView)findViewById(R.id.item13);
        item14=(ImageView)findViewById(R.id.item14);
        maniqui=(ImageView)findViewById(R.id.maniqui);
        SetManiqui();
        item1.setOnTouchListener(this);
        item2.setOnTouchListener(this);
        item3.setOnTouchListener(this);
        item4.setOnTouchListener(this);
        item5.setOnTouchListener(this);
        item6.setOnTouchListener(this);
        item7.setOnTouchListener(this);
        item8.setOnTouchListener(this);
        item9.setOnTouchListener(this);
        item10.setOnTouchListener(this);
        item11.setOnTouchListener(this);
        item12.setOnTouchListener(this);
        item13.setOnTouchListener(this);
        item14.setOnTouchListener(this);

    }

    private void SetManiqui(){

        Random rand = new Random();
        int n = rand.nextInt(3);
        if(n == 0){

            maniqui.setBackgroundDrawable(getResources().getDrawable(R.drawable.maniquimw));

        }
        if(n == 1){

            maniqui.setBackgroundDrawable(getResources().getDrawable(R.drawable.maniquiwb));

        }
        if(n == 2){

            maniqui.setBackgroundDrawable(getResources().getDrawable(R.drawable.maniquiww));

        }
    }

    private RelativeLayout.LayoutParams Verificar(View v, int prevX, int prevY, int firtsX, int firtsY, int temp1, RelativeLayout.LayoutParams par, String tipo){


        if(tipo == "shirt"){

            if (par.topMargin < 450) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.topMargin > 660) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.leftMargin > 1400) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.leftMargin < 820) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if(temp1==0){
                par.topMargin = 586;
                par.leftMargin = 1068;}

        }
        if(tipo == "short"){

            if (par.topMargin < 770) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.topMargin > 880) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.leftMargin > 1400) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.leftMargin < 820) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if(temp1==0){
                par.topMargin = 835;
                par.leftMargin = 1163;}
        }
        if(tipo == "shoes"){

            if (par.topMargin < 900) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.topMargin > 1200) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.leftMargin > 1400) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if (par.leftMargin < 820) {par.topMargin = firtsX;par.leftMargin = firtsY;temp1=1;}
            if(temp1==0){
                par.topMargin = 1063;
                par.leftMargin = 1140;}
        }
        return par;
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {

        final RelativeLayout.LayoutParams par = (RelativeLayout.LayoutParams) v.getLayoutParams();
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE: {
                par.topMargin += (int) event.getRawY() - prevY;
                prevY = (int) event.getRawY();
                par.leftMargin += (int) event.getRawX() - prevX;
                prevX = (int) event.getRawX();
                v.setLayoutParams(par);
                return true;
            }
            case MotionEvent.ACTION_UP: {
                par.topMargin += (int) event.getRawY() - prevY;
                par.leftMargin += (int) event.getRawX() - prevX;
                if(v == item1 || v==item4 || v==item7 || v == item10 || v==item12 || v==item11){
                    Verificar(v, prevX, prevY, firtsX, firtsY, 0, par, "shirt");

                }
                if(v == item2 || v==item5 || v==item6 ) {

                    Verificar(v, prevX, prevY, firtsX, firtsY, 0, par, "shoes");

                }
                if(v == item3 || v==item8 || v == item9 || v==item13 || v==item14 ) {

                    Verificar(v, prevX, prevY, firtsX, firtsY, 0, par, "short");

                }

                v.setLayoutParams(par);
                return true;
            }
            case MotionEvent.ACTION_DOWN: {
                firtsX = par.topMargin;
                firtsY = par.leftMargin;
                prevX = (int) event.getRawX();
                prevY = (int) event.getRawY();
                par.bottomMargin = -2 * v.getHeight();
                par.rightMargin = -2 * v.getWidth();
                v.setLayoutParams(par);
                return true;
            }
        }

        return false;
    }

}