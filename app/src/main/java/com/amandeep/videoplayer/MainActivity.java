package com.amandeep.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vv;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv=findViewById(R.id.vd);
        //local Storage
        String video_path="android.resource://"+getPackageName()+"/"+R.raw.mountains;
        vv.setVideoPath(video_path);
        vv.start();
    }
}