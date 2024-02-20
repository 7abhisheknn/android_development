package com.example.d07_views_and_widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView counterText;

    private void updateCount() {
        count++;
        String ans;
        if (count < 10) {
            ans = "0" + String.valueOf(count);
        } else {
            ans = String.valueOf(count);
        }
        counterText.setText(ans);
        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        Button myBTN = findViewById(R.id.btn);
        EditText myEditTex = findViewById(R.id.editText);

        myBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, myEditTex.getText().toString() + ", Welcome to the Club", Toast.LENGTH_SHORT).show();
=======
        counterText = findViewById(R.id.counterText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateCount();
>>>>>>> fce681104de066c4b9b4a95fb6931f29bbca9cf4
            }
        });
    }
}