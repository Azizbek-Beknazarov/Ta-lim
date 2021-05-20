package com.example.talim.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.talim.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_login);
    }

    public void toResetPassword(View view) {
        startActivity(new Intent(LoginActivity.this,ResetPassword.class));
    }
}