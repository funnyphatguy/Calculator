package com.phannyfatgay.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumberEditText = findViewById(R.id.firstNumberEditText);
        EditText secondNumberEditText = findViewById(R.id.secondNumberEditText);
        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button multiButton = findViewById(R.id.multiButton);
        Button divisionButton = findViewById(R.id.divisionButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        plusButton.setOnClickListener(view -> {
            int firstNum = readTextNum(firstNumberEditText);
            int seconcNum = readTextNum(secondNumberEditText);
            int result = firstNum + seconcNum;
            resultTextView.setText(String.valueOf(result));
        });

        minusButton.setOnClickListener(view -> {
            int firstNum = readTextNum(firstNumberEditText);
            int seconcNum = readTextNum(secondNumberEditText);
            int result = firstNum - seconcNum;
            resultTextView.setText(String.valueOf(result));
        });

        multiButton.setOnClickListener(view -> {
            int firstNum = readTextNum(firstNumberEditText);
            int seconcNum = readTextNum(secondNumberEditText);
            int result = firstNum * seconcNum;
            resultTextView.setText(String.valueOf(result));
        });

        divisionButton.setOnClickListener(view -> {
            int firstNum = readTextNum(firstNumberEditText);
            int seconcNum = readTextNum(secondNumberEditText);
            double result = (double) firstNum / seconcNum;
            resultTextView.setText(String.valueOf(result));
        });

    }

    private int readTextNum(EditText editText) {
        String stringNum = editText.getText().toString();
        return Integer.parseInt(stringNum);
    }
}
