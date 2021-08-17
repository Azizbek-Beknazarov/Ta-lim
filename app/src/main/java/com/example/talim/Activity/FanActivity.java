package com.example.talim.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.talim.Adapter.FanAdapter;
import com.example.talim.Model.FanDB;
import com.example.talim.Model.FanDao;
import com.example.talim.Model.FanData;
import com.example.talim.R;

import java.util.ArrayList;
import java.util.List;

public class FanActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    FanAdapter adapter;
    List<FanData> mFanlarData;
    EditText mSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_fan);

        mFanlarData = new ArrayList<>();
        mFanlarData.add(new FanData("", "Temir yo'llar", R.drawable.temir));
        mFanlarData.add(new FanData("", "Avtomobil yo'llari", R.drawable.avto1));
        mFanlarData.add(new FanData("", "Aviatsiya", R.drawable.aviat));
        mFanlarData.add(new FanData("", "Rus tili", R.drawable.rus));
        mFanlarData.add(new FanData("", "Ingliz tili", R.drawable.english));
        mFanlarData.add(new FanData("", "Astronomiya", R.drawable.astro));
        mFanlarData.add(new FanData("", "Biologiya", R.drawable.biol));


        setFanlarRecycler(mFanlarData);


        mSearch = findViewById(R.id.izlash_f);
        mSearch.addTextChangedListener(new TextWatcher() {
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
        List<FanData> filteredList = new ArrayList<>();
        for (FanData item : mFanlarData) {
            if (item.getFan_nomi().toLowerCase().contains(s.toLowerCase())) {
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }


    private void setFanlarRecycler(List<FanData> fanlarData) {
        mRecyclerView = findViewById(R.id.rec_fan);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        adapter = new FanAdapter(getApplicationContext(), fanlarData);
        mRecyclerView.setAdapter(adapter);
    }
}