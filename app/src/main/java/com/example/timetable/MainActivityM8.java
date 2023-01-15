package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivityM8 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_m8);
        Button MONDAY = findViewById(R.id.button8);
        Button TUESDAY =(Button) findViewById(R.id.button9);
        Button WEDNESDAY =(Button) findViewById(R.id.button18);
        Button THURSDAY =(Button) findViewById(R.id.button19);
        Button FRIDAY =(Button) findViewById(R.id.button21);

        MONDAY.setOnClickListener(this);
        TUESDAY.setOnClickListener(this);
        WEDNESDAY.setOnClickListener(this);
        THURSDAY.setOnClickListener(this);
        FRIDAY.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button8:
                Intent i = new Intent(MainActivityM8.this,MainActivity11monm8.class);
                startActivity(i);
                break;
            case R.id.button9:
                Intent J = new Intent(MainActivityM8.this,MainActivity11tuesm8.class);
                startActivity(J);
                break;
            case R.id.button18:
                Intent K = new Intent(MainActivityM8.this,MainActivity11wedm8.class);
                startActivity(K);
                break;
            case R.id.button19:
                Intent L = new Intent(MainActivityM8.this,MainActivity11thurm8.class);
                startActivity(L);
                break;
            case R.id.button21:
                Intent M = new Intent(MainActivityM8.this,MainActivity11frim8.class);
                startActivity(M);


        }
    }
}