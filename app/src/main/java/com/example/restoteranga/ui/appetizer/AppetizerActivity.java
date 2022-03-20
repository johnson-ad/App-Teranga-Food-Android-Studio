package com.example.restoteranga.ui.appetizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.restoteranga.R;

public class AppetizerActivity extends AppCompatActivity
{

    private Button salad01, salad02, salad03, salad04, salad05, salad06;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer);

        salad01 = findViewById(R.id.salad01);
        salad02 = findViewById(R.id.salade02);
        salad03 = findViewById(R.id.salad03);
        salad04 = findViewById(R.id.salad04);
        salad05 = findViewById(R.id.salad05);
        salad06 = findViewById(R.id.salad06);

        salad01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AppetizerActivity.this, Salad01InfoActivity.class);
                startActivity(i);
            }
        });

        salad02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AppetizerActivity.this, Salad02Info.class);
                startActivity(i);
            }
        });

        salad03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AppetizerActivity.this, Salad03Info.class);
                startActivity(i);
            }
        });

        salad04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AppetizerActivity.this, Salad04Info.class);
                startActivity(i);
            }
        });

        salad05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AppetizerActivity.this, Salad05Info.class);
                startActivity(i);
            }
        });

        salad06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AppetizerActivity.this, Salad06Info.class);
                startActivity(i);
            }
        });
    }
}