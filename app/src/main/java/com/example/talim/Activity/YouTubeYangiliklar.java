package com.example.talim.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.talim.Adapter.VideoAdapter;
import com.example.talim.R;
import com.example.talim.Util.YouTubeVideos;

import java.util.Vector;

public class YouTubeYangiliklar extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube_yangiliklar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewY);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String youtube = getIntent().getStringExtra("uqituvchi");
        switch (youtube) {
            case "MFaktor":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M3e5gf5DjLQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8L3G6x9H9qk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5oWhFEKV78s\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Osmondagi Bolalar":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JqE2Jdo-BJU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rfzCxzKJGV0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qDH9J-EFnQk\" frameborder=\"0\" allowfullscreen></iframe>"));
                 break;
            case "Patronlar Ligasi":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ESnO8ruIdiQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3OaTbfXE6ic\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/p4sVR0AM03o\" frameborder=\"0\" allowfullscreen></iframe>"));
               break;
            case "PDP Academy":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M3SeWX_Hj6Y\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IaLTxFwyYcY\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ig7VFkg7St4\" frameborder=\"0\" allowfullscreen></iframe>"));
                 break;
            case "Kadirov Dev":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5aZvC0ZQudk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/36bD4CbAbxk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ouBcNZuSRH0\" frameborder=\"0\" allowfullscreen></iframe>"));
                 break;
            case "Sariq Dev":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yVBVhgjtbx0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/b6w9lS-OkPo\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HyMNcdZ1Psk\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Davronbek Turdiyev":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hpXIHKcyoGM\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QzWm_7kNk9s\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ObnHjfzEYvY\" frameborder=\"0\" allowfullscreen></iframe>"));
               break;
        }
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

    }
}