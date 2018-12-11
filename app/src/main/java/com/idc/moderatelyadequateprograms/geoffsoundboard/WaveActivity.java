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
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WaveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.home);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensorManager.registerListener(sensorListener,
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);

        accel = 0.00f;
        accelCurrent = SensorManager.GRAVITY_EARTH;
        accelLast = SensorManager.GRAVITY_EARTH;
        handler.post(runnable);
        final ImageButton geoff = this.findViewById(R.id.imageButton);
        geoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound();
            }
        });
    }

    Handler handler = new Handler();
    public void sound() {
        final MediaPlayer hi = MediaPlayer.create(this, R.raw.hi_its_geoff);
        hi.start();
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (accel > 1) {
                sound();
            }
            handler.postDelayed(this, 500);
        }
    };

    private SensorManager sensorManager;
    private float accel;
    private float accelCurrent;
    private float accelLast;
    private float sensorSensitivity = 0.9f;

    private final SensorEventListener sensorListener = new SensorEventListener() {
        public void onSensorChanged(SensorEvent sens) {
            float x = sens.values[0];
            float y = sens.values[1];
            float z = sens.values[2];
            accelLast = accelCurrent;
            accelCurrent = (float) Math.sqrt((double) (x*x + y*y + z*z));
            float newAccel = accelCurrent - accelLast;
            accel = accel * sensorSensitivity + newAccel;
        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        handler.post(runnable);
        sensorManager.registerListener(sensorListener,
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        handler.removeCallbacks(runnable);
        sensorManager.unregisterListener(sensorListener);
        super.onPause();
    }


}
