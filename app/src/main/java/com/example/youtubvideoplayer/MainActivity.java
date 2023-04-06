package com.example.youtubvideoplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<youTubeVideos> youtubeVideos = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN); getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" + ".youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>") );
//        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/KyJ71G2UxTQ\" frameborder=\"0\" allowfullscreen></iframe>") );
//        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/y8Rr39jKFKU\" frameborder=\"0\" allowfullscreen></iframe>") );
//        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/8Hg1tqIwIfI\" frameborder=\"0\" allowfullscreen></iframe>") );
//        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www" +".youtube.com/embed/uhQ7mh_o_cM\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);
    }
}