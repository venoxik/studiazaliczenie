package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private String[] sentences = {"Hello World!", "Welcome to my app!", "Have a nice day!", "Click again for another sentence."};
    private int currentSentence = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(view -> {
            currentSentence++;
            if (currentSentence == sentences.length) {
                currentSentence = 0;
            }
            textView.setText(sentences[currentSentence]);
        });
    }
}
