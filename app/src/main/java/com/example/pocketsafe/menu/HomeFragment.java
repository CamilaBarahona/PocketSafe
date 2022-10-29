package com.example.pocketsafe.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pocketsafe.MonthModel;
import com.example.pocketsafe.R;

import java.util.List;


public class HomeFragment extends Fragment {
    private Bundle bundle;
    private TextView tvSaludo;
    private RecyclerView rvLista;
    private List<MonthModel> items;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


}