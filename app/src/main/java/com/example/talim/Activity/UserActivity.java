package com.example.talim.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.talim.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class UserActivity extends AppCompatActivity {
    TextView mTextView3, mTextView4, mTextView5;
    SharedPreferences mPreferences;
    BottomNavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_user);

        mTextView3 = findViewById(R.id.textView3);
        mTextView4 = findViewById(R.id.textView4);
        mTextView5 = findViewById(R.id.textView5);

        mPreferences = getSharedPreferences(RegAcivity.NAME_SHARED, MODE_PRIVATE);

        String ism = mPreferences.getString(RegAcivity.KEY_ISM, "");
        String familiya = mPreferences.getString(RegAcivity.KEY_FAMILIYA, "");
        String tel = mPreferences.getString(RegAcivity.KEY_TELNUMMER, "");

        mTextView3.setText("Ism: "+ism.toString());
        mTextView4.setText("Familiya: "+familiya.toString());
        mTextView5.setText("Email: "+tel.toString());

        mNavigationView = findViewById(R.id.bottom_nav_u);
        mNavigationView.setSelectedItemId(R.id.user);
        mNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.univercity:
                        startActivity(new Intent(getApplicationContext(), UniversityActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.yangiliklar:
                        startActivity(new Intent(getApplicationContext(), YangilikActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.obuna:
                        startActivity(new Intent(getApplicationContext(), ObunaActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.user:
                        return true;
                }
                return true;
            }
        });


    }
}