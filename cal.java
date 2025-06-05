package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }

    public void calculate(View view) {
        double number1 = Double.parseDouble(num1.getText().toString());
        double number2 = Double.parseDouble(num2.getText().toString());
        double res = 0;

        switch (view.getId()) {
            case R.id.add:
                res = number1 + number2;
                break;
            case R.id.subtract:
                res = number1 - number2;
                break;
            case R.id.multiply:
                res = number1 * number2;
                break;
            case R.id.divide:
                if (number2 != 0) {
                    res = number1 / number2;
                } else {
                    result.setText("Error: Division by zero");
                    return;
                }
                break;
        }
        result.setText("Result: " + res);
    }
}
