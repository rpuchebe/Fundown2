package com.example.raimundoj.fundownv2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Box extends AppCompatActivity implements View.OnClickListener {


    ImageView text2;
    ImageView item;
    ImageView item1;
    ImageView item2;
    ImageView item3;
    ImageView item4;
    ImageView item5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);
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
        item=(ImageView)findViewById(R.id.item);
        item1=(ImageView)findViewById(R.id.item1);
        item2=(ImageView)findViewById(R.id.item2);
        item3=(ImageView)findViewById(R.id.item3);
        item4=(ImageView)findViewById(R.id.item4);
        item5=(ImageView)findViewById(R.id.item5);
        startBackground();
        item.setOnTouchListener(new ChoiceTouchListener());
        item1.setOnTouchListener(new ChoiceTouchListener());
        item2.setOnTouchListener(new ChoiceTouchListener());
        item3.setOnTouchListener(new ChoiceTouchListener());
        item4.setOnTouchListener(new ChoiceTouchListener());
        item5.setOnTouchListener(new ChoiceTouchListener());

    }

    private void startBackground(){

        ImageView fondo = (ImageView)findViewById(R.id.fondo);
        Glide.with(this).load(R.drawable.fondo).into(fondo);

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
