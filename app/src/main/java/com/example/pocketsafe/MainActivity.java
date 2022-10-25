package com.example.pocketsafe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button btn_registrarse, btn_iniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_iniciarSesion = (Button) findViewById(R.id.btn_iniciarSesion);
        btn_registrarse = (Button) findViewById(R.id.btn_registrarse);

        btn_iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (
                        MainActivity.this, Login.class
                ));
            }
        });

        btn_registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        MainActivity.this, Register.class
                ));
            }
        });
    }
}