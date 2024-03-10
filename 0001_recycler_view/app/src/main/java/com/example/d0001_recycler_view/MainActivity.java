package com.example.d0001_recycler_view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NumberInterface{
    RecyclerView recyclerView;
    ArrayList<NumberModel> numberModelList = new ArrayList<>();
    NumberAdapter adapter;
    int[] numberImages = {
            R.drawable.n1,
            R.drawable.n2,
            R.drawable.n3,
            R.drawable.n4,
            R.drawable.n5,
            R.drawable.n6,
            R.drawable.n7,
            R.drawable.n8,
            R.drawable.n9,
            R.drawable.n10,
            R.drawable.n11,
            R.drawable.n12,
            R.drawable.n13,
            R.drawable.n14,
            R.drawable.n15,
            R.drawable.n16,
            R.drawable.n17,
            R.drawable.n18,
            R.drawable.n19,
            R.drawable.n20,
    };
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
        setUpNumbers();
        recyclerView = findViewById(R.id.mRecyclerView);
        adapter = new NumberAdapter(this, numberModelList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpNumbers() {
        String[] englishNames = getResources().getStringArray(R.array.number_english);
        String[] kannadaNames = getResources().getStringArray(R.array.number_kannada);
        String[] kannadaSymbols = getResources().getStringArray(R.array.number_kannada_symbol);

        for(int i = 0; i < englishNames.length; i++) {
            numberModelList.add(new NumberModel(englishNames[i], kannadaNames[i], kannadaSymbols[i], numberImages[i]));
        }
    }

    @Override
    public void onNumberClick(int position) {
        NumberModel numberModel = numberModelList.get(position);
        Toast.makeText(this, numberModel.getEnglish(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNumberLongClick(int position) {
        numberModelList.remove(position);
        adapter.notifyItemRemoved(position);
    }
}