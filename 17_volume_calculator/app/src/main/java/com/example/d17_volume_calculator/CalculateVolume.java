package com.example.d17_volume_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.content.Intent;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculateVolume extends AppCompatActivity {
    int position;
    TextView title;
    EditText input1;
    EditText input2;
    EditText input3;
    TextView result;

    void setUpUi() {
        switch (position) {
            case 0:
                title.setText("Sphere Volume");
                input1.setVisibility(View.VISIBLE);
                input1.setHint("Enter Radius");
                break;
            case 1:
                title.setText("Cylinder Volume");
                input1.setVisibility(View.VISIBLE);
                input1.setHint("Enter Radius");
                input2.setVisibility(View.VISIBLE);
                input2.setHint("Enter Height");
                break;
            case 2:
                title.setText("Cube Volume");
                input1.setVisibility(View.VISIBLE);
                input1.setHint("Enter Side");
                break;
            case 3:
                title.setText("Prism Volume");
                input1.setVisibility(View.VISIBLE);
                input1.setHint("Enter Length");
                input2.setVisibility(View.VISIBLE);
                input2.setHint("Enter Bredth");
                input3.setVisibility(View.VISIBLE);
                input3.setHint("Enter Height");
                break;
        }
    }

    double calculateSphere() {
        Double r = Double.valueOf(input1.getText().toString()); // radius
        Double val = 4 * Math.PI * Math.pow(r, 3) / 3;
        return val;
    }
    double calculateCylinder() {
        Double r = Double.valueOf(input1.getText().toString()); // radius
        Double h = Double.valueOf(input2.getText().toString()); // height
        Double val = Math.PI * Math.pow(r, 2) * h;
        return val;
    }
    double calculateCube() {
        Double s = Double.valueOf(input1.getText().toString()); // side
        Double val = Math.pow(s, 3);
        return val;
    }
    double calculatePrism() {
        Double l = Double.valueOf(input1.getText().toString()); // l
        Double b = Double.valueOf(input2.getText().toString()); // b
        Double h = Double.valueOf(input3.getText().toString()); // h
        Double val = l * b * h;
        return val;

    }

    void calculateResult() {
        Double val;
        switch (position) {
            case 0:
                val = calculateSphere();
                break;
            case 1:
                val = calculateCylinder();
                break;
            case 2:
                val = calculateCube();
                break;
            case 3:
                val = calculatePrism();
                break;
            default:
                val = -1D;
        }
        String ans = "Result: " + String.format("%.2f", val);
        result.setText(ans);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculate_volume);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Intent intent = getIntent();
        position = intent.getIntExtra("position", 0);
        Toast.makeText(getApplicationContext(), "Position: " + position, Toast.LENGTH_SHORT).show();

        title = findViewById(R.id.title);
        input1 = findViewById(R.id.input_1);
        input2 = findViewById(R.id.input_2);
        input3 = findViewById(R.id.input_3);
        Button btn = findViewById(R.id.btn);
        result = findViewById(R.id.result);

        setUpUi();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
    }
}