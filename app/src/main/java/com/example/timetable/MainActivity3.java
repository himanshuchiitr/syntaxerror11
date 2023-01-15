package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
              Button M1 = (Button) findViewById(R.id.button10);
        Button M2 = (Button) findViewById(R.id.button11);
        Button M3 = (Button) findViewById(R.id.button12);
        Button M4 = (Button) findViewById(R.id.button13);
        Button M5 = (Button) findViewById(R.id.button14);
        Button M6 = (Button) findViewById(R.id.button15);
        Button M7 = (Button) findViewById(R.id.button16);
        Button M8 = (Button) findViewById(R.id.button17);
        M1.setOnClickListener(this);
        M2.setOnClickListener(this);
       M3.setOnClickListener(this);
        M4.setOnClickListener(this);
        M5.setOnClickListener(this);
        M6.setOnClickListener(this);
        M7.setOnClickListener(this);
        M8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      switch (v.getId()){
            case R.id.button10:
                Intent i = new Intent(MainActivity3.this,MainActivityM1.class);
               startActivity(i);
                break;
          case R.id.button11:
              Intent K = new Intent(MainActivity3.this,MainActivityM2.class);
              startActivity(K);
              break;
          case R.id.button12:
              Intent j = new Intent(MainActivity3.this,MainActivity4.class);
              startActivity(j);
              break;
          case R.id.button13:
              Intent l = new Intent(MainActivity3.this,MainActivityM4.class);
              startActivity(l);
              break;
          case R.id.button14:
              Intent m = new Intent(MainActivity3.this,MainActivityM5.class);
              startActivity(m);
              break;
          case R.id.button15:
              Intent n = new Intent(MainActivity3.this,MainActivityM6.class);
              startActivity(n);
              break;
          case R.id.button16:
              Intent o = new Intent(MainActivity3.this,MainActivityM7.class);
              startActivity(o);
              break;
          case R.id.button17:
              Intent p = new Intent(MainActivity3.this,MainActivityM8.class);
              startActivity(p);

       }


    }
}