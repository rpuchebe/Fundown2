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

import com.bumptech.glide.Glide;

public class Maniqui extends AppCompatActivity implements View.OnClickListener {

    private static final String msg = "LogsAndroid";
    ImageView text2;

    ImageView item1;
    ImageView item2;
    ImageView item3;

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

        text2=(ImageView)findViewById(R.id.text2);
        item1=(ImageView)findViewById(R.id.item1);
        item2=(ImageView)findViewById(R.id.item2);
        item3=(ImageView)findViewById(R.id.item3);
        startBackground();
        startItem();

        item2.setOnTouchListener(new View.OnTouchListener()

        {
            int prevX, prevY, firtsX, firtsY, temp1=0;

            @Override
            public boolean onTouch(final View v, final MotionEvent event) {
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
                        Log.d(msg, "" + par.topMargin + "," + par.leftMargin + "");

                        if (par.topMargin > -600){
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1 = 1;
                        }
                        if (par.topMargin < -400) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1 = 1;
                        }
                        if (par.leftMargin < 1000) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1 = 1;
                        }
                        if (par.leftMargin > 700) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1 = 1;
                        }
                        if(temp1==0){par.topMargin = -600;
                            par.leftMargin = 780;}


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
        });
        item1.setOnTouchListener(new View.OnTouchListener()

        {
            int prevX, prevY, firtsX, firtsY, temp1=0;

            @Override
            public boolean onTouch(final View v, final MotionEvent event) {
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
                        Log.d(msg,""+par.topMargin+","+par.leftMargin+"");

                        if (par.topMargin < -680) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if (par.topMargin > -480) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if (par.leftMargin > 1000) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if (par.leftMargin < 700) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if(temp1==0){
                            par.topMargin = -350;
                            par.leftMargin = 780;}

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
        });
        item3.setOnTouchListener(new View.OnTouchListener()

        {
            int prevX, prevY, firtsX, firtsY, temp1=0;

            @Override
            public boolean onTouch(final View v, final MotionEvent event) {
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
                        Log.d(msg,""+par.topMargin+","+par.leftMargin+"");
                        par.topMargin = -130;
                        par.leftMargin = 780;
                        if (par.topMargin < -150) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if (par.topMargin > -50) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if (par.leftMargin > 1000) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if (par.leftMargin < 700) {
                            par.topMargin = firtsX;
                            par.leftMargin = firtsY;
                            temp1=1;
                        }
                        if(temp1==0){
                            par.topMargin = -350;
                            par.leftMargin = 780;}


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
        });

    }



    private void startBackground(){

        ImageView fondo = (ImageView)findViewById(R.id.fondo);
        Glide.with(this).load(R.drawable.fondo).into(fondo);

    }
    private void startItem(){

        ImageView item1 = (ImageView)findViewById(R.id.item1);
        Glide.with(this).load(R.drawable.shorts1).into(item1);

    }

    @Override
    public void onClick(View v) {


    }

    private class ChoiceTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View v, MotionEvent event) {



            return false;
        }
    }
}