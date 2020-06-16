package com.gold.acer.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button button = findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent startIntent;
               startIntent = new Intent(getApplicationContext(),Activity_B.class);
               startActivity(startIntent);
           }
       });
       Button button1 = findViewById(R.id.button1);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent startIntent;
               startIntent = new Intent(getApplicationContext(),Activity_C.class);
               startActivity(startIntent);
           }
       });
    }

       }






