package com.example.talim.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.talim.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ObunaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_obuna);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_O);
        bottomNavigationView.setSelectedItemId(R.id.obuna);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.obuna: {

                        return true;

                    }
                    case R.id.univercity: {
                        startActivity(new Intent(getApplicationContext(), UniversityActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    }
                    case R.id.yangiliklar: {
                        startActivity(new Intent(getApplicationContext(), YangilikActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    }
                    case R.id.user: {
                        startActivity(new Intent(getApplicationContext(), UserActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    }

                }

                return true;
            }
        });
    }
}