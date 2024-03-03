package com.example.d17_volume_calculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ShapeGridAdapter extends ArrayAdapter<Shape> {
    private ArrayList<Shape> shapeArrayList;
    Context context;


    public ShapeGridAdapter(ArrayList<Shape> shapeArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    private static class MyViewHolder {
        TextView shapeName;
        ImageView shapeImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape = getItem(position);
        MyViewHolder myViewHolder;

        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater infater = LayoutInflater.from(getContext());
            convertView = infater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );
            myViewHolder.shapeName = convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg = convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        myViewHolder.shapeName.setText(shape.getShapeName());
        myViewHolder.shapeImg.setImageResource(shape.getShapeImg());
        return convertView;
    }
}
