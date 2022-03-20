package com.example.restoteranga.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.restoteranga.Cart;
import com.example.restoteranga.HomeActivity;
import com.example.restoteranga.MenuFragment;
import com.example.restoteranga.R;
import com.example.restoteranga.databinding.FragmentHomeBinding;
import com.example.restoteranga.model.Connexion;
import com.example.restoteranga.ui.appetizer.AppetizerActivity;
import com.example.restoteranga.ui.dessert.Dessert_info01;
import com.example.restoteranga.ui.gallery.GalleryFragment;
import com.example.restoteranga.ui.help.Help;
import com.example.restoteranga.ui.home.HomeViewModel;
import com.example.restoteranga.ui.map.LocalisationFragment;
import com.example.restoteranga.ui.refreshment.Refreshment;

public class HomeFragment extends Fragment
{
    private FragmentHomeBinding binding;
    private ImageButton btn_menu, btn_cart, btn_gallery, btn_location, btn_help;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        btn_menu = root.findViewById(R.id.home_btn_menu);
        btn_cart = root.findViewById(R.id.home_btn_cart);
        btn_gallery = root.findViewById(R.id.home_btn_order);
        btn_location = root.findViewById(R.id.home_btn_location);
        btn_help = root.findViewById(R.id.home_btn_help);

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MenuFragment.class);
                startActivity(i);
            }
        });

        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Cart.class);
                startActivity(i);
            }
        });

        btn_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), GalleryFragment.class);
                startActivity(i);
            }
        });

        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), LocalisationFragment.class);
                startActivity(i);
            }
        });

        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Help.class);
                startActivity(i);
            }
        });



        return root;
    }

    /*@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }*/
}