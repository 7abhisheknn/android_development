package com.example.d14_french_teacher_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackButton;
    Button redButton;
    Button yellowButton;
    Button purpleButton;
    Button greenButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackButton = findViewById(R.id.blackBtn);
        redButton = findViewById(R.id.redBtn);
        yellowButton = findViewById(R.id.yellowBtn);
        purpleButton = findViewById(R.id.purpleBtn);
        greenButton = findViewById(R.id.greenBtn);

        redButton.setOnClickListener(this);
        blackButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        purpleButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int clickeBtnId = v.getId();

        if (clickeBtnId == R.id.redBtn) {
            playSound(R.raw.red);
        } else if (clickeBtnId == R.id.blackBtn) {
            playSound(R.raw.black);
        }else if (clickeBtnId == R.id.greenBtn) {
            playSound(R.raw.green);
        }else if (clickeBtnId == R.id.yellowBtn) {
            playSound(R.raw.yellow);
        } else {

            playSound(R.raw.purple);
        }
    }
    public void playSound(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }

}