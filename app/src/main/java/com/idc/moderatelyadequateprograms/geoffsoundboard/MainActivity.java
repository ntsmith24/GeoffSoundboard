package com.idc.moderatelyadequateprograms.geoffsoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mTextMessage = findViewById(R.id.message);
        FloatingActionButton fab =  findViewById(R.id.wave);
        /*
        Sound events
         */
        final MediaPlayer goodMorningSound = MediaPlayer.create(this, R.raw.good_morning);
        final MediaPlayer welcomeToCs125Sound = MediaPlayer.create(this, R.raw.welcome_to_cs125);
        final MediaPlayer myNameIsGeoffITeachSound = MediaPlayer.create(this, R.raw.my_name_is_geoff_iteach);
        final MediaPlayer roundOfApplauseSound = MediaPlayer.create(this, R.raw.round_of_applause);
        final MediaPlayer welcomeToCollegeSound = MediaPlayer.create(this, R.raw.welcome_to_college);
        final MediaPlayer welcomeToUIUCSound = MediaPlayer.create(this, R.raw.welcome_to_uiuc);
        final MediaPlayer alright1Sound = MediaPlayer.create(this, R.raw.alright);
        final MediaPlayer iSeeOnePersonSound = MediaPlayer.create(this, R.raw.i_see_one_person);

        final Button goodMorning = this.findViewById(R.id.goodMorning);
        final Button welcomeToCs125 = this.findViewById(R.id.welcomeToCs125);
        final Button myNameIsGeoffChallen = this.findViewById(R.id.myNameIsGeoffChallen);
        final Button roundOfApplause = this.findViewById(R.id.roundOfApplause);
        final Button welcomeToCollege = this.findViewById(R.id.welcomeToCollege);
        final Button welcomeToUIUC = this.findViewById(R.id.welcomeToUIUC);
        final Button alright = this.findViewById(R.id.alright);
        final Button iSeeOnePerson = this.findViewById(R.id.iSeeOnePerson);

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
        roundOfApplause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roundOfApplauseSound.start();
            }
        });
        welcomeToCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeToCollegeSound.start();
            }
        });
        welcomeToUIUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeToUIUCSound.start();
            }
        });
        alright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alright1Sound.start();
            }
        });
        iSeeOnePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iSeeOnePersonSound.start();
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
