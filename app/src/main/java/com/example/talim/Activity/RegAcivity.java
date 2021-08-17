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

public class RegAcivity extends AppCompatActivity {
    EditText telNum, mIsm, mFamiliya;
    Button mRegBtn;
    SharedPreferences mPreferences;

    public static final String KEY_ISM = "ism";
    public static final String KEY_FAMILIYA = "familiya";
    public static final String KEY_TELNUMMER = "telnummer";
    public static final String NAME_SHARED = "shared";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_reg_acivity);

        initUI();
        mPreferences = getSharedPreferences(NAME_SHARED, MODE_PRIVATE);
        String test = mPreferences.getString(KEY_TELNUMMER, "");
        if (test != "") {
            Intent intent = new Intent(RegAcivity.this, UniversityActivity.class);
            startActivity(intent);
            finish();
        }


        mRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkInfo();

                String ism = mIsm.getText().toString();
                String familiya = mFamiliya.getText().toString();
                String telN = telNum.getText().toString();

                if (!TextUtils.isEmpty(ism) && !TextUtils.isEmpty(familiya) && !TextUtils.isEmpty(telN)) {
                    SharedPreferences.Editor editor = mPreferences.edit();

                    editor.putString(KEY_ISM, ism);
                    editor.putString(KEY_FAMILIYA, familiya);
                    editor.putString(KEY_TELNUMMER, telN);
                    editor.apply();
                    Toast.makeText(RegAcivity.this, "Muvaffaqiyatli!", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(RegAcivity.this, UniversityActivity.class));
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
        if (isTelNum(telNum)){
            telNum.setError("Telefon raqam kiriting!");
        }

    }

    private boolean istext(EditText editText) {
        CharSequence line = editText.getText().toString();
        return TextUtils.isEmpty(line);
    }

    private boolean isTelNum(EditText editText) {
        CharSequence line = editText.getText().toString();
        return TextUtils.isEmpty(line);
    }


    private void initUI() {
//        mEmail = findViewById(R.id.editTextEmail);
        mIsm = findViewById(R.id.editTextIsm);
        mFamiliya = findViewById(R.id.editTextFamiliya);
        telNum = findViewById(R.id.editTextTel);
//        mParol = findViewById(R.id.editTextParol);
//        mParolTak = findViewById(R.id.editTextParolTak);
        mRegBtn = findViewById(R.id.btnReg);


    }

}