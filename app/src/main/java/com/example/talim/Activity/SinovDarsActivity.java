package com.example.talim.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.talim.Adapter.VideoAdapter;
import com.example.talim.R;
import com.example.talim.Util.YouTubeVideos;

import java.util.Vector;

public class SinovDarsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinov_dars);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String fan = getIntent().getStringExtra("uqituvchi");
        switch (fan) {
            case "Temir yo'llar":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XjwF-STGtfE\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FVP2hJQmc1c\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i7yTCcHukkk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/LpNHC9o8fEU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zcikLQZI5wQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Avtomobil yo'llari":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ftuEgPnlsYQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BgZaz5b4JRk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yZ8w_WEMbEU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4x-RCwv0_vI\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C3JAY9rmaLc\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Aviatsiya":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hueKtbqVbZA\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IejjPFgvcB4\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i2m6bOH8bJQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0lm9HdMGBss\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WiADDbeFanU\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Rus tili":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gpOivY8gWg4\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CRvCaEsM41k\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7F5bZgQYGDg\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Y7pI8hPKjIU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BAhb2xN5qVQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Ingliz tili":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CE9Zp8PgfoU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QFC2C0c12L0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sS1LIjDJLf4\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CfwfJvHtVNA\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kMi8mHjJxrg\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Astronomiya":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/0rHUDWjR5gg\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/AQ5vty8f9Xc\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PRgua7xceDA\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KlWpFLfLFBI\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/b22HKFMIfWo\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Biologiya":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/d2vW_CHWqo4\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/R05mdtSFFWc\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/d-7oeYjwJsU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/x_136Lk_XPg\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/MRkOThS7l44\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;

        }
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
    }
}