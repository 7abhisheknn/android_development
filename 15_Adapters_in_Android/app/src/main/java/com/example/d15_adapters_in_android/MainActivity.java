package com.example.d15_adapters_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        ArrayList<String> countriesList = new ArrayList<>(Arrays.asList("India", "USA", "Russia", "France", "UAE", "Japan"));


        ArrayList<String> moreCountries= new ArrayList<>();

        for(int i = 0; i < 50; i++) {
            moreCountries.addAll(countriesList);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, moreCountries);

        listView.setAdapter(adapter);
    }
}