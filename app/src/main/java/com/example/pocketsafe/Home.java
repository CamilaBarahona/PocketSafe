package com.example.pocketsafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private Bundle bundle;
    private TextView tvSaludo;
    private RecyclerView rvLista;
    private MonthAdapter adapter;
    private List<MonthModel> items;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvSaludo = (TextView) findViewById(R.id.tvSaludo);
        bundle = getIntent().getExtras();
        String saludo = bundle.getString("nombre");
        tvSaludo.append( "Bienvenid@"  + saludo);

        initViews();
        initValues();
    }
    private void initViews() {
        rvLista = findViewById(R.id.recyclerMensual);
        rvLista.setHasFixedSize(true);
    }
    private void initValues() {
        GridLayoutManager manager = new GridLayoutManager(this, 1);
        rvLista.setLayoutManager(manager);
        items = getItems();
        adapter = new MonthAdapter(items);
        rvLista.setAdapter(adapter);
    }

    private List<MonthModel> getItems() {
        List<MonthModel> itemList = new ArrayList<>();
        itemList.add(new MonthModel("JUNIO 2022", "$300.000", R.drawable.ic_launcher_background));
        itemList.add(new MonthModel("JULIO 2022", "$450.000", R.drawable.ic_launcher_background));
        itemList.add(new MonthModel("AGOSTO 2022", "$500.000", R.drawable.ic_launcher_background));
        itemList.add(new MonthModel("SEPTIEMBRE 2022", "$275.000", R.drawable.ic_launcher_background));
        itemList.add(new MonthModel("OCTUBRE 2022", "$440.800", R.drawable.ic_launcher_background));
        return itemList;
    }

}