package com.ritik.fitm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class stepcount extends AppCompatActivity implements SensorEventListener {

    private TextView textViewStepCounter, textViewstepDetector;
    private SensorManager sensorManager;
    private Sensor nStepCounter,nStepDetector;
    private boolean isCounterSensorPresent,isDectorSensorPresnt;
    int stepCount=0,stepDetector=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepcount);

        if(ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACTIVITY_RECOGNITION) == PackageManager.PERMISSION_DENIED){ //ask for permission
            requestPermissions(new String[]{Manifest.permission.ACTIVITY_RECOGNITION}, 0);
        }
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        textViewStepCounter= findViewById (R.id.textViewStepCounter);
        textViewstepDetector=findViewById (R.id. textViewStepDector);

        sensorManager= (SensorManager) getSystemService (SENSOR_SERVICE);

        if (sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!= null)
        {
            nStepCounter=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
            isCounterSensorPresent=true;

        }else
        {
           textViewStepCounter.setText("COUNTER SENSOR NOT FOUND");
           isCounterSensorPresent=false;
        }
        if(sensorManager.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR)!=null){
            nStepCounter=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR);
            isDectorSensorPresnt=true;
        }else{
            textViewstepDetector.setText("DETECTOR SENSOR NOT FOUND");
            isDectorSensorPresnt=false;
        }

    }




    @Override
    public void onSensorChanged(SensorEvent event) {

       if(event.sensor == nStepCounter){
          stepCount = (int) event.values[0];
          textViewStepCounter.setText(String.valueOf(stepCount));
       } else if (event.sensor==nStepDetector){
           stepDetector= (int) (stepDetector+event.values[0]);
           textViewstepDetector.setText(String.valueOf(stepDetector));

       }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    @Override
    protected void onResume() {
        super.onResume();
        if(sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!=null)
        {
            sensorManager.registerListener(this,nStepCounter,SensorManager.SENSOR_DELAY_NORMAL);
        }
        if(sensorManager.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR)!=null)
        {
            sensorManager.registerListener(this, nStepDetector,sensorManager.SENSOR_DELAY_NORMAL);
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        if(sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!=null){
            sensorManager.unregisterListener(this,nStepCounter);
        }
        if(sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!=null){
            sensorManager.unregisterListener(this,nStepDetector);
        }

    }
}