package com.example.restoteranga.ui.mainCrouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.restoteranga.R;
import com.example.restoteranga.model.Connexion;
import com.example.restoteranga.ui.dessert.Dessert_info01;

public class MainCourse_salad04Info extends AppCompatActivity {
    private ImageView return_back;
    private Button commander;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course_salad04_info);

        return_back = (ImageView) findViewById(R.id.btn_back);

        return_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCourse_salad04Info.this, MainCrouse.class);
                startActivity(i);
            }
        });

        commander = (Button) findViewById(R.id.btn_commander);
        commander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainCourse_salad04Info.this, Connexion.class);
                startActivity(i);
            }
        });
    }
}