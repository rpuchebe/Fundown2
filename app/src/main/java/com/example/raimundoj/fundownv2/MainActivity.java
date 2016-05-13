package com.example.raimundoj.fundownv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import xyz.hanks.library.SmallBang;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton box;
    ImageButton maniqui;
    ImageView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Boton de ayuda", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        text1=(ImageView)findViewById(R.id.text1);
        box=(ImageButton)findViewById(R.id.box);
        box.setOnClickListener(this);
        maniqui=(ImageButton)findViewById(R.id.maniqui);
        maniqui.setOnClickListener(this);
        YoYo.with(Techniques.Flash)
                .duration(1700)
                .playOn(findViewById(R.id.box));
        YoYo.with(Techniques.Flash)
                .duration(1700)
                .playOn(findViewById(R.id.maniqui));

        YoYo.with(Techniques.Flash)
                .duration(1700)
                .delay(10000)
                .playOn(findViewById(R.id.box));
        YoYo.with(Techniques.Flash)
                .duration(1700)
                .delay(12000)
                .playOn(findViewById(R.id.maniqui));
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        startBackground();
        return true;
    }

    private void startBackground(){

        ImageView fondo = (ImageView)findViewById(R.id.fondo);
        Glide.with(this).load(R.drawable.fondo).into(fondo);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.box:
                YoYo.with(Techniques.TakingOff)
                        .duration(700)
                        .playOn(findViewById(R.id.box));
                Intent intent = new Intent(MainActivity.this, Box.class);
                startActivity(intent);

                break;
            case R.id.maniqui:
                YoYo.with(Techniques.TakingOff)
                        .duration(700)
                        .playOn(findViewById(R.id.maniqui));
                intent = new Intent(MainActivity.this, Maniqui.class);
                startActivity(intent);

                break;

        }

    }
}
