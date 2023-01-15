package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        Button CIVIL_ENGINEERING = (Button) findViewById(R.id.button);
        Button MECHANICAL_ENGINEERING = (Button) findViewById(R.id.button3);
        Button CSE = (Button) findViewById(R.id.button4);
        Button DSAI = (Button) findViewById(R.id.button5);
        Button CHEMICAL_ENGINEERING = (Button) findViewById(R.id.button7);
        Button METALLURGY = (Button) findViewById(R.id.button6);

        METALLURGY.setOnClickListener(this);
        CIVIL_ENGINEERING.setOnClickListener(this);
        CSE.setOnClickListener(this);
        DSAI.setOnClickListener(this);
        CHEMICAL_ENGINEERING.setOnClickListener(this);
        MECHANICAL_ENGINEERING.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
                break;
            default:
                Toast.makeText(this, "hold up!!! it will be soon available", Toast.LENGTH_SHORT).show();

        }

    }
}