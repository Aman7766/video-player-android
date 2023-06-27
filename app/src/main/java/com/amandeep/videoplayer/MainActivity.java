package com.amandeep.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vv,v2;
MediaController mediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv=findViewById(R.id.vd);
        v2=findViewById(R.id.vd1);
        mediaController =new MediaController(this);

        //local Storage
        String video_path="android.resource://"+getPackageName()+"/"+R.raw.mountains;
        vv.setVideoPath(video_path);
        vv.start();


      //  Internet Links:

        Uri uri= Uri.parse("https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1");
        v2.setVideoURI(uri);

        mediaController.setAnchorView(v2);
        v2.setMediaController(mediaController);
        v2.start();





    }
}