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
import com.example.talim.Model.UnivercityData;
import com.example.talim.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class UniversityActivity extends AppCompatActivity {
    private List<UnivercityData> mList = new ArrayList<>();
    private Context mContext;
    private RecyclerView mRecyclerView;
    private UnivercityAdapter mAdapter;
    private EditText mIzlash;
    private BottomNavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_university);

        mList.add(new UnivercityData("Samarqand davlat universiteti"));
        mList.add(new UnivercityData("O’zbekiston milliy universiteti"));
        mList.add(new UnivercityData("Jahon iqtisodiyoti va diplomatiya universiteti"));
        mList.add(new UnivercityData("Toshkent davlat texnika universiteti"));
        mList.add(new UnivercityData("Toshkent davlat iqtisodiyot universiteti"));
        mList.add(new UnivercityData("O’zbekiston davlat jahon tillari universiteti"));
        mList.add(new UnivercityData("Toshkent davlat sharqshunoslik instituti"));
        mList.add(new UnivercityData("Toshkent Islom Universiteti"));
        mList.add(new UnivercityData("Toshkent davlat yuridik universiteti"));
        mList.add(new UnivercityData("Toshkent Xalqaro Westminster universitet"));

        mRecyclerView = findViewById(R.id.rec_uni);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new UnivercityAdapter(mContext, mList);
        mRecyclerView.setAdapter(mAdapter);


        mNavigationView = findViewById(R.id.bottom_nav);
        mNavigationView.setSelectedItemId(R.id.univercity);
        mNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.univercity:
                        return true;
//                    case R.id.yangiliklar:
//                        startActivity(new Intent(getApplicationContext(), ));
//                        finish();
//                    case R.id.obuna:
//                        startActivity(new Intent(getApplicationContext(), ));
//                        finish();
                }
                return false;
            }
        });


        mIzlash = findViewById(R.id.izlash);

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


    }

    private void filter(String s) {
        List<UnivercityData> filteredList = new ArrayList<>();
        for (UnivercityData item : mList) {
            if (item.getName_uni().toLowerCase().contains(s.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }
}