package com.example.talim.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.talim.R;

public class LoginActivity extends AppCompatActivity {
    EditText mEmail, mParol;
    Button mKirish;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_login);

        initUI();
        
        String email = mEmail.getText().toString();
        String parol = mParol.getText().toString();
        preferences = getSharedPreferences(RegAcivity.NAME_SHARED, MODE_PRIVATE);
        String test = preferences.getString(RegAcivity.KEY_EMAIL, null);
        String testP = preferences.getString(RegAcivity.KEY_PAROL, null);
        Log.d("@@", "prre");
        if (email.equals(test) && parol.equals(testP)) {
            Log.d("@@", "test");
            startActivity(new Intent(LoginActivity.this, UniversityActivity.class));
        }else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    private void initUI() {
        mEmail = findViewById(R.id.editTextEmail);
        mParol = findViewById(R.id.editTextParol);
        mKirish = findViewById(R.id.btnKirish);
    }

    public void toResetPassword(View view) {
        startActivity(new Intent(LoginActivity.this, ResetPassword.class));
    }
}