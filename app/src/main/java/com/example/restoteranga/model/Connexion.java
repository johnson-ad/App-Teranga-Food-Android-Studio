package com.example.restoteranga.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.restoteranga.Cart;
import com.example.restoteranga.R;
import com.example.restoteranga.ui.dessert.Dessert;
import com.example.restoteranga.ui.dessert.Dessert_info01;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Connexion extends AppCompatActivity {
    private Button btnConnect,btnSignUp;
    private EditText txtLogin,txtPassword,txtEmail;
    private String login,passwords,Email;
    private TextView cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        txtLogin=findViewById(R.id.txtFirstName);
        txtPassword=findViewById(R.id.txtMdp);
        txtEmail=findViewById(R.id.txtEmail);
        btnConnect=findViewById(R.id.btnSave);
        btnSignUp=findViewById(R.id.btnInscription);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Connexion.this, Inscription.class);
                startActivity(i);
            }
        });

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login = txtLogin.getText().toString();
                passwords = txtPassword.getText().toString();
                if(login.isEmpty()|| passwords.isEmpty()){
                    String message = getString(R.string.error_field);
                    Toast.makeText(Connexion.this,message, Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent= new Intent(Connexion.this, Cart.class);
                    startActivity(intent);


                    connect();

                }

            }
        });


    }

    public void connect(){
        String url=""+login+"&password="+passwords;
        Request request =new Request.Builder()
                .url(url)
                .build();
        OkHttpClient Client=new OkHttpClient();
        Client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(Connexion.this,"Soucis de connection",Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    String result=response.body().string();
                    JSONObject jo=new JSONObject(result);
                    String status=jo.getString("status");
                    if(status.equals("OK")){
                        Intent intent= new Intent(Connexion.this, Cart.class);
                        startActivity(intent);

                    }
                    else {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Connexion.this,"Parametre incorrect",Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}