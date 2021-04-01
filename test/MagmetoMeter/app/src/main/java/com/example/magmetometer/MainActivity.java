package com.example.magmetometer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.*;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.util.*;


public class MainActivity  extends AppCompatActivity implements SensorEventListener {

    private static final String TAG ="MainActivity";
    private SensorManager SMnger;
    private Sensor MagnoM;
    TextView TVx,TVy,TVz,TV8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVx = (TextView) findViewById(R.id.textView6);
        TVy = (TextView) findViewById(R.id.textView5);
        TVz = (TextView) findViewById(R.id.textView4);
        TV8 = (TextView) findViewById(R.id.textView8);

        Log.d(TAG,"noCreate Initialization Sensor Service");
        System.out.println("noCreate Initialization Sensor Service");

        SMnger = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        MagnoM = SMnger.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        if (MagnoM!=null) {
            SMnger.registerListener(this, MagnoM, SMnger.SENSOR_DELAY_FASTEST);
            Log.d(TAG, "onCreate Registered MagnetoMeter Listener");
        }else{
            Log.d(TAG,"MagnetoMeter Sensor Not Found !!!");
        }
    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Log.d(TAG, "X-axis :"+sensorEvent.values[0]+"Y-axis :"+sensorEvent.values[1]+"Z-axis :"+sensorEvent.values[2]);
        TVx.setText(String.valueOf(sensorEvent.values[0]));
        TVy.setText(String.valueOf(sensorEvent.values[1]));
        TVz.setText(String.valueOf(sensorEvent.values[2]));
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) { }

    @Override
    protected void onPause() {
        super.onPause();
        SMnger.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SMnger.registerListener(this, MagnoM, SMnger.SENSOR_DELAY_FASTEST);
    }
}