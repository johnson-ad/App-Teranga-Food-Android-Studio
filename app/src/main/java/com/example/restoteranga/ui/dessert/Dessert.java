package com.example.restoteranga.ui.dessert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.restoteranga.R;

public class Dessert extends AppCompatActivity {
    private Button dessert_salad01, dessert_salad02 ,dessert_salad03 ,dessert_salad04, dessert_salad05, dessert_salad06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        dessert_salad01 = findViewById(R.id.dessert01);
        dessert_salad02 = findViewById(R.id.dessert02);
        dessert_salad03 = findViewById(R.id.dessert03);
        dessert_salad04 = findViewById(R.id.dessert04);
        dessert_salad05 = findViewById(R.id.dessert05);
        dessert_salad06= findViewById(R.id.dessert06);

        dessert_salad01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dessert.this, Dessert_info01.class);
                startActivity(i);
            }
        });

        dessert_salad02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dessert.this, Dessert_info02.class);
                startActivity(i);
            }
        });

        dessert_salad03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dessert.this, Dessert_info03.class);
                startActivity(i);
            }
        });

        dessert_salad04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dessert.this, Dessert_info04.class);
                startActivity(i);
            }
        });

        dessert_salad05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dessert.this, Dessert_info05.class);
                startActivity(i);
            }
        });

        dessert_salad06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dessert.this, Dessert_info06.class);
                startActivity(i);
            }
        });


    }
}