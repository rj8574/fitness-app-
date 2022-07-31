package com.ritik.fitm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class splashScrren extends AppCompatActivity {
    TextView appname;
    LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scrren);

        appname=findViewById(R.id.appname);
        lottie=findViewById(R.id.lottie);

        appname.animate().translationY(-1400).setDuration(2700).setStartDelay(0);
        lottie.animate().translationY(2000).setDuration(2000).setStartDelay(2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        },5000);
    }
}