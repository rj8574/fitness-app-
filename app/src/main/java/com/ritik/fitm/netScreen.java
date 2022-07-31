package com.ritik.fitm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class netScreen extends AppCompatActivity {
    ImageView imageView;
    TextView title ,description,you;

    String data1,data2;
    int myImage;
    private int  duration=30;
    private boolean timerRunning=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_screen);
        imageView=findViewById(R.id.mainimageView);
        title=findViewById(R.id.title);
        description=findViewById(R.id.description);
        you=findViewById(R.id.you);


        getData();
        setData();
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=IODxDxX7oi4");
            }
        });
        final TextView hour=findViewById(R.id.hour);
        final TextView min= findViewById(R.id.min);
        final TextView seconds=findViewById(R.id.seconds);
        final AppCompatButton startBtn=findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!timerRunning){
                    timerRunning=true;
                    new CountDownTimer(duration * 1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    String time=  String.format( Locale.getDefault(),"%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)-
                                                    TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished)-
                                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MICROSECONDS.toMinutes(millisUntilFinished))
                                           );

                                    final String[] hourMinSec =time.split(":");
                                    hour.setText(hourMinSec[0]);
                                    min.setText(hourMinSec[1]);
                                    seconds.setText(hourMinSec[2]);
                                }
                            });
                        }

                        @Override
                        public void onFinish() {
                                duration= 30;
                                timerRunning =false;
                        }
                    }.start();
                }
                else {
                    Toast.makeText(netScreen.this, "Timmer is running", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri =Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private  void getData(){
        if(getIntent().hasExtra("myImage")&&getIntent().hasExtra("data1")&&
        getIntent().hasExtra("data2")) {
            data1 = getIntent().getStringExtra("data1");
            data2=getIntent().getStringExtra("data2");
            myImage=getIntent().getIntExtra("myImage",1);
        }else{
            Toast.makeText(this, "No dATA", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData()
    {
        title.setText(data1);
        description.setText(data2);
       imageView.setImageResource(myImage);
    }
}