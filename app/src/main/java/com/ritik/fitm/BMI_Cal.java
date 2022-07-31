package com.ritik.fitm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class BMI_Cal extends AppCompatActivity {
    EditText height,weight,age;
    TextView tv,tr;
    Spinner gender;
    Button btnbmi;
    String[] users = { "Male", "Female" };
    String genderstr;
    Double bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_cal);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        age = findViewById(R.id.age);
        btnbmi = findViewById(R.id.btnbmi);
        tv =findViewById(R.id.bmival);
        tr = findViewById(R.id.bmirating);

        gender = findViewById(R.id.gender);
        gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                genderstr = users[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Log.d("DEBUG", "CLICKED");
        btnbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("DEBUG", "CLICKED");
                if (height.getText() == null || weight.getText() == null || age.getText() == null || genderstr == null) {
                    Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_LONG).show();
                } else {
                    int ag, gen;
                    double hei, wei;
                    if (genderstr.equals("Male")) {
                        gen = 1;
                    } else if (genderstr.equals("Female")) {
                        gen = 2;
                    }

                    String prheight = height.getText().toString();
                    String prweight = weight.getText().toString();
                    String prage = age.getText().toString();
                    if (prheight.equals("") || prweight.equals("") || prage.equals("")) {
                        Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_LONG).show();
                    } else {
                        hei = Double.parseDouble(prheight);
                        wei = Double.parseDouble(prweight);
                        hei = hei / 100;
                        ag = Integer.parseInt(prage);

                        bmi = (wei / ((hei * hei)));

                        String rate = "";
                        if (bmi < 16)
                            rate = "Underweight";
                        else if (bmi < 25)
                            rate = "Healthy";
                        else if (bmi < 30)
                            rate = "Overweight";
                        else
                            rate = "Obese";

                        tv.setText("BMI Score : " + bmi.toString().subSequence(0, 4));
                        tr.setText("Category : " + rate);
//                        Toast.makeText(getActivity().getApplicationContext(), "Height - "+hei+" Weight- "+wei+"\nBMI is " + bmi +"Gen "+genderstr, Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
    }
}