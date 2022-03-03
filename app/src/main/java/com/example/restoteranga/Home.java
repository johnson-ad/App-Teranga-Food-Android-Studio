package com.example.restoteranga;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;


public class Home extends Fragment
{
    private Button appetizer, main_course, dessert, refreshment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        appetizer = view.findViewById(R.id.appetizer);
        dessert = view.findViewById(R.id.dessert);
        main_course = view.findViewById(R.id.main_course);
        refreshment = view.findViewById(R.id.refreshment);

        refreshment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Refreshment.class);
                startActivity(i);
            }
        });

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Dessert.class);
                startActivity(i);
            }
        });

        main_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainCrouse.class);
                startActivity(i);
            }
        });

        appetizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AppetizerActivity.class);
                startActivity(i);
            }
        });

        return view;
    }
}