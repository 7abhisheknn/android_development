package com.example.a21_vaccines_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VaccineAdapter extends RecyclerView.Adapter<VaccineAdapter.VaccineHolder> {
    private VaccineModel[] listData;

    public VaccineAdapter(VaccineModel[] listData) {
        this.listData = listData;
    }

    public static class VaccineHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public VaccineHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView = itemView.findViewById(R.id.textView);
        }
    }

    @NonNull
    @Override
    public VaccineHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.recylerview_item, parent, false);
        VaccineHolder vaccineHolder = new VaccineHolder(listItem);
        return vaccineHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VaccineHolder holder, int position) {
        final VaccineModel vaccineModel = listData[position];
        holder.textView.setText(vaccineModel.getTitle());
        holder.imageView.setImageResource(vaccineModel.getImage());
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

}
