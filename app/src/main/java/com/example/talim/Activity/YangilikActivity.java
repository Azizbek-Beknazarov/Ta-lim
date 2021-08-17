package com.example.talim.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import com.example.talim.Adapter.UnivercityAdapter;
import com.example.talim.Adapter.YangilikAdapter;
import com.example.talim.Model.FanData;
import com.example.talim.Model.UnivercityData;
import com.example.talim.Model.YangilikData;
import com.example.talim.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class YangilikActivity extends AppCompatActivity {
    private List<YangilikData> mList = new ArrayList<>();
    private Context mContext;
    private RecyclerView mRecyclerView;
    private EditText mIzlash;
    YangilikAdapter mAdapter;
    private BottomNavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_yangilik);

        mList.add(new YangilikData("", "MFaktor", R.drawable.mfaktor));
        mList.add(new YangilikData("", "Osmondagi Bolalar", R.drawable.osmon));
        mList.add(new YangilikData("", "Patronlar Ligasi", R.drawable.patron));
        mList.add(new YangilikData("", "PDP Academy", R.drawable.pdp));
        mList.add(new YangilikData("", "Kadirov Dev", R.drawable.kadirov));
        mList.add(new YangilikData("", "Sariq Dev", R.drawable.sariq));
        mList.add(new YangilikData("", "Davronbek Turdiyev", R.drawable.davron));


        mRecyclerView = findViewById(R.id.rec_yan);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new YangilikAdapter(mList, getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);


        mIzlash = findViewById(R.id.izlash_Y);
        mIzlash.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });


        mNavigationView = findViewById(R.id.bottom_nav_Y);
        mNavigationView.setSelectedItemId(R.id.yangiliklar);
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
                        return true;
                    case R.id.obuna:
                        startActivity(new Intent(getApplicationContext(), ObunaActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
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

    private void filter(String s) {
        List<YangilikData> filteredList = new ArrayList<>();
        for (YangilikData item : mList) {
            if (item.getFan_nomi().toLowerCase().contains(s.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }
}