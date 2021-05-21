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

        setupUI();

        mFanlarData = new ArrayList<>();
        mFanlarData.add(new FanData("Ona tili", "Anvar Narzullayev", R.drawable.ona));
        mFanlarData.add(new FanData("Matematika", "Shaxzod", R.drawable.math));
        mFanlarData.add(new FanData("Fizika", "Murod", R.drawable.fizika));
        mFanlarData.add(new FanData("Kimyo", "Javohir", R.drawable.kimyo));
        mFanlarData.add(new FanData("Biologiya", "Malika", R.drawable.biologiya));
        mFanlarData.add(new FanData("Astronomiya", "Abror", R.drawable.astronomiya));
        mFanlarData.add(new FanData("Geografiya", "Ozoda", R.drawable.geo));
        mFanlarData.add(new FanData("Tarix", "Otabek", R.drawable.terix));

        setFanlarRecycler(mFanlarData);

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


    private void setupUI() {
        mSearch = findViewById(R.id.izlash_f);
    }

    private void setFanlarRecycler(List<FanData> fanlarData) {
        mRecyclerView = findViewById(R.id.rec_fan);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        adapter = new FanAdapter(getApplicationContext(), fanlarData);
        mRecyclerView.setAdapter(adapter);
    }
}