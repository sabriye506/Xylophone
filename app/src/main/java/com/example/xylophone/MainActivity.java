package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player = new MediaPlayer();
    int[]notes = new int[]{R.raw.note1, R.raw.note2,R.raw.note3,R.raw.note4,R.raw.note5,R.raw.note6,R.raw.note7};

    public void play(View view){
        int index =Integer.parseInt( view.getTag().toString());
        player = MediaPlayer.create(this, notes[index]);
        player.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}