package com.example.appmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media;
    SeekBar volume;

    private ImageView tela1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela1=findViewById(R.id.tela1);
        media= MediaPlayer.create(getApplicationContext(), R.raw.music1);
        volume= findViewById(R.id.seekBar);
        Glide.with(this).load("https://img.youtube.com/vi/OPf0YbXqDm0/0.jpg").into(tela1);
    }

    @Override
    protected void onResume() {
        super.onResume();
        media.start();
    }
}


