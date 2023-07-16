package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.counterText);
        button = findViewById(R.id.btn);
        button.setOnClickListener(view -> {
           increaseCounter(textView);
        });
    }

    private void increaseCounter(TextView textView){
        ++counter;
        textView.setText(String.valueOf(counter));
    }
}