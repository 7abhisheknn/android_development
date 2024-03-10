package com.example.d0001_recycler_view;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {
    Context context;
    ArrayList<NumberModel> numberModelList;
    public NumberAdapter(Context context, ArrayList<NumberModel> numberModelList) {
        this.context = context;
        this.numberModelList = numberModelList;
    }
    @NonNull
    @Override
    public NumberAdapter.NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new NumberAdapter.NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberAdapter.NumberViewHolder holder, int position) {
        holder.tvEnglish.setText(numberModelList.get(position).getEnglish());
        holder.tvKannada.setText(numberModelList.get(position).getKannada());
        holder.tvSymbol.setText(numberModelList.get(position).getKannadaSymbol());
//        holder.imageView.setImageResource(numberModelList.get(position).getImage()); memory error overflow, cant draw image
        Glide.with(context)
                .asBitmap()
                .load(numberModelList.get(position).getImage())
                .override(100, 100)  // Set your target width and height
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return numberModelList.size();
    }

    public static class NumberViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvEnglish;
        TextView tvKannada;
        TextView tvSymbol;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.number_image);
            tvEnglish = itemView.findViewById(R.id.number_english);
            tvKannada = itemView.findViewById(R.id.number_kannada);
            tvSymbol = itemView.findViewById(R.id.number_kannada_symbol);
        }
    }
}

