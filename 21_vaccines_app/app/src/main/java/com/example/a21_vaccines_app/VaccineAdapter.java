package com.example.a21_vaccines_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VaccineAdapter extends RecyclerView.Adapter<VaccineAdapter.VaccineHolder> {
    private ItemClickListener clickListener;
    private VaccineModel[] listData;

    public VaccineAdapter(VaccineModel[] listData) {
        this.listData = listData;
    }

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public class VaccineHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView imageView;
        public TextView textView;
        public VaccineHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (clickListener != null) {
                clickListener.onClick(v, getAdapterPosition());
            }
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
