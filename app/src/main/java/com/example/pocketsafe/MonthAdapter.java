package com.example.pocketsafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.L;

import java.util.List;

public class MonthAdapter extends RecyclerView.Adapter<MonthAdapter.RecyclerMonthHolder> {
    private List<MonthModel> items;

    public MonthAdapter(List<MonthModel> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public RecyclerMonthHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_resumen_mensual, parent, false);
        return new RecyclerMonthHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerMonthHolder holder, int position) {
        MonthModel item = items.get(position);
        holder.image.setImageResource(item.getImage());
        holder.tvMes.setText(item.getMes());
        holder.tvMonto.setText(item.getMonto());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RecyclerMonthHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView tvMes;
        private TextView tvMonto;

        public RecyclerMonthHolder (@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            tvMes = itemView.findViewById(R.id.tvMes);
            tvMonto = itemView.findViewById(R.id.tvGastosTotales);


        }
    }
}
