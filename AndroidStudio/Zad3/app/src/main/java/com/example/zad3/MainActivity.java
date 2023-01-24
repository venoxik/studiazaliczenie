package com.example.zad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count1 = 0;
    private int count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPhrase(View view) {
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();
    }

    public void countClick1(View view) {
        count1++;
        TextView textView = findViewById(R.id.text_count1);
        textView.setText("Licznik 1: " + count1);
    }

    public void countClick2(View view) {
        count2++;
        TextView textView = findViewById(R.id.text_count2);
        textView.setText("Licznik 2: " + count2);
    }
}
