package com.ritik.fitm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DietLast extends AppCompatActivity {

    ImageView imageView;
    TextView title,description ;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_last);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            // aslo set in menifest

        }
        imageView =findViewById(R.id.imageView8);
        title =findViewById(R.id.textView2);
        description =findViewById(R.id.textView3);
        if(position==0){

            Intent intent =getIntent();
        Bundle bundle =this.getIntent().getExtras();
        int pic=bundle.getInt("images");
        String aTitle=intent.getStringExtra("title");
        String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==1){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==2){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==3){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        } if(position==4){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==5){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==6){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==7){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==8){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("image");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==9){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }
        if(position==10){

            Intent intent =getIntent();
            Bundle bundle =this.getIntent().getExtras();
            int pic=bundle.getInt("images");
            String aTitle=intent.getStringExtra("title");
            String aDescription=intent.getStringExtra ("descrption");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }


    }
}