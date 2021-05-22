package com.example.talim.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.talim.Model.FanDB;
import com.example.talim.Model.FanData;
import com.example.talim.R;

public class KursDetailActivity extends AppCompatActivity {
    TextView mFannomi, mUqituvchiIsmi, mIzoh, mPeople, mXabar;
    ImageView mYoqtir, mImageD;
    Button mSinov, mObuna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_kurs_detail);

        setUI();

        String fan = getIntent().getStringExtra("fan");
        String ismi = getIntent().getStringExtra("uqituvchi");
        int image = getIntent().getIntExtra("image_d", 0);

        mFannomi.setText(fan);
        mUqituvchiIsmi.setText(ismi);
        mImageD.setImageResource(image);


        mSinov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KursDetailActivity.this, SinovDarsActivity.class);
                intent.putExtra("fan",mFannomi.getText().toString());
                startActivity(intent);
            }
        });

        mObuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KursDetailActivity.this, "Obuna bo'lindi", Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void setUI() {
        mFannomi = findViewById(R.id.fannomi);
        mUqituvchiIsmi = findViewById(R.id.uqituvchiIsmi);
        mIzoh = findViewById(R.id.izoh);
        mPeople = findViewById(R.id.people);
        mXabar = findViewById(R.id.xabar);
        mYoqtir = findViewById(R.id.yoqtir1);
        mImageD = findViewById(R.id.imaga_detail);
        mSinov = findViewById(R.id.bepul);
        mObuna = findViewById(R.id.yozilish);
    }
}