package com.ritik.fitm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextWorkout extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images[]={R.drawable.sq,R.drawable.dow,R.drawable.pull,R.drawable.down,
            R.drawable.sq,R.drawable.se,R.drawable.srk,R.drawable.rk,R.drawable.upt,R.drawable.up
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_workout);

        recyclerView =findViewById(R.id.recyclerVeiw);
        s1=getResources().getStringArray(R.array.workouts);
        s2=getResources().getStringArray(R.array.description);


        MyAdapter myAdapter=new MyAdapter(this ,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

}