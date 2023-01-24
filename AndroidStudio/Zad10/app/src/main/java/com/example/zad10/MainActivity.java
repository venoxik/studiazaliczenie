package com.example.zad10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private double firstNumber = 0;
    private double secondNumber = 0;
    private String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.result_textview);
    }

    public void onClickNumber(View view) {
        Button button = (Button) view;
        resultTextView.append(button.getText().toString());
    }

    public void onClickOperator(View view) {
        Button button = (Button) view;
        firstNumber = Double.parseDouble(resultTextView.getText().toString());
        currentOperator = button.getText().toString();
        resultTextView.setText("");
    }

    public void onClickEqual(View view) {
        secondNumber = Double.parseDouble(resultTextView.getText().toString());
        double result = 0;

        switch (currentOperator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }

        resultTextView.setText(String.valueOf(result));
    }

    public void onClickClear(View view) {
        firstNumber = 0;
        secondNumber = 0;
        currentOperator = "";
        resultTextView.setText("");
    }
}
