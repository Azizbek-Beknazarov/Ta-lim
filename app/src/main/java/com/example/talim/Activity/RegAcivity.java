package com.example.talim.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.talim.R;

public class RegAcivity extends AppCompatActivity {
    EditText mEmail, mIsm, mFamiliya, mParol, mParolTak;
    Button mRegBtn;
    SharedPreferences mPreferences;

    private static final String KEY_ISM = "ism";
    private static final String KEY_FAMILIYA = "familiya";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PAROL = "parol";
    private static final String NAME_SHARED = "parol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_reg_acivity);

        initUI();
        mPreferences = getSharedPreferences(NAME_SHARED, MODE_PRIVATE);
        String test = mPreferences.getString(KEY_EMAIL, null);
        if (test != null) {
            Intent intent = new Intent(RegAcivity.this, UniversityActivity.class);
            startActivity(intent);
            finish();
        }


        mRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkInfo();
                SharedPreferences.Editor editor = mPreferences.edit();
                String ism = mIsm.getText().toString();
                String familiya = mFamiliya.getText().toString();
                String parol = mParol.getText().toString();
                String parolTak = mParolTak.getText().toString();
                String email = mEmail.getText().toString();

                if (parol.equals(parolTak)
                        && parol.length() >= 4
                        && TextUtils.isEmpty(email)
                        && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    editor.putString(KEY_EMAIL, email);
                    editor.putString(KEY_ISM, ism);
                    editor.putString(KEY_FAMILIYA, familiya);
                    editor.putString(KEY_PAROL, parol);
                    editor.apply();

                    startActivity(new Intent(RegAcivity.this, LoginActivity.class));
                    finish();
                }


            }
        });

    }

    private void checkInfo() {

        if (istext(mIsm)) {
            mIsm.setError("Ismingizni kiriting!");
        }
        if (istext(mFamiliya)) {
            mFamiliya.setError("Familiyangizni kiriting!");
        }
        if (ispassword(mParol)==false) {
            mParol.setError("Parolni kiriting!");
        }
        if (ispassword(mParolTak)==false) {
            mParolTak.setError("Parollar mos emas!");
        }
        if (isemail(mEmail)==false) {
            mEmail.setError("Emailingizni kiriting!");
        }

    }

    private boolean isemail(EditText editText) {
        CharSequence line = editText.getText().toString();
        return !TextUtils.isEmpty(line) && Patterns.EMAIL_ADDRESS.matcher(line).matches();
    }

    private boolean istext(EditText editText) {
        CharSequence line = editText.getText().toString();
        return TextUtils.isEmpty(line);
    }

    private boolean ispassword(EditText editText) {
        CharSequence line = editText.getText().toString();
        return !TextUtils.isEmpty(line) && line.length() >=4;
    }

    private void initUI() {
        mEmail = findViewById(R.id.editTextEmail);
        mIsm = findViewById(R.id.editTextIsm);
        mFamiliya = findViewById(R.id.editTextFamiliya);
        mParol = findViewById(R.id.editTextParol);
        mParolTak = findViewById(R.id.editTextParolTak);
        mRegBtn = findViewById(R.id.btnReg);


    }

    public void toLogin(View view) {
        Intent intent = new Intent(RegAcivity.this, LoginActivity.class);
        startActivity(intent);
    }
}