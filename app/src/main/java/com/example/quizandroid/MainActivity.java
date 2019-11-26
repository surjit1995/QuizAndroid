package com.example.quizandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity  {
EditText etResult;
RadioButton b1,b2,b3,b4,b5;


    Button okbutton;
    Integer points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=findViewById(R.id.rg1rb2);
        b2=findViewById(R.id.rg2rb1);
        b3=findViewById(R.id.rg3rb1);
        b4=findViewById(R.id.rg4rb1);
        b5=findViewById(R.id.rg5rb3);


        etResult = findViewById(R.id.result);
        okbutton= findViewById(R.id.ok);
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.isChecked())
                {
                    points++;
                }
                if(b2.isChecked())
                {
                    points++;
                }
                if(b3.isChecked())
                {
                    points++;
                }
                if(b4.isChecked())
                {
                    points++;
                }
                if(b5.isChecked())
                {
                    points++;
                }
                etResult.setText(points.toString());
            }
        });

    }

    }


