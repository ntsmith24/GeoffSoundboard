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
        final MediaPlayer alrightSound = MediaPlayer.create(this, R.raw.alright);
        final MediaPlayer iSeeOnePersonSound = MediaPlayer.create(this, R.raw.i_see_one_person);
        final MediaPlayer alright1Sound = MediaPlayer.create(this, R.raw.alright1);
        final MediaPlayer alright2Sound = MediaPlayer.create(this, R.raw.alright2);
        final MediaPlayer coolSound = MediaPlayer.create(this, R.raw.cool);
        final MediaPlayer spookySound = MediaPlayer.create(this, R.raw.spooky);
        final MediaPlayer spookyMusicSound = MediaPlayer.create(this, R.raw.spooky_music);
        final MediaPlayer halloweenSound = MediaPlayer.create(this, R.raw.welcome_to_halloween);
        final MediaPlayer treesSound = MediaPlayer.create(this, R.raw.trees);
        final MediaPlayer niceSound = MediaPlayer.create(this, R.raw.nice);
        final MediaPlayer soSound = MediaPlayer.create(this, R.raw.so);
        final MediaPlayer okSound = MediaPlayer.create(this, R.raw.ok);
        final MediaPlayer um0Sound = MediaPlayer.create(this, R.raw.um);
        final MediaPlayer um1Sound = MediaPlayer.create(this, R.raw.um1);
        final MediaPlayer youKnowSound = MediaPlayer.create(this, R.raw.you_know);
        final MediaPlayer todaySound = MediaPlayer.create(this, R.raw.today);

        final Button goodMorning = this.findViewById(R.id.goodMorning);
        final Button welcomeToCs125 = this.findViewById(R.id.welcomeToCs125);
        final Button myNameIsGeoffChallenITeach = this.findViewById(R.id.myNameIsGeoffChallen);
        final Button roundOfApplause = this.findViewById(R.id.roundOfApplause);
        final Button welcomeToCollege = this.findViewById(R.id.welcomeToCollege);
        final Button welcomeToUIUC = this.findViewById(R.id.welcomeToUIUC);
        final Button alright = this.findViewById(R.id.alright);
        final Button iSeeOnePerson = this.findViewById(R.id.iSeeOnePerson);
        final Button alright1 = this.findViewById(R.id.alright1);
        final Button alright2 = this.findViewById(R.id.alright2);
        final Button cool = this.findViewById(R.id.cool);
        final Button spooky = this.findViewById(R.id.spooky);
        final Button spookyMusic = this.findViewById(R.id.spookyMusic);
        final Button halloween = this.findViewById(R.id.welcomeToHalloween);
        final Button trees = this.findViewById(R.id.trees);
        final Button nice = this.findViewById(R.id.nice);
        final Button so = this.findViewById(R.id.so);
        final Button ok = this.findViewById(R.id.ok);
        final Button um0 = this.findViewById(R.id.um0);
        final Button um1 = this.findViewById(R.id.um1);
        final Button youKnow = this.findViewById(R.id.youKnow);
        final Button today = this.findViewById(R.id.today);

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
        myNameIsGeoffChallenITeach.setOnClickListener(new View.OnClickListener() {
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
                alrightSound.start();
            }
        });
        iSeeOnePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iSeeOnePersonSound.start();
            }
        });
        alright1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alright1Sound.start();
            }
        });
        alright2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alright2Sound.start();
            }
        });
        cool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coolSound.start();
            }
        });
        spooky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spookySound.start();
            }
        });
        spookyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spookyMusicSound.start();
            }
        });
        halloween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                halloweenSound.start();
            }
        });
        trees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                treesSound.start();
            }
        });
        nice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                niceSound.start();
            }
        });
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soSound.start();
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okSound.start();
            }
        });
        um0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                um0Sound.start();
            }
        });
        um1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                um1Sound.start();
            }
        });
        youKnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youKnowSound.start();
            }
        });
        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                todaySound.start();
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
