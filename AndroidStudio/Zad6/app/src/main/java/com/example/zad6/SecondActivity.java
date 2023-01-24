package com.example.zad6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String text1 = intent.getStringExtra("text1");
        String text2 = intent.getStringExtra("text2");

        textView.setText(text1 + " " + text2);
    }
}
