package com.ritik.fitm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class intermediate extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images[]={R.drawable.di,R.drawable.re,R.drawable.pull,R.drawable.de,
            R.drawable.vh,R.drawable.di,R.drawable.re,R.drawable.de,R.drawable.vh,R.drawable.up
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);


        recyclerView =findViewById(R.id.recyclerVeiw);
        s1=getResources().getStringArray(R.array.shoulder);
        s2=getResources().getStringArray(R.array.description);


        MyAdapter myAdapter=new MyAdapter(this ,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}