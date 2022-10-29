package com.example.pocketsafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button btn_validar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_validar = (Button) findViewById(R.id.btn_validar);

        btn_validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register.this, "Usuario Creado con éxito", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(
                        Register.this, Login.class
                ));
            }
        });
    }
}