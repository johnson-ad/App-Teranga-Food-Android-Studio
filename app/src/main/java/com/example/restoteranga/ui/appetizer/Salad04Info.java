package com.example.restoteranga.ui.appetizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.restoteranga.R;
import com.example.restoteranga.model.Connexion;

public class Salad04Info extends AppCompatActivity {
    private Button commander;
    private ImageView return_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad04_info);

        commander = (Button) findViewById(R.id.btn_commander);
        return_back = (ImageView) findViewById(R.id.btn_back);

        return_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Salad04Info.this, AppetizerActivity.class);
                startActivity(i);
            }
        });

        commander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Salad04Info.this, Connexion.class);
                startActivity(i);
            }
        });
    }
}