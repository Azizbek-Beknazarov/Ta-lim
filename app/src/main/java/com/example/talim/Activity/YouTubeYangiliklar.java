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
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8Os1lGK2XME\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sqNB2BWXkrc\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Osmondagi Bolalar":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JqE2Jdo-BJU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rfzCxzKJGV0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qDH9J-EFnQk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Mp681yIt9Qw\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DOuh1VQ3k4A\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Patronlar Ligasi":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ESnO8ruIdiQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3OaTbfXE6ic\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/p4sVR0AM03o\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/dNJf4_5TmXU\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gVt39sNTeWA\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "PDP Academy":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M3SeWX_Hj6Y\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IaLTxFwyYcY\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ig7VFkg7St4\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/EeXIHFOfdIQ\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rdic-55ktIA\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Kadirov Dev":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5aZvC0ZQudk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/36bD4CbAbxk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ouBcNZuSRH0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n2EfOLbbxng\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/52YCfymQpAM\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Sariq Dev":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yVBVhgjtbx0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/b6w9lS-OkPo\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HyMNcdZ1Psk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tbj0IVVY_x4\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rbsgXA6nO4o\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Davronbek Turdiyev":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hpXIHKcyoGM\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QzWm_7kNk9s\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ObnHjfzEYvY\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/S4LUswgH2cY\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2G9YyM06EnA\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Farkhod Dadajanov":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/04ctiDAcU0c\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qJgWNRUKOAg\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XzE3dRHrTZ0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/OlZn-l_gCCM\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HnbP6NiEBDY\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Umidjon Ishmukhamedov":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/msIqs4ICdPs\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vYBavUQSaQw\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hBEhc_WU97o\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aEAya-uXhiA\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bscYKicXKqU\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Bobir Akilkhanov":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tPoyi2g_11g\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FvfVcGpoTBs\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/82AJGsN0fs0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xkGoVKxAr74\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XKENiKZwnuI\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
            case "Abdukarim Mirzayev":
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5PMRU2m-rbA\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FCOcIK3LYvY\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Gj5asz0FzD0\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Dd0K_GUuknk\" frameborder=\"0\" allowfullscreen></iframe>"));
                youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/j__fXjgbtAk\" frameborder=\"0\" allowfullscreen></iframe>"));
                break;
        }
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

    }
}