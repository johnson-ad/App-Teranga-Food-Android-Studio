package com.example.restoteranga.ui.refreshment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.restoteranga.R;

public class Refreshment extends AppCompatActivity {

    private Button refreshment_salad01, refreshment_salad02 ,refreshment_salad03 ,refreshment_salad04, refreshment_salad05, refreshment_salad06;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refreshment);

        refreshment_salad01 = findViewById(R.id.refreshment01);
        refreshment_salad02 = findViewById(R.id.refreshment02);
        refreshment_salad03 = findViewById(R.id.refreshment03);
        refreshment_salad04 = findViewById(R.id.refreshment04);
        refreshment_salad05 = findViewById(R.id.refreshment05);
        refreshment_salad06 = findViewById(R.id.refreshment06);

        refreshment_salad01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Refreshment.this, Refreshment_info01.class);
                startActivity(i);
            }
        });

        refreshment_salad02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Refreshment.this, Refreshment_info02.class);
                startActivity(i);
            }
        });

        refreshment_salad03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Refreshment.this, Refreshment_info03.class);
                startActivity(i);
            }
        });

        refreshment_salad04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Refreshment.this, Refreshment_info04.class);
                startActivity(i);
            }
        });

        refreshment_salad05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Refreshment.this, Refreshment_info05.class);
                startActivity(i);
            }
        });

        refreshment_salad06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Refreshment.this, Refreshment_info06.class);
                startActivity(i);
            }
        });
    }
}