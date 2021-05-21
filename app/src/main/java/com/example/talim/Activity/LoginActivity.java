package com.example.talim.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
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
        mKirish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isValid = true;
                if (!isemail(mEmail)) {
                    mEmail.setError("Email xato!");
                    isValid = false;
                }else
                if (!ispassword(mParol)) {
                    mParol.setError("Parol xato!");
                    isValid = false;
                }
                if (isValid){
                    String email = mEmail.getText().toString();
                    String parol = mParol.getText().toString();
                    preferences = getSharedPreferences(RegAcivity.NAME_SHARED, MODE_PRIVATE);
                    String test = preferences.getString(RegAcivity.KEY_EMAIL, "");
                    String testP = preferences.getString(RegAcivity.KEY_PAROL, "");

                    if (email.equals(test) && parol.equals(testP)) {
                        startActivity(new Intent(LoginActivity.this, UniversityActivity.class));
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Email yoki parol xato!", Toast.LENGTH_SHORT).show();
                    }
            }
            }
        });

    }

    private void initUI() {
        mEmail = findViewById(R.id.editTextEmail);
        mParol = findViewById(R.id.editTextParol);
        mKirish = findViewById(R.id.btnKirish);
    }

    private boolean isemail(EditText editText) {
        CharSequence line = editText.getText().toString();
        return !TextUtils.isEmpty(line) && Patterns.EMAIL_ADDRESS.matcher(line).matches();
    }
    private boolean ispassword(EditText editText) {
        CharSequence line = editText.getText().toString();
        return !TextUtils.isEmpty(line) && line.length() >=4;
    }
    public void toResetPassword(View view) {
        startActivity(new Intent(LoginActivity.this, ResetPassword.class));
    }
}