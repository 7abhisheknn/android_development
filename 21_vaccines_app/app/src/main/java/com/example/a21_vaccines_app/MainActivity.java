package com.example.a21_vaccines_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    RecyclerView recyclerView;
    VaccineModel[] listData = {
            new VaccineModel("Hepatitis B Vaccine", R.drawable.vaccine1),
            new VaccineModel("Tetanus Vaccine", R.drawable.vaccine4),
            new VaccineModel("Pneumococcal Vaccine", R.drawable.vaccine5),
            new VaccineModel("Rotavirus Vaccine", R.drawable.vaccine6),
            new VaccineModel("Measles Virus", R.drawable.vaccine7),
            new VaccineModel("Cholera Virus", R.drawable.vaccine8),
            new VaccineModel("Covid-19 Virus", R.drawable.vaccine9),
    };
    VaccineAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recylerView);
        adapter = new VaccineAdapter(listData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        adapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this, "Vaccine Name: " + listData[pos].getTitle(), Toast.LENGTH_SHORT).show();
    }
}