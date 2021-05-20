package com.example.talim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class FirstWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_window);

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(FirstWindow.this,RegAcivity.class);
                startActivity(intent);
                finish();
            }
        };

        new Handler().postDelayed(runnable,2000);
        finish();
    }
}