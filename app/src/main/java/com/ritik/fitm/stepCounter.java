package com.ritik.fitm;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link stepCounter#newInstance} factory method to
 * create an instance of this fragment.
 */
public class stepCounter extends Fragment {

    Activity context;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    CalendarView calendar;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public stepCounter() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment stepCounter.
     */
    // TODO: Rename and change types and number of parameters
    public static stepCounter newInstance(String param1, String param2) {
        stepCounter fragment = new stepCounter();
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
        // Inflate the layout for this fragment
        context = getActivity();
        return inflater.inflate(R.layout.fragment_step_counter, container, false);
    }

    public void onStart()
    {
        super.onStart();
        Button btn= (Button) context.findViewById(R.id.button2);
        Button btn1= (Button) context.findViewById(R.id.button3);
        Button btn2= (Button) context.findViewById(R.id.button4);
        Button btn3= (Button) context.findViewById(R.id.button5);
        Button btn4= (Button) context.findViewById(R.id.button11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,stepcount.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,BMI_Cal.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,reminder.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,calender.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,calorie.class);
                startActivity(intent);
            }
        });
    }
}