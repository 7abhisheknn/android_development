package com.example.d11_lucky_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {


    private void shareRes(String userName, int luckyNum) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, userName + " got lucky today");
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is: " + luckyNum);
        startActivity(Intent.createChooser(i, "Choose a Platform to Share"));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent i = getIntent();
        String userName = i.getStringExtra("name");

        int randomNumber = generateRandomNumber();

        Button resButton = findViewById(R.id.result);
        resButton.setText(String.valueOf(randomNumber));

        Button shareButton = findViewById(R.id.share);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareRes(userName, randomNumber);
            }
        });
    }
    private int generateRandomNumber() {
        Random random = new Random();
        int upperLimit = 100;
        int randomNumber = random.nextInt(upperLimit);
        return randomNumber;
    }
}