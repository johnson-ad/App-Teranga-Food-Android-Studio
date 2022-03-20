package com.example.restoteranga.ui.mainCrouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.restoteranga.R;

public class MainCrouse extends AppCompatActivity {
    private Button main_salad01, main_salad02 ,main_salad03 ,main_salad04, main_salad05, main_salad06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_crouse);


        main_salad01 = findViewById(R.id.main_salde01);
        main_salad02 = findViewById(R.id.main_salde02);
        main_salad03 = findViewById(R.id.main_salde03);
        main_salad04 = findViewById(R.id.main_salde04);
        main_salad05 = findViewById(R.id.main_salde05);
        main_salad06 = findViewById(R.id.main_salde06);

        main_salad01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCrouse.this, MainCourse_salad01Info.class);
                startActivity(i);
            }
        });

        main_salad02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCrouse.this, MainCourse_salad02Info.class);
                startActivity(i);
            }
        });

        main_salad03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCrouse.this, MainCourse_salad03Info.class);
                startActivity(i);
            }
        });

        main_salad04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCrouse.this, MainCourse_salad04Info.class);
                startActivity(i);
            }
        });

        main_salad05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCrouse.this, MainCourse_salad05Info.class);
                startActivity(i);
            }
        });

        main_salad06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCrouse.this, MainCourse_salad06Info.class);
                startActivity(i);
            }
        });
    }
}