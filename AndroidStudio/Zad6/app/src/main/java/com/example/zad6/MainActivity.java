package com.example.zad6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst z pierwszego i drugiego pola tekstowego
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

                // Utwórz nowy Intent i przekazanie tekstu do drugiej aktywności
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("text1", text1);
                intent.putExtra("text2", text2);

                // Startuj druga aktywność
                startActivity(intent);
            }
        });
    }
}
