package com.example.pocketsafe;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pocketsafe.menu.HomeFragment;
import com.example.pocketsafe.menu.Menu;

public class ConsultaNombre extends Activity {

    private EditText edNombre;
    private Button btnEnviar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_nombre);

        edNombre = (EditText) findViewById(R.id.edNombre);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edNombre.getText().toString().isEmpty()) {
                    Intent intent =  new Intent( ConsultaNombre.this, Menu.class);
                    intent.putExtra("nombre", edNombre.getText().toString());
                    startActivity(intent);

                } else {
                    Toast.makeText(ConsultaNombre.this, "Debes indicar un nombre", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}