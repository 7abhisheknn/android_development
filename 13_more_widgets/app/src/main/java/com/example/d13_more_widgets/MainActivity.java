package com.example.d13_more_widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkbox;
    RadioGroup radioGroup;

    Spinner spinner;

    TimePicker timePicker;

    DatePicker datePicker;

    Button btn;
    Button progressBtn;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox = findViewById(R.id.checkbox);

        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Checkbox is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Checkbox is not checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(MainActivity.this, radioButton.getText().toString() + " this radio selected", Toast.LENGTH_SHORT).show();
            }
        });

        String[] courses = {"Java", "C++", "Python", "Android"};

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);

        spinner.setAdapter(adapter);


        timePicker = findViewById(R.id.timePicker);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, "Time= " + hourOfDay + " : " + minute, Toast.LENGTH_SHORT).show();
            }
        });

        datePicker = findViewById(R.id.datePicker);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = "Day: " + datePicker.getDayOfMonth();
                String month = "Month: " + datePicker.getMonth();
                String year = "Year: " + datePicker.getYear();
                System.out.println(day + ", " + month + ", " + year);
                Toast.makeText(MainActivity.this, day + ", " + month + ", " + year, Toast.LENGTH_SHORT).show();

            }
        });

        progressBar = findViewById(R.id.progressBar);
        progressBtn = findViewById(R.id.progessBtn);

        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setProgress(progressBar.getProgress() + 10);
            }
        });

    }
}