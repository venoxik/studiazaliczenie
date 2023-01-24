package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3;
    private TextView textView;
    private String text1 = "Kliknięto przycisk nr 1: Czerwony";
    private String text2 = "Kliknięto przycisk nr 2: Zielony";
    private String text3 = "Kliknięto przycisk nr 3: Niebieski";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        textView = (TextView) findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(text1);
                textView.setBackgroundColor(Color.RED);
                button1.setBackgroundColor(Color.RED);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(text2);
                textView.setBackgroundColor(Color.GREEN);
                button2.setBackgroundColor(Color.GREEN);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(text3);
                textView.setBackgroundColor(Color.BLUE);
                button3.setBackgroundColor(Color.BLUE);
            }
        });
    }
}