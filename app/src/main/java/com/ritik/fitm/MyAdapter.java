package com.ritik.fitm;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyVeiwHolder>{

    String data1[],data2[];
    int images[];
    Context context;
    public MyAdapter(Context ct, String s1[],String s2[],int img[]){
        context =ct;
        data1=s1;
        data2=s2;
        images=img;


    }
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyVeiwHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.workout_list,parent,false);
        return new MyVeiwHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull MyAdapter.MyVeiwHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,netScreen.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("myImage",images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyVeiwHolder extends RecyclerView.ViewHolder{
        TextView myText1,myText2;
        ImageView myImage;
        ConstraintLayout mainLayout;
        public MyVeiwHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.title);
            myText2 = itemView.findViewById(R.id.description);
            myImage = itemView.findViewById(R.id.imageview);
            mainLayout=itemView.findViewById(R.id.mainLayout);

        }
    }
}
