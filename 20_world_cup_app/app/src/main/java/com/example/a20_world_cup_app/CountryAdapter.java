package com.example.a20_world_cup_app;

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

public class CountryAdapter extends ArrayAdapter<CountryModelClass> {
    private ArrayList<CountryModelClass> countryArrayList;
    Context context;

    public CountryAdapter(ArrayList<CountryModelClass> data, Context context) {
        super(context, R.layout.item_list_layout, data);
        countryArrayList = data;
        this.context = context;
    }

    private static class ViewHolder {
        TextView countryName;
        TextView cupCount;
        ImageView flagImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CountryModelClass dataModel = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );
            viewHolder.countryName = convertView.findViewById(R.id.countryName);
            viewHolder.cupCount = convertView.findViewById(R.id.cupCount);
            viewHolder.flagImg = convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.countryName.setText(dataModel.getCountryName());
        viewHolder.cupCount.setText(dataModel.getCupCount());
        viewHolder.flagImg.setImageResource(dataModel.getFlagImg());

        return convertView;
    }

}
