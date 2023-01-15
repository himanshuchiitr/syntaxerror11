package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity implements View.OnClickListener{
    Button MONDAY = (Button) findViewById(R.id.btn23);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main10);

        MONDAY.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity10.this,MainActivity5.class);
        startActivity(i);


    }
}