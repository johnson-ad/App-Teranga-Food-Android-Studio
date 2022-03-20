package com.example.restoteranga;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cart extends Fragment {

    private  String[]tabCart,tabDetails;
    private ListView listCart;
    private  String formation,details;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        listCart = view.findViewById(R.id.listCart);
        tabCart =view.getResources().getStringArray(R.array.tab_cart);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,tabCart);
        listCart.setAdapter(adapter);

        /*listCart.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                formation=tabCart[position];
                details=tabDetails[position];

                AlertDialog.Builder dialog=new AlertDialog.Builder(getActivity());
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setTitle(formation);
                dialog.setMessage(details);
                dialog.setNegativeButton("Retour",null);
                dialog.setPositiveButton("Inscription", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getFragmentManager().beginTransaction()
                                .replace(R.id.nav_host_fragment_content_home,new InscriptionFragment()).addToBackStack(null).commit();
                    }
                });
                dialog.show();

            }
        });*/

        return  view;
    }
}