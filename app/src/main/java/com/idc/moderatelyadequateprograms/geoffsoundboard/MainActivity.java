package com.idc.moderatelyadequateprograms.geoffsoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = findViewById(R.id.message);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.wave);
        /*
        Sound events
         */
        final MediaPlayer goodMorningSound = MediaPlayer.create(this, R.raw.good_morning);
        final MediaPlayer welcomeToCs125Sound = MediaPlayer.create(this, R.raw.welcome_to_cs125);
        final MediaPlayer myNameIsGeoffITeachSound = MediaPlayer.create(this, R.raw.my_name_is_geoff_iteach);

        final Button goodMorning = (Button) this.findViewById(R.id.goodMorning);
        final Button welcomeToCs125 = (Button) this.findViewById(R.id.welcomeToCs125);
        final Button myNameIsGeoffChallen = (Button) this.findViewById(R.id.myNameIsGeoffChallen);

        goodMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goodMorningSound.start();
            }
        });
        welcomeToCs125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeToCs125Sound.start();
            }
        });
        myNameIsGeoffChallen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myNameIsGeoffITeachSound.start();
            }
        });
        
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WaveActivity.class));
            }
        });
    }





}
