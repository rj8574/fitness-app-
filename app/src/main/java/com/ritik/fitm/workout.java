package com.ritik.fitm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.security.PrivateKey;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link workout#newInstance} factory method to
 * create an instance of this fragment.
 */
public class workout extends Fragment {
    Activity context;
    Activity context1;
    Activity context2;

    RecyclerView recyclerView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    public workout() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment workout.
     */
    // TODO: Rename and change types and number of parameters
    public static workout newInstance(String param1, String param2) {
        workout fragment = new workout();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        context1=getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout, container, false);
    }
    public void  onStart()
    {
        super.onStart();
        Button btn= (Button) context.findViewById(R.id.imageButton);
        Button btn1= (Button) context.findViewById(R.id.button);
        Button btn2= (Button) context.findViewById(R.id.imageButton1);
        Button btn3= (Button) context.findViewById(R.id.imageButton2);
        Button btn4= (Button) context.findViewById(R.id.button2);
        Button btn5= (Button) context.findViewById(R.id.imageButton3);
        Button btn6= (Button) context.findViewById(R.id.imageButton4);
        Button btn7= (Button) context.findViewById(R.id.button3);
        Button btn8= (Button) context.findViewById(R.id.imageButton5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,NextWorkout.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(context,NextWorkout.class);
                startActivity(intent1);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(context,NextWorkout.class);
                startActivity(intent2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,intermediate.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,intermediate.class);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,intermediate.class);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,advance.class);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,advance.class);
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,advance.class);
                startActivity(intent);
            }
        });



    }


}