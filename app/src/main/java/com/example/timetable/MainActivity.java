package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Button NEXT =(Button) findViewById(R.id.button2);
        NEXT.setOnClickListener(this);
        Button About_us =(Button) findViewById(R.id.button20);
        About_us.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button2 :
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
                break;
            case R.id.button20 :
                Intent j=new Intent(MainActivity.this,MainActivity11des.class);
                startActivity(j);

        }
    }
}