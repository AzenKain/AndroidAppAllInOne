package com.example.appandroidinone.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.example.appandroidinone.R;

public class Tuan1Calculator extends AppCompatActivity {

    EditText number1, number2;
    Button submit;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuan1_calculator_layout);

        number1 = findViewById(R.id.numberOne);
        number2 = findViewById(R.id.numberTwo);
        ans = findViewById(R.id.ans);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhTong();
            }
        });

        number1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetData(number1);
                }
            }
        });

        number2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetData(number2);
                }
            }

        });


    }
    private void resetData(EditText data) {
        data.setText("");
        ans.setText("");
    }

    private void tinhTong() {
        float so1 = Float.parseFloat(number1.getText().toString());
        float so2 = Float.parseFloat(number2.getText().toString());
        ans.setText(String.valueOf(so1 + so2));
    }
}
