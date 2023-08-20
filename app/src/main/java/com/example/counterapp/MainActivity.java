package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.counterText);
        button = findViewById(R.id.btn);
        button.setOnClickListener(view -> {
            CounterSingleton.getInstance().increase();
            textView.setText(String.valueOf(CounterSingleton.getInstance().getValue()));
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.setText(String.valueOf(CounterSingleton.getInstance().getValue()));

    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.setText(String.valueOf(CounterSingleton.getInstance().getValue()));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.setText(String.valueOf(CounterSingleton.getInstance().getValue()));
    }
}