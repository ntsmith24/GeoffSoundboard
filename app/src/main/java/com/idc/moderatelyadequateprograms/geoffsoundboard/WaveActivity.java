package com.idc.moderatelyadequateprograms.geoffsoundboard;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class WaveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.home);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        accel = 0.00f;
        accelCurrent = SensorManager.GRAVITY_EARTH;
        accelLast = SensorManager.GRAVITY_EARTH;
        handler.post(runnableCode);
    }

    Handler handler = new Handler();
    public void sound() {
        final MediaPlayer morning = MediaPlayer.create(this, R.raw.good_morning);
        morning.start();
    }

    private Runnable runnableCode = new Runnable() {
        @Override
        public void run() {

            if (accel > 1) {
                sound();
            }

            handler.postDelayed(this, 500);
        }
    };


    private SensorManager mSensorManager;
    private float accel; // acceleration apart from gravity
    private float accelCurrent; // current acceleration including gravity
    private float accelLast; // last acceleration including gravity

    private final SensorEventListener mSensorListener = new SensorEventListener() {

        public void onSensorChanged(SensorEvent sens) {
            float x = sens.values[0];
            float y = sens.values[1];
            float z = sens.values[2];
            accelLast = accelCurrent;
            accelCurrent = (float) Math.sqrt((double) (x*x + y*y + z*z));
            float delta = accelCurrent - accelLast;
            accel = accel * 0.9f + delta;
        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        handler.post(runnableCode);
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        handler.removeCallbacks(runnableCode);
        mSensorManager.unregisterListener(mSensorListener);
        super.onPause();
    }


}
